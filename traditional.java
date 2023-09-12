package BaiscPracticeJava8;

public class traditional implements Greetings{

	public static void main(String[] args) {
		traditional test=new traditional();
		greet(test,"Hello-World");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Name is: " + name);
	
	}
	
	private static void greet(Greetings obj, String name) {
		obj.sayHello(name);
}

	
}
