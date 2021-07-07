package smart.usa;

public class InterfaceImplement implements MyInterface{

	public void getSalary() {
		
		System.out.println("I have a baby");
	}

	public void getMoney() {
		
		System.out.println("I have two baby");
	}

public static void getProperty() {
		
		System.out.println("I need my property");
	}

	
	public static void main(String[] args) {
		
		InterfaceImplement obj = new InterfaceImplement();
		obj.getMoney();
		obj.getSalary();
		InterfaceImplement.getProperty();
	}
	
}
