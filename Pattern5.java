//			   *   
//			  * *  
//			 * * * 
//			* * * *
public class Pattern5 {

	public static void main(String[] args) {
		Pattern();
	}
	public static void Pattern()
	{
		int i,j,k;
		for(i = 0 ; i <=3 ; i++)
		{
			k = 1;
			for(j = 0; j <=6 ; j++)
			{
				if(j >= 3-i && j<= 3+ i && k == 1)
				{
					System.out.print("*");
					k = 0;
				}else
				{
					System.out.print(" ");
					k = 1;
				}
			}
			System.out.print("\n");
		}
	}
}
