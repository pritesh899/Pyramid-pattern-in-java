//		*********
//		**** ****
//		***   ***
//		**     **
//		*       *


public class Pattern7 {

	public static void main(String[] args) {
		Pattern();

	}
	public static void Pattern()
	{
		int i,j;
		for(i = 0; i <= 4 ; i++ )
		{
			for(j = 0 ; j <=  8 ; j++)
			{
				if(j >= 4 + i || j<= 4 - i)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
