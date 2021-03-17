import java.util.Scanner;
public class income_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your income");
		Scanner sc = new Scanner(System.in);
		double income = sc.nextFloat();
		double tax=0;
		if(income<=2.5)
		{
			System.out.println("No tax required");
			
		}
if(income>2.5 && income<5.0)
{
	income = income-2.5;
	tax = income*0.05;
	System.out.println("tax paid is "+tax);
	
}

if (income>5.0 && income<10.0)
{
	double tax1= 0.05*2.5;
	double income1=income-5;
	double tax2=income1*0.2;
	double total_tax=tax1+tax2;
	System.out.println("tax req is " +total_tax);
}
sc.close();
	}
}
