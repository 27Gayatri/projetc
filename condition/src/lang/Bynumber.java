package lang;

public class Bynumber {
	int num1=10,num2=20;
	
	Bynumber(int num1,int num2)
	{
		
		this.num1=num1;
		this.num2=num2;
		
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void add()
	{
	 int sum= num1+num2;
     return;
	}
	public void mul()
	{
		int mul =num1*num2;
	}
	
	public static void main(String args[])
	{
		Bynumber b2=new Bynumber(2,3);
	System.out.println("number.getNum1");
	System.out.println("number.getnum2");
	System.out.println("multiplication two number");
	
	
	}

}
