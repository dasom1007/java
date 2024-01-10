package day18.board;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Student implements Serializable{
	
	private static final long serialVersionUID = 32412531531251235L;
	int grade, classnum, num;
	String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(classnum, grade, num);
	}
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
	public String toString() {
		return "["+ grade + "학년 " + classnum + "반 " + num + "]";
	}

}
