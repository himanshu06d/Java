import java.util.Scanner;
public class problem2WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int number=sc.nextInt();
int n=0;
while(n!=number)
{
	System.out.println(2*n);
	n++;
	
}
int sum = n*(n+1);
System.out.println("sum of n consecutive even numbers is "+sum);
	sc.close();
	}

}
