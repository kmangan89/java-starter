import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String myName = "Katie";
//		float favoriteNumber = 13;
//		System.out.println(myName + "'s favorite number is " + favoriteNumber);
//		Review myReview = new Review();
//		myReview.exampleMethod("taco");
//		String[] breakfast = new String[3];
//		breakfast[0] = "Bacon";
//		breakfast[1] = "Eggs";
//		breakfast[2] = "Toast";
//		
//		for (int i = 0; i < breakfast.length; i++) {
//			System.out.println(breakfast[i]);
//		}
		
		//conditional statements
//		if (1 == 0 && 1 == 1) {
//			System.out.println("Statement is true");
//		}
//		else {
//			System.out.println("Statement is false");
//		}
	
//	public static void exampleStatic() {
//		System.out.print("exampleStatic");
//	}
//	
//	public void exampleMethod(String message) {
//		System.out.print(message);
//	}
		
		//Classes
//		MyClass mc = new MyClass();
//		System.out.println(mc.myNum);
//		mc.myMethod();
		
		//Input and output
//		System.out.println("Enter first number:");
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		System.out.println("Enter second number:");
//		int num2 = scan.nextInt();
//		System.out.println("Sum is " + (num1 + num2));
//		}
		
		FileReader file = new FileReader("hello");
		BufferedReader reader = new BufferedReader(file);
		String data;
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		reader.close();
}
}
