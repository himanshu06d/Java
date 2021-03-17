import java.util.Scanner;
public class greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter your name ");
Scanner sc = new Scanner (System.in);
String name = sc.next();
sc.close();
System.out.println("Hello"  +name+ ", have a good day" );

	}

}
