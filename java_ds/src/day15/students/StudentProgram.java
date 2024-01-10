
package day15.students;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

//import day15.Student;

public class StudentProgram implements Program {
	
	private static Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	private List<Student> list = new ArrayList<Student>();

	@Override
	public void run() {
		
		int menu = 0;
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}
			catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
			case 1:
				studentManager();
				break;
				
			case 2:
				
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
				default:
					throw new InputMismatchException();
		}

	}

	private void studentManager() {
		
		printStudentMenu();

		int menu = scan.nextInt();
		
		runStudentMenu(menu);
	}
	
	private void printStudentMenu() {
		System.out.println("======학생 관리======");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("===================");
		System.out.print("메뉴 선택 :");
	}

	private void runStudentMenu(int menu) {
		switch(menu) {
		
		case 1:
			insertStudent();
			//이미 등록된 학생은 추가하지 않음(학년, 반, 번호가 같은 경우)
			break;
			
		case 2:
			//학생 수정
		updateStudent();
			break;
			
		case 3:
			//학생 삭제
			deleateStudent();
			break;
			
			default :
				throw new InputMismatchException();
		}
	}

	private void deleateStudent() {
		//삭제할 학생의 학년, 반, 번호, 이름을 입력
		System.out.print("학년 :");
		int grade = scan.nextInt();
		
		System.out.print("반 :");
		int classnum = scan.nextInt();
		
		System.out.print("번호 :");
		int num = scan.nextInt();
		
		System.out.print("이름 :");
		String name = scan.next();
		
		//입력한 정보가 있으면 해당 학생 삭제
		
	}

	private void updateStudent() {

		//기존 학년, 반, 번호를 입력
		System.out.print("학년 :");
		int grade = scan.nextInt();
		
		System.out.print("반 :");
		int classnum = scan.nextInt();
		
		System.out.print("번호 :");
		int num = scan.nextInt();
		
		System.out.print("이름 :");
		String name = scan.next();
		
		Student std = new Student(grade, classnum, num, name);
		//기존 학년, 반, 번호와 일치하는 학생 인스턴스를 가져옴
		int index = list.indexOf(std);

		//없으면 없다고 하고 종료
		if(index == -1) {
			System.out.println("등록되지 않은 학생입니다.");
			return;
		}
		
		std = list.get(index);//기존 학생 정보
		
		//수정할 학년, 반, 번호, 이름을 입력
		System.out.print("수정할 학년 :");
		grade = scan.nextInt();
		
		System.out.print("수정할 반 :");
		classnum = scan.nextInt();
		
		System.out.print("수정할 번호 :");
		num = scan.nextInt();
		
		System.out.print("수정할 이름 :");
		name = scan.next();
		
		//수정할 학생의 인스턴스를 생성
		Student newstd = new Student(grade, classnum, num, name);
		
		//수정할 학생 정보가 등록됐는지 확인해서 있으면 알림 후 종료
		if(list.contains(newstd)) {
			System.out.println("이미 등록된 학생 정보이어서 수정할 수 없습니다.");
			return;
		}
		
		//수정할 학생 인스턴스에 기존 학생 성적들을 업데이트 하고
		newstd.setKor(std.getKor());
		newstd.setEng(std.getEng());
		newstd.setMath(std.getMath());
		
		//기존 학생 정보를 삭제
		list.remove(index); //std도 가능
		
		//수정할 학생 정보를 리스트에 추가
		list.add(newstd);
		
		//정렬
		list.sort((o1,o2)-> {
			if(o1.getGrade() != o2.getGrade()) {
				return o1.getGrade() - o2.getGrade();
			}
			if(o1.getGrade() != o2.getGrade()) {
				return o1.getClassNum() - o2.getClassNum();
			}
			return o1.getNum() - o2.getNum();
		});
		System.out.println("학생 정보가 수정 되었습니다.");
	}

	private void insertStudent() {
		
		//학년, 반, 번호, 이름을 입력
		System.out.print("학년 :");
		int grade = scan.nextInt();
		
		System.out.print("반 :");
		int classnum = scan.nextInt();
		
		System.out.print("번호 :");
		int num = scan.nextInt();
		
		System.out.print("이름 :");
		String name = scan.next();
		
		//입력받은 정보로 인스턴스를 생성(std)
		Student std = new Student(grade, classnum, num, name);
		
		//std가 리스트에 있는지 확인해서 없으면 추가
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("학생을 등록 했습니다.");
			return;
		}
		
		//contains는 objects.equals(a, b)를 호출해서 a와 b의 클래스가 같으면
		//a.equals(b)를 이용하여 있는지 없는지 확인
		
		//있으면 이미 등록됐다고 알림
		System.out.println("이미 등록 된 학생입니다.");
	}

	private void SubMenu2() {
		System.out.println("======성적 관리======");
		System.out.println("1. 성적 조회 ");
		System.out.println("2. 돌아가기");
		System.out.println("===================");
		System.out.print("메뉴 선택 :");
		
	}

	@Override
	public void printMenu() {
		System.out.println("===================");
		System.out.println("1. 학생 관리 ");
		System.out.println("2. 성적 관리");
		System.out.println("3. 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("===================");
		System.out.print("메뉴 선택 :");
	}
	
	public static void print(List<Student> list, Consumer<Student> consumer) {
		for(Student student : list) {
			consumer.accept(student);
		}
	}

	}
