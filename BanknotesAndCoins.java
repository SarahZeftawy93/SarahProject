/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banknotes.and.coins;

import java.util.Scanner;

/**
 *
 * @author Sarah Elzeftawy
 */
public class BanknotesAndCoins {

	/**
	 * @param args the command line arguments
	 * 
	 */
	public static void main(String[] args) {
		int a,b,c,d,e,f,g,temp;
		double x,y,z,i,j;
		int n;
		double num;
		double t;
		Scanner in = new Scanner(System.in);
		num = in.nextDouble();
		n=(int) num;
		
		a=n/100;
		temp=n-(100*a);
		b=temp/50;
		temp-=(50*b);
		c=temp/20;
		temp-=(20*c);
		d=temp/10;
		temp-=(10*d);
		e=temp/5;
		temp-=(5*e);
		f=temp/2;
		temp-=(2*f);
		g=temp;
		
		t=(num-n);
		x = t/.5;
		t-=(.5*(int)x);
		y=t/.25;
		t-=(.25*(int)y);
		z=t/.1;
		t-=(.1*(int)z);
		i=t/.05;
		t-=((int)i*.05);
		j=t/.01;
		
		//print
		System.out.println("NOTAS:");
		System.out.println(a + " nota(s) de R$ 100.00");
		System.out.println(b + " nota(s) de R$ 50.00");
		System.out.println(c + " nota(s) de R$ 20.00");
		System.out.println(d + " nota(s) de R$ 10.00");
		System.out.println(e + " nota(s) de R$ 5.00");
		System.out.println(f + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(g + " moeda(s) de R$ 1.00");
		System.out.println((int)x + " moeda(s) de R$ 0.50");
		System.out.println((int)y + " moeda(s) de R$ 0.25");
		System.out.println((int)z + " moeda(s) de R$ 0.10");
		System.out.println((int)i + " moeda(s) de R$ 0.05");
		System.out.println((int)j + " moeda(s) de R$ 0.01");
	}
	
}
