
public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6};
		int a =Math.floorDiv(array.length, 2);
		int temp;
		for(int i=0;i<=a;i++)
		{
			temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		for(int element : array)
		{
			System.out.print(element);
		}

	}

}
