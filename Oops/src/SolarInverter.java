class SolarInverter extends Inverter{
	
	int solarPanels;
	
	boolean haveBattery;
	boolean haveGrid;
	
	public SolarInverter(String name, int price, boolean haveBattery, boolean haveGrid,double current, double voltage){
		super(name, price, current, voltage);
		this.haveBattery = haveBattery;
		this.haveGrid = haveGrid;
	}

	public boolean isHaveBattery() {
		return haveBattery;
	}

	public void setHaveBattery(boolean haveBattery) {
		this.haveBattery = haveBattery;
	}

	public boolean isHaveGrid() {
		return haveGrid;
	}

	public void setHaveGrid(boolean haveGrid) {
		this.haveGrid = haveGrid;
	}
	
	public void getDescription() {
		
		super.getDescription();
		
		if(isHaveBattery()) {
			System.out.println(getName()+" also have a battery.");
		}else {
			System.out.println(getName()+" does not have a battery.");
		}
		
		if(isHaveGrid()) {
			System.out.println(getName()+ " also have a grid.");
		}else {
			System.out.println(getName()+" does not have a grid.");
		}
		
		
	}
	
}
