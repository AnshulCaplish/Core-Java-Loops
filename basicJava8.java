package BaiscPracticeJava8;

public class basicJava8 {

	public static void main(String[] args) {
		
		//NO PARAMETER
	//	Greetings hello2 = () -> {System.out.println("Java 8 first Program " );};
	//	hello2.sayHello2();
	//.....................................................................................................	
		//SINGLE PARAMETER
	//	Greetings hello = (n) -> {System.out.println("Java 8 first Program: " + n );};
	//	hello.sayHello();
		//....................................................................................................
		//WITHOUT RETURN
//		Greetings obj=(a,b,c)->((a+b)*c);
//		System.out.println(obj.add(10, 20,2));
//		.........................................................................................................
		//WITH RETURN
//		Greetings obj2=(a,b,c)->{
//			return ((a+b)*c) ;
//					};
//		System.out.println(obj2.add(100, 200,2));

		//........................................................................
		//PRINT TABLE
//		Greetings obj=n-> {
//			for(int i=1 ;i<=10;i++) 
//			System.out.println(n + "*" + i +" = "+ (n*i) );
//			
//		};
//		obj.table(8);		
	//................................................................................
		// CALCULATE MATHEMATICAL CALCULATION
//		Greetings obj =()->{System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//        };
//		obj.sayHello2();
		
	//....................................................................................	
	//PRINT JAVA IN PATTERN
//		Greetings obj =()->{System.out.println("   J    a   v     v  a ");
//        System.out.println("   J   a a   v   v  a a");
//        System.out.println("J  J  aaaaa   V V  aaaaa");
//        System.out.println(" JJ  a     a   V  a     a");};
//		obj.sayHello2();
		
		//..................................................................................
		//CaLCULATE AREA OF CIRCLE
		Greetings obj =(n)->{System.out.println("Area of Circle is: " + (Math.PI)*n*n);
		System.out.println("Perimeter of Circle is: " + (Math.PI)*2*n);
		};
		obj.radius(7.5);
	}
}

