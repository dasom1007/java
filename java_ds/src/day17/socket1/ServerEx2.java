package day17.socket1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerEx2 {

	public static void main(String[] args) {
		//1. 서버의 포트번호 정함
		int port = 5001;
		ArrayList<String> list = new ArrayList<String>();
		
		
		try {
			//2. 서버용 소켓 객체 생성
			serversocket = new ServerSocket(port);
			
			//3. 대기
			//4. 요청 수락 후 소켓 객체 생성
			Socket socket = serversocket.accept();
			//5. 작업
			
	
		} catch (IOException e) {
			
		}
	
	}


}
