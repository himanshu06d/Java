import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENter the number you want to print table ");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(number+"*"+i+" = "+number*i);
	System.out.println("\n");
}
sc.close();
	}

}
