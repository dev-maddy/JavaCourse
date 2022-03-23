package onebill;

import com.assignment.java.Assignment2;

public class Constructor {
	Constructor()
	{
		System.out.println("hello from constructor");
	}
		public static void main(String[] args) {
			Constructor c=new Constructor();
			Assignment2 as=new Assignment2();
			System.out.println(as.v);
		}
}
