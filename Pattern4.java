//			   *   
//			  ***  
//			 ***** 
//			*******


public class Pattern4 {

	public static void main(String[] args) {
		
		Pattern();
	}
	public static void Pattern()
	{
		int i,j;
		for(i = 0 ; i <= 3 ; i++)
		{
			
			for(j = 0; j <= 6 ; j++)
			{
				if(j >= 3-i && j<= 3+ i)
				{
					System.out.print("*");
					
				}else
				{
					System.out.print(" ");
				
				}
			}
			System.out.print("\n");
		}
	}
}
