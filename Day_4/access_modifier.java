package Day_4;

class MyClass {
	// Access modifiers
	int defaultNumber;
	protected int protectedNumber;
	private int privateNumber;
	public int publicNumber;

	public void display() {
		System.out.println("Default Number: " + defaultNumber);
		System.out.println("Protected Number: " + protectedNumber);
		System.out.println("Private Number: " + privateNumber);
		System.out.println("Public Number: " + publicNumber);
	}
}

class MyOtherChild extends MyClass {
	public void change() {
		// protected number from subclass
		protectedNumber = 50;
	}
}

public class access_modifier {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		// package
		obj.protectedNumber = 20;

		// class
		obj.publicNumber = 40;

		obj.display(); // Displaying the values
		System.out.println("------------------------");
		MyOtherChild childObj = new MyOtherChild();
		childObj.change(); // Changing the value of protectedNumber in childObj
	}
}

// public static void main(String[] args) {
// MyClass obj=new MyClass();
// //obj.defaultNumber=10;
// //obj.protectedNumber=20;
// //obj.privateNumber=30;
// obj.publicNumber=40;

// obj.display();
// System.out.println("------------------------");
// MyOtherChild childObj=new MyOtherChild();
// childObj.change();

// }