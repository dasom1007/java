package day18.socket1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
	private Socket socket;
	
	public void receive() {
		Thread t = new Thread(()-> {
			ObjectInputStream ois = null;
			try { ois = new ObjectInputStream(socket.getInputStream());
				while(true) {
					String str = ois.readUTF();
					if(str.equals("-1")) {
						break;
					}
					System.out.println(str);
				}
				System.out.println("읽기 기능이 정상 종료");
			}catch (Exception e) {
				System.out.println("예외가 발생해서 읽기 기능을 종료");
			}
		});
		t.start();
		
		/*Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
					
			}	
		});*/
	}
	public void send() {
		Thread t = new Thread(()-> {
			ObjectOutputStream oos = null;;
			try{
				oos = new ObjectOutputStream(socket.getOutputStream());
				Scanner scan = new Scanner(System.in);
				while(true) {
					String str = scan.nextLine();
					oos.writeUTF(str);
					oos.flush();
					if(str.equals("-1")){
						break;
					}
				}
			}catch(Exception e){
				System.out.println("예외가 발생해서 전송기능 종료");
			} 
		});
		t.start();		
	}
}
