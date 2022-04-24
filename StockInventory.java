import java.util.*;

public  class StockInventory {

	private static final int INVENTORY_SIZE = 12;
	private StockAccountManagement[] stocks;

	public void StockInvetory1() {
		stocks = new StockAccountManagement[INVENTORY_SIZE];

	for( int i = 0; i < INVENTORY_SIZE; i++ ) {
		 Scanner console = new Scanner(System.in);
	    System.out.println ("Stock's name:");
	    String stockName = console.next();

	    System.out.println ("Stock's rating");
	    String stockRating= console.next();

	    System.out.println ("Stock's price:");
	    int stockPrice = console.nextInt();

	    System.out.println ("Numbers of shares: ");
	    int numberShares= console.nextInt();

	    stocks[i] = new StockAccountManagement( stockName, stockRating, stockPrice, numberShares);
	}
   }
	
	public static void main(String[] args) {
		StockInventory obj = new StockInventory();
		obj.StockInvetory1();
	}
}