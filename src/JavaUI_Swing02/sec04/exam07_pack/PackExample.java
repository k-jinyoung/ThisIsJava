package JavaUI_Swing02.sec04.exam07_pack;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PackExample extends JFrame {
	private JButton btnOk;
	private JButton btnCancel;
	
	//메인 윈도우 설정
	public PackExample() {
		this.setTitle("PackExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FlowLayout으로 변경하고 버튼 추가
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancel());
		
		//pack() 메소드 호출
		this.pack();
	}
		//ok 버튼 생성
		private JButton getBtnOk() {
			if(btnOk == null) {
				btnOk = new JButton();
				btnOk.setText("확인");
			}
			return btnOk;
		}
		
		private JButton getBtnCancel() {
			if(btnCancel == null) {
				btnCancel = new JButton();
				btnCancel.setText("취소");
			}
			return btnCancel;
		}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PackExample jFrame = new PackExample();
				jFrame.setVisible(true);
			}
		});

	}

}
