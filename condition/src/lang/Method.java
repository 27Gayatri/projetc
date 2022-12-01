package lang;

public class Method {
	
       void display()
	{
		System.out.println("Hello world ");
	}
	   void number(int n)
	{ 
		int i;
		for(i=1; i<=n; i++)
		{
       System.out.println("i");
		}

	}
	   public static void main(String arg[])
	   {
		   
Method me=new Method();
me.display();
}
	}


