import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the last natural number ");
Scanner sc = new Scanner(System.in);
int number=sc.nextInt();
do {
	
	System.out.println(number);
	number--;
}
while(number>=0);
sc.close();
}

}
