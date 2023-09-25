package in.mindcraft.SpringApp;

public class Student {
	private String roll_no;

	private String name;
	
	private Address resd;

	private Laptop laptop;
	

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student() {
		super();
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getResd() {
		return resd;
	}

	public void setResd(Address resd) {
		this.resd = resd;
	}
	
	public void display() {
		System.out.println(roll_no);
		System.out.println(name);
		resd.display();
		laptop.show();
	}
	

}
