import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dog extends Animal implements Comparable<Dog>{
	
	public Dog(String name, int legs) {
		super(name, legs);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return name;
	}
	
	
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		if(this.legs - o.legs == 0)
			return this.name.compareTo(o.name);
		else
			return this.legs - o .legs;
	}
	
	

	
}
