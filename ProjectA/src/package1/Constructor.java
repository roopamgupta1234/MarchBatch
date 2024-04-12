package package1;

public class Constructor {
	
	public Constructor()
	{
		this (1,2,3);
		System.out.println("Default Constructor");
	}
	
	public Constructor (int a)
	{
		this (1,2,3,4);
		System.out.println("One parametrised Constructor");
		
	}
	
	public Constructor (int x, int y)
	{
		this (10);
		System.out.println("Two parametrised Constructor");
	}
	
	public Constructor (int i, int j, int k)
	{
		System.out.println("Three parametrised Constructor");
		
	}
	public Constructor (int i, int j, int k, int m)
	{
		
		this ();
		System.out.println("Four parametrised Constructor");
	
	}
	
	public static void main (String[] args)
	
	{
		
		Constructor obj = new Constructor (5,6);
		
	}

	}

			
			


