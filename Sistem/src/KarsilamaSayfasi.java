import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KarsilamaSayfasi {

	
	JFrame frame=new JFrame();
	JLabel wlclabel=new JLabel("Hoşgeldiniz");
	
	
	KarsilamaSayfasi(){
		
		wlclabel.setBounds(0, 110, 100, 35);
		wlclabel.setFont(new Font(null, Font.PLAIN, 25));
		
		frame.add(wlclabel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
	}
}
