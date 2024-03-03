package poly;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.*;

public class Javav {

	public static void main(String[] args) {
     double yukseklik,yaricap,hacim,alan;
	Scanner Scan =new Scanner(System.in);
	System.out.println("Silindirin yuksekligini giriniz");
	yukseklik=Scan.nextDouble();
	System.out.println("silindirin yaricapini giriniz");
	yaricap=Scan.nextDouble();
	alan=yaricap*yaricap*3.14;
	System.out.println("alan = " + alan);
	hacim=alan*yukseklik;
	System.out.println("hacminiz = " + hacim);
	}

}
