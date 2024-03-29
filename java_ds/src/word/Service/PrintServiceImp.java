package word.Service;

public class PrintServiceImp implements PrintService{
	
	@Override
	public void printMainMenu() {
		System.out.println("----------메뉴----------");
		System.out.println("1. 단어관리");
		System.out.println("2. 뜻");
		System.out.println("3. 조회");
		System.out.println("4. 게임");
		System.out.println("5. 종료");
		System.out.println("-----------------------");
		System.out.println("메뉴 선택 : ");
	}
	
	@Override
	public void printWordMenu{
		System.out.println("---------단어메뉴---------");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 이전으로");
		System.out.println("-----------------------");
		System.out.println("메뉴 선택 : ");
	}
	
	@Override
	public void printMeanMenu{
		System.out.println("---------의미메뉴---------");
		System.out.println("1. 의미 추가");
		System.out.println("2. 의미 수정");
		System.out.println("3. 의미 삭제");
		System.out.println("4. 이전으로");
		System.out.println("-----------------------");
		System.out.println("메뉴 선택 : ");

	}
	
	@Override
	public void printPrintMenu{
		System.out.println("---------조회메뉴---------");
		System.out.println("1. 전체 조회");
		System.out.println("2. 검색 조회");
		System.out.println("3. 이전으로");
		System.out.println("-----------------------");
		System.out.println("메뉴 선택 : ");

	}
	
	@Override
	public void printGameMenu{
		System.out.println("---------게임메뉴---------");
		System.out.println("1. 게임 시작");
		System.out.println("2. 오답 조회");
		System.out.println("3. 오답 초기화");
		System.out.println("4. 이전으로");
		System.out.println("-----------------------");
		System.out.println("메뉴 선택 : ");

	}

}
