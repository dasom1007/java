package day10.word;

public class Word {

	/*
	 * - Word클래스
	 * 		-word : 영단어
	 * 		-meaning : 뜻
	 * 	-단어 출력, 수정, 확인(주어진 문자열과 같은 단어인지) 기능
	 */
	
	//단어장 제목, 내용 정도
	private String word, meaning;
	private int num;
	public static int count = 0; //입력할 번호 증가
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Word.count = count;
	}
	
	/** 단어와 뜻을 출력하는 기능 */
	public void print() {
		System.out.println(word + " : " + meaning);
	}
	
	/** 뜻이 주어지면 뜻을 수정하는 기능
	 * @param meaning 수정할 뜻 
	 * @param meaning2 */
	public void update(String meaning, String meaning2) {
		this.meaning = meaning;
	}
	
	
	/** 단어가 주어지면 주어진 단어와 내 단어가 같은지 다른지를 알려주는 메서드
	 * @param word 같은지 다를지를 확인할 단어
	 * @return 주어진 word와 내 word가 같으면 true, 다르면 false 리턴 */
	public boolean equlas(String word) {
		return this.word.equals(word);
	}
	
	
	/** 생성자 
	 * @param wordNum */
	//주어진 단어와 뜻으로 단어와 뜻을 초기화 하는 생성자
    public Word (String word, String meaning) {
    	this.num = ++count;
    	this.word = word;
    	this.meaning = meaning;
    }

}
