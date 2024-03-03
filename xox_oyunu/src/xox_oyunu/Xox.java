package xox_oyunu;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Xox implements ActionListener{
    
	Random random=new Random();
	JFrame frame=new JFrame();
	JPanel title_panel=new JPanel();
	JPanel button_panel=new JPanel();
	JLabel textfield=new JLabel();
	JButton[] buttons=new JButton[9];
	boolean player1_turn;
	
	
	Xox(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Times New Roman",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("X-O-X Oyunu");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(0,50,158,168));
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("Times New Roman",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		
		firstTurn();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++) {
        	if(e.getSource()==buttons[i]) {
        		if(player1_turn==true) {
        			if(buttons[i].getText()=="") {
        				buttons[i].setForeground(new Color(255,0,0));
        				buttons[i].setText("X");
        				player1_turn=false;
        				textfield.setText("Y oyuncusunun sırası");
        				check();
        			}
        			
        		}
        		else {
        			if(buttons[i].getText()=="") {
        				buttons[i].setForeground(new Color(0,0,255));
        				buttons[i].setText("Y");
        				player1_turn=true;
        				textfield.setText("X oyuncusnun sırası");
        				check();
        			}
        			
        		}
        	}
        }
        
		 
	}
	
	public void firstTurn(){
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X oyuncusunun sırası");
		}
		else {
				player1_turn=false;
		textfield.setText("Y oyuncusunun sırası");
		}
		
		
	}
	
	public void check() {
		if((buttons[0].getText()=="X")&& (buttons[1].getText()=="X") && (buttons[2].getText()=="X")) {
			xWins(0,1,2);
			
		}
		else if((buttons[3].getText()=="X")&& (buttons[4].getText()=="X") && (buttons[5].getText()=="X")) {
			xWins(3,4,5);
		}
		else if((buttons[6].getText()=="X")&& (buttons[7].getText()=="X") && (buttons[8].getText()=="X")) {
			xWins(6,7,8);
	    }
		else if((buttons[0].getText()=="X")&& (buttons[3].getText()=="X") && (buttons[6].getText()=="X")) {
			xWins(0,3,6);
		}
		else if((buttons[1].getText()=="X")&& (buttons[4].getText()=="X") && (buttons[7].getText()=="X")) {
			xWins(1,4,7);
		}
		else if((buttons[2].getText()=="X")&& (buttons[5].getText()=="X") && (buttons[8].getText()=="X")) {
			xWins(2,5,8);
		}
		else if((buttons[0].getText()=="X")&& (buttons[4].getText()=="X") && (buttons[8].getText()=="X")) {
			xWins(0,4,8);
		}
		else if((buttons[2].getText()=="X")&& (buttons[4].getText()=="X") && (buttons[6].getText()=="X")) {
			xWins(2,4,6);
		}
		// y kısmı
		
		
		if((buttons[0].getText()=="Y")&& (buttons[1].getText()=="Y") && (buttons[2].getText()=="Y")) {
			yWins(0,1,2);
			
		}
		else if((buttons[3].getText()=="Y")&& (buttons[4].getText()=="Y") && (buttons[5].getText()=="Y")) {
			yWins(3,4,5);
		}
		else if((buttons[6].getText()=="Y")&& (buttons[7].getText()=="Y") && (buttons[8].getText()=="Y")) {
			yWins(6,7,8);
	    }
		else if((buttons[0].getText()=="Y")&& (buttons[3].getText()=="Y") && (buttons[6].getText()=="Y")) {
			yWins(0,3,6);
		}
		else if((buttons[1].getText()=="Y")&& (buttons[4].getText()=="Y") && (buttons[7].getText()=="Y")) {
			yWins(1,4,7);
		}
		else if((buttons[2].getText()=="Y")&& (buttons[5].getText()=="Y") && (buttons[8].getText()=="Y")) {
			yWins(2,5,8);
		}
		else if((buttons[0].getText()=="Y")&& (buttons[4].getText()=="Y") && (buttons[8].getText()=="Y")) {
			yWins(0,4,8);
		}
		else if((buttons[2].getText()=="Y")&& (buttons[4].getText()=="Y") && (buttons[6].getText()=="Y")) {
			yWins(2,4,6);
		}
	}
	
	public void xWins(int a,int b,int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X kazandı");
	}
	
    public void yWins(int a,int b,int c) {
    	buttons[a].setBackground(Color.RED);
		buttons[b].setBackground(Color.RED);
		buttons[c].setBackground(Color.RED);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("Y kazandı");
		
	}


}
