package view;

import java.awt.EventQueue;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import Helper.*;
import Model.Bashekim;

public class LoginGUI extends JFrame {
	private JPanel w_pane;
	private JTextField fld_hastaTc;
	private JTextField fld_doctorTc;
	private JPasswordField fld_doctorPass;
	private JPasswordField fld_hastaPass;
	private MsqlConnection conn= new MsqlConnection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Hastane Otomasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lbl_logo = new JLabel("LOGO");
		lbl_logo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_logo.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbl_logo.setBounds(189, 25, 100, 55);
		w_pane.add(lbl_logo);
		
		JLabel lblNewLabel = new JLabel("Hastane Yönetim Sistemine Hoşgeldiniz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 90, 466, 55);
		w_pane.add(lblNewLabel);
		
		JTabbedPane w_tabPane = new JTabbedPane(JTabbedPane.TOP);
		w_tabPane.setBounds(10, 135, 466, 218);
		w_pane.add(w_tabPane);
		
		JPanel w_hastaLogin = new JPanel();
		w_hastaLogin.setBackground(Color.WHITE);
		w_tabPane.addTab("Hasta Girişi", null, w_hastaLogin, null);
		w_hastaLogin.setLayout(null);
		
		JLabel lblTc = new JLabel("T.C. Numaranız:");
		lblTc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTc.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblTc.setBounds(40, 24, 176, 29);
		w_hastaLogin.add(lblTc);
		
		JLabel lblifreniz = new JLabel("Şifre:");
		lblifreniz.setHorizontalAlignment(SwingConstants.LEFT);
		lblifreniz.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblifreniz.setBounds(40, 72, 140, 30);
		w_hastaLogin.add(lblifreniz);
		
		fld_hastaTc = new JTextField();
		fld_hastaTc.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		fld_hastaTc.setBounds(202, 24, 227, 29);
		w_hastaLogin.add(fld_hastaTc);
		fld_hastaTc.setColumns(10);
		
		JButton btnNewButton = new JButton("Kayıt Ol");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnNewButton.setBounds(40, 137, 176, 44);
		w_hastaLogin.add(btnNewButton);
		
		JButton btnGiriYap = new JButton("Giriş Yap");
		btnGiriYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGiriYap.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnGiriYap.setBounds(253, 137, 176, 44);
		w_hastaLogin.add(btnGiriYap);
		
		fld_hastaPass = new JPasswordField();
		fld_hastaPass.setBounds(202, 72, 227, 30);
		w_hastaLogin.add(fld_hastaPass);
		
		JPanel w_doctorLogin = new JPanel();
		w_doctorLogin.setBackground(Color.WHITE);
		w_tabPane.addTab("Doctor Girişi", null, w_doctorLogin, null);
		w_doctorLogin.setLayout(null);
		
		JLabel lblTc_1 = new JLabel("T.C. Numaranız:");
		lblTc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTc_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblTc_1.setBounds(38, 10, 176, 29);
		w_doctorLogin.add(lblTc_1);
		
		fld_doctorTc = new JTextField();
		fld_doctorTc.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		fld_doctorTc.setColumns(10);
		fld_doctorTc.setBounds(200, 10, 227, 29);
		w_doctorLogin.add(fld_doctorTc);
		
		JLabel lblifreniz_1 = new JLabel("Şifre:");
		lblifreniz_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblifreniz_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblifreniz_1.setBounds(38, 58, 140, 30);
		w_doctorLogin.add(lblifreniz_1);
		
		JButton fld_doctorLogin = new JButton("Giriş Yap");
		fld_doctorLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_doctorTc.getText().length()==0 || fld_doctorPass.getText().length()==0) {
				Helper.showMsg("fill");
					
				}
				else {
					
					try {
						Connection con= conn.connMsql();
						Statement st= (Statement) con.createStatement();
						ResultSet rs=((java.sql.Statement) st).executeQuery("SELECT * FROM user");
						while(rs.next()) {
							if(fld_doctorTc.getText().equals(rs.getString("tcno")) && fld_doctorPass.getText().equals(rs.getString("password"))) {

								Bashekim bhekim =new Bashekim();
								bhekim.setId(rs.getInt("id"));
								bhekim.setPassword(rs.getString("password"));
								bhekim.setTcno(rs.getString("tcno"));
								bhekim.setName(rs.getString("name"));
								bhekim.setType(rs.getString("type"));
								System.out.println(bhekim.getName());
								
							}
								
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
				
			}
		});
		fld_doctorLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		fld_doctorLogin.setBounds(38, 123, 389, 44);
		w_doctorLogin.add(fld_doctorLogin);
		
		fld_doctorPass = new JPasswordField();
		fld_doctorPass.setBounds(200, 57, 227, 29);
		w_doctorLogin.add(fld_doctorPass);
	}
}
