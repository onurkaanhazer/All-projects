package Kaan;

public class SatrançTahtasi {
  private  String [][] tahta;
  
  public SatrançTahtasi() {
	  tahta= new String[8][8];
	  baslangicTahtasiOlustur();
	  
  }
  private void baslangicTahtasiOlustur() {
	  for(int i=0;i<8;i++) {
		  for(int j=0;j<8;j++) {
			  if((i+j)%2==0) {
				  tahta[i][j]="Beyaz";
			  }
			  else
				  tahta[i][j]="Siyah";
		  }
	  }
	  for(int i=1;i<8;i+=2) {
		  tahta[1][i]="Piyon Beyaz";
		  tahta[6][i]="Piyon Siyah";
	  }
	  for(int k=0;k<8;k+=2) {
		  tahta[1][k]="Piyon Siyah";
		  tahta[6][k]="Piyon Beyaz";
	  }
	  
	  tahta[0][0]="Kale Beyaz";
	  tahta[0][7]="Kale Beyaz";
	  tahta[0][1]="At Beyaz";
	  tahta[0][6]="At Beyaz";
	  tahta[0][2]="Fil Beyaz";
	  tahta[0][5]="Fil Beyaz";
	  tahta[0][3]="Şah Beyaz";
	  tahta[0][4]="Vezir Beyaz";
	  
	  
	  tahta[7][0]="Kale Siyah";
	  tahta[7][7]="Kale Siyah";
	  tahta[7][1]="At Siyah";
	  tahta[7][6]="At Siyah";
	  tahta[7][2]="Fil Siyah";
	  tahta[7][5]="Fil Siyah";
	  tahta[7][3]="Şah Siyah";
	  tahta[7][4]="Vezir Siyah";
	  
  }
  public void TahtayiGöster() {
	  for(int i=0;i<8;i++) {
		  for(int k=0;k<8;k++) {
			  System.out.print(tahta[i][k]+"\t");
		  }
		  System.out.println();
	  }
  }
}
