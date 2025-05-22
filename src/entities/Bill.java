package entities;

public class Bill {

	public final double BEER = 5.00;
	public final double BARBECUE = 7.00;
	public final double SOFTDRINK = 3.00;
	
	
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	
	public double feeding() {

		return (beer * BEER) + (barbecue * BARBECUE) + (softDrink * SOFTDRINK);

	}

	public double ticket() {

		if (gender=='M') return 10.00;
		
		return 8.00;

	}

	public double cover() {

		if (feeding() > 30.00) return 0.00;
		return 4.00;

	}

	
	
	
	
	public double total() {

		return cover() + feeding() + ticket();

	}

}
