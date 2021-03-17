import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the table number to find sum of ");
Scanner sc = new Scanner(System.in);
int table = sc.nextInt();
int sum=0;
for (int i=1;i<=10;i++)
{
	
	sum+=table*i;
}
System.out.println(sum);
sc.close();
	}

}
