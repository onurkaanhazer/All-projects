package Tetriss;
import Tetriss.Tahta;
import javax.swing.JFrame;

public class Ana {

	public static void main(String[] args) {
	
		JFrame frame=new JFrame("Tetris");
		Tahta tahta1=new Tahta();
		frame.add(tahta1);
		frame.setSize(tahta1.getTahtaGenislik()*tahta1.getKareBoyutu(),tahta1.getTahtaYükseklik()*tahta1.getKareBoyutu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
