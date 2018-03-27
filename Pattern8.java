//		*   
//		**  
//		*** 
//		****
//		*** 
//		**  
//		*  

public class Pattern8 {

	public static void main(String[] args) {
		Pattern();
	}
	public static void Pattern()
	{
		int i,j,k =0 ;
		for(i = 0 ; i < 7 ; i++)
		{
			if(i<=3)
			{
				k++;
			}else if(i>3){
				k--;
			}
			for(j = 0; j < 4 ; j++)
			{
				if(j < k)
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


