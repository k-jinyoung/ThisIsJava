package chapter_21.sec02.exam01_invokeLater.copy;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//JFrame 상속
public class App extends JFrame {
	public App() {
		//제목 설정
		setTitle("Swing App");
		//윈도우 크기설정
		setSize(300, 100);
		//윈도우 종료 버튼을 클릭하면 프로세스 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// 이벤트 큐에 Runnable 넣기
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//윈도우 생성
				App app = new App();
				//윈도우를 보여줌
				app.setVisible(true);
				System.out.println(Thread.currentThread().getName());
			}
		});
	}
}
