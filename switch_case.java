import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
	System.out.println("Enter the number ");
	Scanner sc = new Scanner(System.in);
	number=sc.nextInt();
	sc.close();
	switch (number)
	{
	case 1:
		System.out.println("maa chudao");
		break;
	case 2:
		System.out.println("gand marao");
		break;
	default : System.out.println("Khush raho");
	
	}
	//default : System.out.println("Khush raho");
	
	}

}
