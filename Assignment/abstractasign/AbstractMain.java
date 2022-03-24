package com.onebill.java.abstractasign;

public abstract class AbstractMain {
		public AbstractMain()
		{
			System.out.println("This is Constructor of abstract class");
		}
		public abstract void a_method();
		public void non_abstract()
		{
			System.out.println("From Non-Abstract Method");
		}
}
