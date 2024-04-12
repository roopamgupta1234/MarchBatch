package package1;

public class Student {

	
	int rollNo;                //variables
	int age;
	
	public void display1()      //method
	
	{
		System.out.println(" Welcome to all of you");
	}
	
	public void display2()           //METHOD
	{
	System.out.println("Automation is very easy");
	}
	
   public static void main(String[]args){
   
	   Student abc= new Student();
       abc.rollNo =12;    //call
       abc.age= 25;
       
       System.out.println("Roll number is :" + abc.rollNo);
       System.out.println("Age is" + abc.age);
       
       abc.display1();
       abc.display2();
			   
   }			   
}	   
   
