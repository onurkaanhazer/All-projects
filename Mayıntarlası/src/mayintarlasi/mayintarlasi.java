package mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class mayintarlasi {
    int rownumber, colnumber;
    int size;
    int[][] map;
    int[][] board;
    boolean game= true;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    mayintarlasi(int rownumber, int colnumber) {
        this.rownumber = rownumber;
        this.colnumber = colnumber;
        this.map = new int[rownumber][colnumber];
        this.board = new int[rownumber][colnumber];
        this.size = rownumber * colnumber;
    }

    public void preparegame() {
        int randrow, randcol, count = 0;
        while (count != size / 4) {
            randrow = rand.nextInt(rownumber);
            randcol = rand.nextInt(colnumber);
            if (map[randrow][randcol] != -1) {
                map[randrow][randcol] = -1;
                count++;
            }
        }
    }

    public void run() {
    	int row,col;
        preparegame();
        print(this.map);
        System.out.println("oyun basladi!");
        while(this.game) {
        	print(this.board);
        	System.out.println("satir giriniz");
        	row=scan.nextInt();
        	System.out.println("sütun giriniz");
        	col=scan.nextInt();
        	if(map[row][col]!=-1) {
        		checkmayin(row,col);
        	}
        	else {
        		this.game=false;
        		System.out.println("oyun bitti kaybettiniz");
        	}
        			
        
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void checkmayin(int r,int c) {
    	if(this.board[r][c]==0) {
    		if((c<this.colnumber-1) && (this.map[r][c+1]==-1)) {
    		this.board[r][c+1]++;
    	}
    	if(	(r<this.rownumber-1)&&(this.map[r][c-1]==-1)) {
    		this.board[r][c-1]++; 	
    }
    	if(this.map[r-1][c]==-1) {
    		this.board[r-1][c]++;
    	}
    	if(this.map[r+1][c]==-1) {
    		this.board[r+1][c]++;
    	}
    	}
    	
    	
   
    	
    	
    	
    	
    	
   
}
}
