import java.util.Scanner;
public class Cgpa {

	public static void main(String[] args) {
		System.out.println("Marks to CGPA converter");
		System.out.println("Enter the marks in subject 1 ");
Scanner sc = new Scanner(System.in);
int m1=sc.nextInt();
System.out.println("Enter the marks in subject 2 ");
int m2=sc.nextInt();
System.out.println("Enter the marks in subject 3 ");
int m3=sc.nextInt();
sc.close();
int mt=m1+m2+m3;
float CGPA=mt/30f;
System.out.println("CGPA is "+CGPA);
	}

}
