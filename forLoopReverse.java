import java.util.Scanner;
public class forLoopReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value of n ");
Scanner sc = new Scanner(System.in);
int number=sc.nextInt();
for (int i=number;i>=0;i--)
{
	System.out.println(i);
}
sc.close();
	}

}
