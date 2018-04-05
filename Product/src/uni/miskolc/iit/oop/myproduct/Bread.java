package uni.miskolc.iit.oop.myproduct;

public class Bread extends Product {
	private double weight;
	
	public Bread(String name, int price, int tax, double weight){
		super(name, price, tax);
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", egységár: "+getPriceWithTax()/weight+"ft";
	}

	public double getQuantity() {
		return weight;
	}

	public void setQuantity(double quantity) {
		this.weight = quantity;
	}
	
	public static boolean firstIsMoreExpensive(Bread first, Bread second){
		return (first.getPriceWithTax()/first.weight) > (second.getPriceWithTax()/second.weight);
	}
	

}
