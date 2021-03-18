
public class sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {29,27,8,7,6};
boolean issorted = false;
for(int i=0;i<arr.length-1;i++)
{
	if(arr[i]>arr[i+1])
	{
		issorted=true;
	}
	else {
		issorted=false;
	}
}
System.out.println(issorted);
	}

}
