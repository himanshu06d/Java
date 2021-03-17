import java.util.Scanner;
public class string_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter string");
String input = sc.next();
String lower_case=input.toLowerCase();
System.out.println("Input String in Lower case is "+lower_case);

String text = "Hello himanshu";
String updated = text.replace(" ","_");
System.out.println(updated);

sc.close();

	}

}
