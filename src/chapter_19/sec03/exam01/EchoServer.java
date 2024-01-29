package chapter_19.sec03.exam01;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) {
        final int PORT_NUMBER = 50080;

        try {
            ServerSocket serverSocket = new ServerSocket(PORT_NUMBER);
            System.out.println("서버가 " + PORT_NUMBER + " 포트에서 대기 중...");
 
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트가 연결되었습니다.");
 
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();
 
            Scanner scanner = new Scanner(System.in);
 
            Thread receiveThread = new Thread(() -> {
                try {
                    while (true) {
                        byte[] buffer = new byte[1024];
                        int bytesRead = inputStream.read(buffer);
                        String receivedMessage = new String(buffer, 0, bytesRead);
                        System.out.println("상대방: " + receivedMessage);

                        if (receivedMessage.equals("q")) {
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();
 
            while (true) {
                String sendMessage = scanner.nextLine();
                outputStream.write(sendMessage.getBytes());

                if (sendMessage.equals("q")) {
                    break;
                }
            }
 
            receiveThread.join();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}