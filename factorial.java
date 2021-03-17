import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENter the number to take factorial");
Scanner sc = new Scanner(System.in);
int fact = sc.nextInt();
int num=1;
for(int i=1;i<=fact;i++)
{
	num=num*i;
}
	System.out.println(num);

sc.close();
	}

}
