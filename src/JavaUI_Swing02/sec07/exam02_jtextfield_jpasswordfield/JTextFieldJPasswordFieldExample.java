package JavaUI_Swing02.sec07.exam02_jtextfield_jpasswordfield;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;				//리스너 -> 구현	: 모든것(하나만 있는거)
import java.awt.event.KeyAdapter;					//아답터 -> 상속 : 하나만(여러개 중 하나만 선택 가능)
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextFieldJPasswordFieldExample extends JFrame {
	private JTextField txtId;
	private JPasswordField txtPassword;
	
	public String checkId = "winter";
	public String checkPw = "12345";
	

	
	public  JTextFieldJPasswordFieldExample() {
		this.setTitle("JTextField & JPasswordField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2, 2));
		this.getContentPane().add(new JLabel("아이디", JLabel.CENTER));
		this.getContentPane().add(getTxtId());
		this.getContentPane().add(new JLabel("패스워드", JLabel.CENTER));
		this.getContentPane().add(getTxtPassword());
		this.setSize(200, 100);
		}
	
	public JTextField getTxtId() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Id = new String(txtId.getText());
					if (checkId.equals(Id)) {
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, "입력한 아이디: " + Id + "\n 아이디가 일치합니다.");
					} else {
						JOptionPane.showMessageDialog(null, "아이디가 불일치 합니다.");
					}										
				}
			});
			/*txtId.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, "알파벳 이군요");
					} else {
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, "알파벳이 아니군요");
					}
				}
			});*/
		}
		return txtId;
	}
	
	public JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String password = new String(txtPassword.getPassword());	//패스워드 입력된 내용 가져오기
					if (checkPw.equals(password)) {
					JOptionPane.showMessageDialog(
							JTextFieldJPasswordFieldExample.this, "입력한 패스워드: " + password + "\n 비밀번호가 일치합니다."); 		
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호가 불일치합니다.");
					}
				}
			});
		}
		return txtPassword;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextFieldJPasswordFieldExample jFrame = new JTextFieldJPasswordFieldExample();
				jFrame.setVisible(true);
			}
		});
	}
}
