package JavaUI_Swing02.sec07.exam01_jlabel;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class JLabelExample extends JFrame {
	private JLabel jLabel1, jLabel2, jLabel3, jLabel4;
	
	//메인 윈도우 설정
	public JLabelExample() {
		this.setTitle("JLabelExample");
		//레이아웃(그리드레이아웃) 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(4, 1));
		
		//레리아웃에 레이블  추가(4개)
		this.getContentPane().add(getJLabel1());
		this.getContentPane().add(getJLabel2());
		this.getContentPane().add(getJLabel3());
		this.getContentPane().add(getJLabel4());
		this.setSize(200, 300);
	}
	
	public JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("JLabel1");
			jLabel1.setHorizontalAlignment(JLabel.LEFT);
			jLabel1.setBorder(new EtchedBorder());
		}
		return jLabel1;
	}
	
	public JLabel getJLabel2() {
		if(jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("JLabel2");
			jLabel2.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel2.setHorizontalAlignment(JLabel.CENTER);
			jLabel2.setBorder(new EtchedBorder());
		}
		return jLabel2;
	}
	
	//이미지, 텍스트는 이미지의 왼쪽에 표기
	public JLabel getJLabel3() {
		if(jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("JLabel3");
			jLabel3.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel3.setHorizontalAlignment(JLabel.CENTER);
			jLabel3.setHorizontalTextPosition(JLabel.LEFT);			//텍스트가 이미지의 왼쪽에 표기
			jLabel3.setBorder(new EtchedBorder());
		}
		return jLabel3;
	}
	
	//이미지와 텍스트 사이의 간격 설정
	public JLabel getJLabel4() {
		if(jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("JLabel3");
			jLabel4.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel4.setHorizontalAlignment(JLabel.CENTER);
			jLabel4.setIconTextGap(20);
			jLabel4.setBorder(new EtchedBorder());
		}
		return jLabel4;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
			public void run() {
				JLabelExample jFrame = new JLabelExample();
				jFrame.setVisible(true);
			}
		});
	}
}
