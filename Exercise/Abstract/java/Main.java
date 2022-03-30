package com.Abstract.java;

public class Main {
		public static void main(String[] args) {
			User user=new Admin("Maddy",9629141633l);
			user.call();
			user.chat();
			user.share();
			
			
			Admin admin=(Admin) user; 
			admin.call();
			admin.chat();
			admin.Add();
			admin.Remove();
		}
}
