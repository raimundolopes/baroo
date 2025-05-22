package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		//entrada
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("--Relatório-- ");
		
		System.out.printf("Consumo: %.2f%n", bill.feeding());
		
	    if ( bill.cover() == 0.0 ) {
	    	System.out.println("Couvert: Isento");
	    } else {	System.out.printf("Couvert: %.2f%n", bill.cover()); }
	    
	    
	    System.out.printf("Ingresso: %.2f%n", bill.ticket() );
	    
	    System.out.println();
	    System.out.printf("VALOR A PAGAR:  %.2f%n", bill.total() );
	    
	    
		
		sc.close();
		

	}

}
