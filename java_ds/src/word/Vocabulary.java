package word;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

//단어장
@Getter
@ToString
public class Vocabulary {
	
	private List<Word> list;//단어 리스트

	public Vocabulary(List<Word> list) {
		if(list == null) {
			list = new ArrayList<Word>();
		}
		this.list = list;
	}
	
	//단어 추가 기능
	public boolean addWord(String word, String partOfSpeech, String mean) {
		if(list == null) {
			return false;
		}
		//이미 등록된 단어이고, 뜻도 등록되었으면
		int index = list.indexOf(new Word(word));
		if(index >= 0 && list.get(index).getMeanList().contains(new Mean(mean))) {
			return false;
		}
		//이미 등록된 단어이면
		if(index >= 0) {
			list.get(index).addMean(partOfSpeech, mean);
			return true;
		}
		//새로 추가된 단어이면
		list.add(new Word(word, partOfSpeech, mean));
		
		return true;
	}
	
		if(count == 0) {
			return false;
		}
		newMeanList.stream().filter(m->!selectedMeans.contains(m))
		.forEach(m->selectedMeans.add(m));
		return true;
	
	
	//단어 수정 기능
	public boolean setWord(String oldWord, String newWord) {
		
		//list가 없으면
		if(list == null) {
			return false;
		}
		//이미 등록된 단어이면
		if(list.contains(new Word(newWord))) {
			return false;
		}
		//수정할 단어가 없는 단어이면
		int index = list.indexOf(new Word(oldWord));
		if(index < 0) {
			return false;
		}
		//수정
		list.get(index).setWord(newWord);
		return true;
	}
	//단어 삭제 기능
	public boolean removeWord(String word) {
		//리스트가 비어 있으면
		if(list == null) {
			return false;
		}
		//삭제 후 삭제 여부를 리턴
		return list.remove(new Word(word));
	}
	
	public boolean addMean(String word, String patrOfSpeech, String mean) {
}


		//list가 비엇으면
		if(list == null) {
			return false;
		}
		int index = list.indexOf(new Word(word));
		//단어가 없으면
		if(index < 0) {
			return false;
		}
}
		//단어의 뜻을 추가 후 성공 여부를 알려줌
		Word selectedWord = list.get(index);
		int meanIndex = selectedWord.addMean(partOfSpeech, mean);

		public Word getWord(String word) {
			// TODO Auto-generated method stub
			return null;
		}

		public void print() {
			
			
		}

		public void print(String word) {
			int count = 
					(int) list.stream()
						.filter(w->w.getWord()
							.contains(word))
								.count();
			if(count == 0) {
				System.out.println("일치하는 단어가 없습니다.");
				return;
			}
			list.stream()
				//word가 포함된 객체들만 필터링 함
				.filter(w->w.getWord().contains(word))
				.forEach(w->w.printWord());
			
		}
		
		public void print() {
			print("");
		}

		public Collection<? extends Word> getList() {
			// TODO Auto-generated method stub
			return null;
		}
		if(selectedWord.setMean(index, ))
		
		return false;
	}
