package day18.board;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentProgram implements Program {
	
	private static Scanner scan = new Scanner (System.in);
	private final int EXIT = 4;
	private StudentManager sm = new StudentManager();
	private Socket socket;
	
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public void run() {
		String ip = "192.168.30.188";
		int port = 5001;
		//서버와 연결
		connectServer(ip, port);
		//서버에서 학생 정보를 불러옴
		load();
		int menu = 0;
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				runMenu(menu);
				
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();
			}
		}while(EXIT != 4);
	}

	private void load() {
		if(socket == null) {
			System.out.println("서버에 연결 되지 않아 불러올 수 없습니다.");
			
		}
		try {
			oos.writeUTF("LOAD");
			oos.flush();
			//읽어옴
			List<Student> list = (List<Student>)ois.readObject();
			sm = new StudentManager(list);
			System.out.println("불러오기 성공");
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("불러오기 중 예외가 발생 했습니다.");
		}
	}

	private void connectServer(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			System.out.println(socket);
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			System.out.println("서버 연결 성공");
		} catch (IOException e) {
			System.out.println("서버 연결 실패");
		}
	}

	private void searchStudent() {
		sm.searchStudent();
		return;
	}

	private void insertStudent() {
		
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classnum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		String name = scan.next();
		
		Student std = new Student(grade, classnum, num, name);
		
		if(sm.insertStudent(std)) {
			System.out.println("학생을 등록 했습니다.");
			sendStudent(std);
			return;
		}else {
		System.out.println("이미 등록 된 학생입니다.");
		}
	}
	

	private void sendStudent(Student std) {
		
		if(socket == null) {
			System.out.println("서버에 연결 되지 않아 서버에 학생 정보를 추가 할 수 없습니다.");
		}
		try {
			oos.writeUTF("INSERT");
			oos.flush();
			oos.writeObject(std);
			oos.flush();
			
			System.out.println("서버에 학생 추가 성공");
		} catch (IOException e) {
			System.out.println("서버에 학생 추가 중 예외가 발생 했습니다.");
		}
	}

	public void printMenu() {
		System.out.println("-------------");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 목록 조회");
		System.out.println("3. 학생 수정");
		System.out.println("4. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		
		case 1: 
			insertStudent();
			break;
		case 2: 
			searchStudent();
			break;
			
		case 3:
			updateStudent();
			break;
			
		case 4: 
			exit();
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default :
			throw new InputMismatchException();
		}
	}

	private void updateStudent() {
		//학생 정보 입력
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classnum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		String name = scan.next();
		
		//학생 정보 수정
		Student std = new Student(grade, classnum, num, name);
		if(sm.updateStudent(std)) {
			System.out.println("이름을 수정했습니다.");
			sendUpdateStudent(std);
		} else {
			System.out.println("등록되지 않은 학생입니다.");
		}

	}

	private void sendUpdateStudent(Student std) {
		try {
			oos.writeUTF("UPDATE");
			oos.flush();
			oos.writeObject(std);
			oos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void exit() {
		try {
			oos.writeUTF("SAVE");
			oos.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
