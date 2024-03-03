package demem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HesapMakinesi {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Hesap Makinesi");
        JLabel l1, l2;
        JTextField t1, t2, t3;
        JButton btn;

        l1 = new JLabel("İlk Sayı");
        l1.setBounds(10, 10, 100, 30);

        // İlk sayının giriş alanı
        t1 = new JTextField();
        t1.setBounds(120, 10, 200, 30);

        // İkinci sayının giriş alanı
        t2 = new JTextField();
        t2.setBounds(120, 50, 200, 30);

        // Sonuç alanı
        t3 = new JTextField();
        t3.setBounds(120, 130, 200, 30);
        t3.setEditable(false);

        // Toplama işlemi butonu
        btn = new JButton("Toplama");
        btn.setBounds(180, 90, 80, 30);

        // Frame'e bileşenleri ekleme
        f.add(l1);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(btn);

        // Frame ayarları
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
