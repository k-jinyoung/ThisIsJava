package chapter_19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		try {
			//Socket 생성과 동시에 localhost의 50001 port로 연결 요청;
			Socket socket = new Socket("172.20.20.1", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			
			//데이터 보내기
			String sendMessage = "은지짱 헤헤헿";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
			
			
			
			//Socket 닫기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		} catch (UnknownHostException e) {
			//IP 표기 방법이 잘못되었을 경우
		}catch(IOException e) {}
			//해당 포트의 서버에 연결할 수 없는 경우
	}
}
