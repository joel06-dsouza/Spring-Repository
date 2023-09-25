package in.mindcraft.AnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
//@Scope(value = "singleton")
public class Mobile {
	private int mid;
	
	private String make;
	
	@Autowired
	private MemoryCard mry;
	
	
	public MemoryCard getMry() {
		return mry;
	}

	public void setMry(MemoryCard mry) {
		this.mry = mry;
	}

	public Mobile() {
		super();
		mid=101;
		make="Apple";
		System.out.println("Hello constructor");
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public void show() {
		System.out.println(mid +"  "+make);
		mry.show();
	}

}
