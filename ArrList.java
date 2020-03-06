import java.util.*;
class ArrList
{
    public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	ArrayList<String> Al=new ArrayList<String>();
	System.out.print("Enter the number of elements in list: ");
	int n=sc.nextInt();
	
	if(n<10)
		{
			System.out.println("enter minimum 10 elements..");
		}
	
	else{
	System.out.println("Enter the elements");
	
	
	

	for(int i=0;i<n;i++)
		{
			String a=sc.next();
			Al.add(a);
			
		}}
           System.out.println( "The List is :"  );

	for (String ele: Al )
	{
 
		                      
			System.out.print( "  -->  "  );
			System.out.println(  ele  );	
		
		
	}
		System.out.println("Enter the number of elements to be removed:");
		int m=sc.nextInt();
		
		System.out.println("Enter the elements to be removed");
		for(int j=0;j<m;j++)
		{
			String r=sc.next();
		Al.remove(r);
			
		}
		
                                            System.out.println(  "The final list is:"  );

		System.out.println(  Al  );

	}
}