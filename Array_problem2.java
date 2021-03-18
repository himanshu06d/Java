//import java.util.Scanner;
public class Array_problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {6,8,10,12};
int num=9;
boolean isinarray = false;

for (int i =0;i<4;i++)
{
	if(array[i]==num)
	{
		isinarray=true;
		break;
	}
}
if(isinarray) {
	System.out.println("present");
	
}
else {
	System.out.println("not there");
}

}
	}



