package in.mindcraft.AnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class MemoryCard {
	private int size;

	
	
	public MemoryCard() {
		super();
		size=32;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void show() {
		System.out.println("Size: "+size);
	}
}
