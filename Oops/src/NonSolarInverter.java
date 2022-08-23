
public class NonSolarInverter extends Inverter{
	
	boolean battery = true;
	
	public NonSolarInverter(String name, int price, double current, double voltage){
		super(name, price, current, voltage);
	}
	
	public void getDescription() {
		super.getDescription();
		System.out.println("This inverter comes with a battery");
	}
	
}


