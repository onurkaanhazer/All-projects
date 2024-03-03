import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

public class GirisSayfasi extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField editUserName;
	private JPasswordField editPasswordField;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisSayfasi frame = new GirisSayfasi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GirisSayfasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullanici Adi:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 74, 98, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sifre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(66, 153, 42, 13);
		contentPane.add(lblNewLabel_1);
		
		editUserName = new JTextField();
		editUserName.setBounds(152, 71, 153, 34);
		contentPane.add(editUserName);
		editUserName.setColumns(10);
		
		editPasswordField = new JPasswordField();
		editPasswordField.setBounds(152, 150, 153, 34);
		contentPane.add(editPasswordField);
		
		JButton btnLogin = new JButton("Giris Yap");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localHost:3306");
				}catch(Exception e) {
					
					
					System.out.println(e.getMessage());
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(43, 243, 126, 34);
		contentPane.add(btnLogin);
		
		btnReset = new JButton("Temizle");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editUserName.setText(null);
				editPasswordField.setText(null);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(179, 243, 126, 34);
		contentPane.add(btnReset);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
