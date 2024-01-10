package word.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import word.Word;

public class FileServiceImp implements FileService{
	
	@Override
	public List<Word> load(String fileName){
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(fileName))) {
				return (List<Word>) ois.readObject();
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		}
		return null;
	}
	
	@Override
	public boolean save(String fileName, List<Word> list) {
		try(ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream(fileName))) {
				oos.writeObject(list);
		}catch(Exception e) {
			
		}
		return false;
	}

}
