import java.util.Scanner;
public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number till you want odd numbers " );
Scanner sc = new Scanner(System.in);
int odd = sc.nextInt();
for(int i=1;i<=odd;i=i+2)
System.out.println(i);
sc.close();


	}

}
