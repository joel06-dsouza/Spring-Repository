package in.mindcraft.SpringDemo;

public class Laptop {
	private int lid;
	
	private String make;
	
	private double cost;
	
	private String name;
	
	
	public Laptop() {
		super();
		lid = 101;
		make = "HP";
		cost = 12000;
		name="Praladh";
	}

	public Laptop(int lid, String make, double cost) {
		super();
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}

	
	public Laptop(int lid, String make, double cost, String name) {
		super();
		this.lid = lid;
		this.make = make;
		this.cost = cost;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void show1() {
		System.out.println(lid+ "  " + make + "  " +cost);
	}
	
	public void show2() {
		System.out.println(lid+ "  " + make + "  " +cost+ "  " +name);
	}
}
