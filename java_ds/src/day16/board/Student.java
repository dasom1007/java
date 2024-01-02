package day16.board;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Student implements Serializable {
	
	//private static final ling serialcodeUID
	
	@NonNull
	private int grade, classnum, num;
	@NonNull
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classnum == other.classnum && grade == other.grade && num == other.num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classnum, grade, num);
	}
}
