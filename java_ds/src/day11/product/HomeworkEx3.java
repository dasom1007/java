package day11.product;

public class HomeworkEx3 {

	/* 사이트에서 회원 관리(로그인, 회원가입 등)를 위한 Member 클래스를 작성 */
	
	//작성한 Member 클래스를 이용하여 인스턴스를 생성하고 구현한 메서드를 테스트
	public static void main(String[] args) {

	}
}

//필요한 멤버변수 및 메서드를 정리하고 구현
class Member{
	String name, id, password, login, join;
	//회원이름, 아이디, 비밀번호, 로그인, 회원가입

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getJoin() {
		return join;
	}

	public void setJoin(String join) {
		this.join = join;
	}
	
	/**
	 * 생성자
	 * @param name
	 * @param id
	 * @param password
	 * @param login
	 * @param join
	 */
	public Member(String name, String id, String password, 
			String login, String join) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.login = login;
		this.join = join;
	}
	
	public void loginprint() {
		System.out.println("아이디 : ");
	}
}





