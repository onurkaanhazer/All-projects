import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GirişSayfasi implements ActionListener{

	
	JFrame frame=new JFrame();
	JButton loginButton=new JButton("Giriş Yap");
	JButton resetButton=new JButton("Hepsini Sil");
	JTextField Kullaniciadibölümü=new JTextField();
	JPasswordField sifrebölümü=new JPasswordField();
	JLabel kullaniciadiLabel=new JLabel(" Adiniz:");
	JLabel kullaniciSifreLabel=new JLabel("Şifreniz:");
	JLabel	mesajLabel=new JLabel();
	HashMap<String,String> logininfo=new HashMap<String,String>();
	
	GirişSayfasi(HashMap<String,String> loginInfoOri){
		
		logininfo=loginInfoOri;
		kullaniciadiLabel.setBounds(50, 100, 75, 25);
		kullaniciSifreLabel.setBounds(50, 150, 75, 25);
		mesajLabel.setBounds(125, 250, 250, 35);
		mesajLabel.setFont(new Font(null,Font.ITALIC, 25));
		Kullaniciadibölümü.setBounds(125, 100,200 , 25);
		sifrebölümü.setBounds(125, 150, 200, 25);
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.addActionListener(this);
		loginButton.setFocusable(false);
		resetButton.setFocusable(false);
		
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(Kullaniciadibölümü);
		frame.add(sifrebölümü);
		frame.add(mesajLabel);
		frame.add(kullaniciadiLabel);
		frame.add(kullaniciSifreLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==resetButton) {
			Kullaniciadibölümü.setText("");
			sifrebölümü.setText("");
			mesajLabel.setText("");
			
		}
		else {
			String userID=Kullaniciadibölümü.getText();
			String Password=String.copyValueOf(sifrebölümü.getPassword());
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(Password)) {
					mesajLabel.setForeground(Color.green);
					mesajLabel.setText("Başarıyla giriş yaptınız");
					frame.dispose();
					KarsilamaSayfasi karsisayfa=new KarsilamaSayfasi();
				}
				
			}
			else {
				mesajLabel.setForeground(Color.red);
				mesajLabel.setText("Giriş başarısız");
			}
		}
		
	}
}
