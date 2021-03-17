import java.util.Scanner;
public class percentage {

	public static void main(String[] args) {
		System.out.println("Welcome to the percentage calculator ");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks you got tin subject 1 ");
		int m1 = sc.nextInt();
		System.out.println("Enter the marks you got tin subject 2 ");
		int m2 = sc.nextInt();
		System.out.println("Enter the marks you got tin subject 3 ");
		int m3 = sc.nextInt();
		System.out.println("Enter the marks you got tin subject 4 ");
		int m4 = sc.nextInt();
		System.out.println("Enter the marks you got tin subject 5 ");
		int m5 = sc.nextInt();
	//	sc.close();
		int Mt = m1+m2+m3+m4+m5;
		
		float percentage = Mt/5f;
		
		System.out.println(percentage);
		
sc.close();


	}

}
