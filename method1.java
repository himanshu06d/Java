
public class method1 {
	
	static void fun1()

	{
		System.out.println("Hello good to see ou here");
	}
	
	static int fun2(int x )
	{
		x=89;
		return x;
		
	}
	static void fun3(int [] array)
	{
		array[1]=65;
		//System.out.println(array);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=98;
		fun2(a);
		System.out.println(a);
		fun1();
		
		int [] names =  {6, 7,8,4};
		fun3(names);
		System.out.println(names);
		
		
		
	}

}
