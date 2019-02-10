import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int side, i, j;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter number of rows(>2) : ");
		side = sc.nextInt();	
			
		for(i = 1; i <= side; i++){
		    if(i<side && i>1)
		         for(j = 1; j <= side; j++)
		            if(j==(side/2)+1)
		             System.out.print("1");
		            else
		             System.out.print("  ");
		    else
			    for(j = 1; j <= side; j++)
				    System.out.print("1 ");
			 System.out.print("\n");	    
		}
	}
}