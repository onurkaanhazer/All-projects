package Tetriss;

import java.util.Random;

import Tetriss.Kutucuk.Kutucuklar;

public class KutucukHareketleri {
    private Tahta oyunTahtasi;
    private Kutucuk secilenKutucuk;
    private int baslangicSutun;
    
    public KutucukHareketleri(Tahta tahta) {
    	this.oyunTahtasi=tahta;
    }
    public void yeniKutucukEkle() {
    	Random random=new Random();
    	secilenKutucuk=Kutucuklar.TUM_KUTUCUKLAR[random.nextInt(Kutucuklar.TUM_KUTUCUKLAR.length)];
    	baslangicSutun=oyunTahtasi.getTahtaGenislik()/2 - secilenKutucuk.getMatris()[0].length/2;
    	oyunTahtasi.kutucuguEkle(secilenKutucuk, 0, baslangicSutun);
    }
    public boolean kutucuguAsagiDusur() {
    	boolean basarili=oyunTahtasi.ku 
    }
    
}
