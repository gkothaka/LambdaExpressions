package lambda;

interface A {
	// void show();
	// Default keyword must be used to define a method in Interface
	default void print() {
		System.out.println("I'm print method");
	}
}
//To implement show method in A interface
//class ImpA implements A
//{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//	}
//}
//If above class is used only once then it can be replaced by anonymous inner class

public class Java8LambdaExpression {

	public static void main(String args[]) {
		// For external class object creation
		// A obj = new ImpA();
		// For Anonymous inner class object creation and method implementation
		// A obj = new A()
		// {
		// public void show()
		// {
		// System.out.println("hello");
		// }
		// };
		// Using Lambda expression
		// A obj = ()-> System.out.println("hello");
		// obj.show();
		A obj = new A() {

		};
		obj.print();
	}
}
