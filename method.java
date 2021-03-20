
public class method {
	
	public int condition(int x1 , int y1)
	{
		int z=x1+y1;
		
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8;
		int b=7;
		method obj = new method(); //making object of class named obj and accessing in static main
		int c=obj.condition(a,b);
		System.out.println(c);
		
		

	}

}

//we can access the static method in main  method without creating object
//but we can access any method in main by creating the object