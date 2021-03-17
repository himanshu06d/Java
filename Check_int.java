import java.util.Scanner;
public class Check_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Int or not checker");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number ");
		boolean result = sc.hasNextInt();
		sc.close();
		System.out.println(result);

	}

}
