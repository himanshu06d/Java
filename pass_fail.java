import java.util.Scanner;

public class pass_fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the marks of sub1 ");
		Scanner sc = new Scanner(System.in);
		float m1 = sc.nextFloat();
		
		
		
		System.out.println("enter the marks of sub2 ");
		
		float m2 = sc.nextFloat();
		
		System.out.println("enter the marks of sub3 ");
		
		float m3 = sc.nextFloat();
	
	
		float total=(m1+m2+m3)/3;
		System.out.println(total);
		
		if (m1>=33 && m2>=33 && m3>=33 && total>=40)
		{
			System.out.println("app pass ho gaye ");
		}
sc.close();
	}

}
