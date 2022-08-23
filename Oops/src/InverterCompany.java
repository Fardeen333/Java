import java.text.DecimalFormat;

class Inverter {

	private String name;
	private int price;
	
	private double current;
	private double voltage;
	
	
	public Inverter(String name, int price, double current, double voltage){
		this.name = name;
		this.price = price;
		this.current = current;
		this.voltage = voltage;
	}


	public double getCurrent() {
		return current;
	}


	public void setCurrent(double current) {
		this.current = current;
	}


	public double getVoltage() {
		return voltage;
	}


	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public double powerRating() {
		DecimalFormat df = new DecimalFormat("0.00");
		String ans = df.format(getVoltage()*getCurrent());
		return Double.parseDouble(ans);
		
		
	}
	
	public void getDescription() {
		
		System.out.println("The inverter name is "+ getName());
		
		System.out.println("The power rating for "+ getName()+" is " + powerRating()+ " and the price for the same is Rs. "+ getPrice());
		
	}
	
}
