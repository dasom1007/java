package day16.board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class StudentProgram implements Program {

	static Scanner scan = new Scanner(System.in);
	private final int EXIT = 3;
	private static List<Student> list = new ArrayList<Student>();
	
	public void run() {
		
		
		int menu = 0;
		String fileName = "src/day16/student/list.txt";
		load(fileName);
		
		do {
				printMenu();
				try {
				menu = scan.nextInt();
			
				runMenu(menu);
				}
				catch(Exception e) {
					System.out.println("잘못된 메뉴입니다.");
					scan.nextLine();
				}
		}while(menu != EXIT);
		
		save(fileName);
	}
	
	
	private void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		}
		
	}


	private void load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (List<Student>)ois.readObject();
			System.out.println("학생 정보를 불러왔습니다.");
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		}
		
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
			System.out.println("프로그램을 종료합니다.");
			break;
			
			default :
				throw new InputMismatchException();
		}
	}
	
	private void searchStudent() {
		printStudent();
		
	}
	
	private static void printStudent() {
		list.stream().forEach(s->System.out.println(s));
		}
	

	private void insertStudent() {
		int grade, classnum, num;
		String name;
		
		System.out.println("학년 :");
		grade = scan.nextInt();
		
		System.out.println("반 :");
		classnum = scan.nextInt();
		
		System.out.println("번호 :");
		num = scan.nextInt();
		
		System.out.println("이름 :");
		name = scan.next();
		
		Student std = new Student(grade, classnum, num, name);
		
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("학생을 등록했습니다.");
			
			//파일에 저장
			return;
		}
		System.out.println("이미 등록된 학생입니다.");
	}


	@Override
	public void printMenu() {
		System.out.println("=================");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회");
		System.out.println("3. 종료");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
		
	}
}


