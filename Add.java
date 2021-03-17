import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		System.out.println("Enter number 1 ");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println("Enter number 2 ");
		int b = obj.nextInt();
		System.out.println("Enter number 3 ");
		int c = obj.nextInt();
		
		obj.close();
		int d = a +b+c;
		System.out.println("The result is "+d);

	}

}
