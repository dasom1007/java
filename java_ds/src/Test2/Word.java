package Test2;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Word {
	
	private String word, mean;
	//단어 뜻

	public void addMean(String mean) {
		this.mean = mean;
}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}

	public void removeMean(String stdMean) {
		// TODO Auto-generated method stub
		
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	public String getSearchNum() {
		// TODO Auto-generated method stub
		return null;
	}

	public Word(String word, char type) {
		// TODO Auto-generated constructor stub
	}

	public void searchWord() {
		// TODO Auto-generated method stub
		
	}
}