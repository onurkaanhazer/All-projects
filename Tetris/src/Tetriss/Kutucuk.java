package Tetriss;

public class Kutucuk {
	private int [][] matris;
	private int renkKodu;
	
	public Kutucuk(int [][] matris,int renkKodu) {
		this.matris=matris;
		this.renkKodu=renkKodu;
	}

	public int[][] getMatris() {
		return matris;
	}

	public int getrenkKodu() {
		return renkKodu;
	}
	public static class Kutucuklar {

	    public static final Kutucuk[] TUM_KUTUCUKLAR = {
	    
	        new Kutucuk(new int[][]{{1, 1, 1, 1}}, 0xFFA500),
	        
	  
	        new Kutucuk(new int[][]{{1, 1, 1}, {0, 0, 1}}, 0x0000FF),
	        
	
	        new Kutucuk(new int[][]{{1, 1, 1}, {1, 0, 0}}, 0xFFD700),
	        
	 
	        new Kutucuk(new int[][]{{1, 1}, {1, 1}}, 0xFF0000),
	        

	        new Kutucuk(new int[][]{{0, 1, 1}, {1, 1, 0}}, 0x008000),
	        
	   
	        new Kutucuk(new int[][]{{1, 1, 0}, {0, 1, 1}}, 0x800080),
	        
	     
	        new Kutucuk(new int[][]{{1, 1, 1, 1, 1}}, 0xFFC0CB),
	        
	     
	        new Kutucuk(new int[][]{{1, 1, 1}, {1, 1, 1}}, 0xFF4500),
	        
	    
	    };
	}

	

}
