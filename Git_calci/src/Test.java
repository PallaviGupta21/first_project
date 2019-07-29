import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("enter the no. on which action is to be performed: ");
		Scanner sc=new Scanner("System.in");
		int x =sc.nextInt();
		int y= sc.nextInt();
        int sum = add(x,y);
	}

	public static int add(int x,int y){
		return(x+y);
	}
	
	public static int sub(int x,int y){
		return(x-y);
	}
	
	public static int mul(int x,int y){
		return(x*y);
	}
	
	public static int div(int x,int y){
		return(x/y);
	}
}
