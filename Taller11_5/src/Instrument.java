
public class Instrument {

	private boolean onSale;
	private double price;
	private int numInStock;

	public double getPrice() {
		if (onSale)

			return price * 0.85;
		else
			return price;
	}

	public double applyEmloyeeDiscount() {

		this.price = price * 0.75;
		return price;
	}

	public void setOnSale(boolean onSale) {

	}

	public boolean getOnSale() {
		return onSale;
	}

	public void setPrice(double price) {

	}

	public int getNumInStock() {
		return numInStock;
	}

	public void setNumInStock(int numInStock) {

	}
}
