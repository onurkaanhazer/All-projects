package kaan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ortala extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ortala frame = new ortala();
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
	public ortala() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ortalama hesaplayan uygulamaya hoşgeldiniz");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(138, 23, 315, 41);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("Not 1 :");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l1.setBounds(116, 129, 91, 34);
		contentPane.add(l1);
		
		textField = new JTextField();
		textField.setBounds(217, 138, 113, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel l2 = new JLabel("Not 2 :");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l2.setBounds(116, 190, 91, 34);
		contentPane.add(l2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 196, 113, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int not1 = Integer.parseInt(textField.getText());
			        int not2 = Integer.parseInt(textField_1.getText());
			        double ortalama = (not1 * 0.40) + (not2 * 0.60);
			        
			        System.out.println("Ortalama: " + ortalama);
			        if(ortalama<50) {
			        	System.out.println(" başarısız");
			        }
			        else if(ortalama>50 && ortalama<80) {
			        	System.out.println("Orta");
			        }
			        else
			        	System.out.println("Başarılı");
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(203, 253, 137, 41);
		contentPane.add(btnNewButton);
	}
}
