
public class Pattern1 {

	public static void main(String[] args) {
		
		Pattern(5);
	}
	
	public static void Pattern(int n)
	{
		int i, j , k;
		for(i = 0 ; i <= n; i++)
		{
			k =1;
			for(j = 0; j <= n*2 ;j++)
			{
				if(j <= i + n && j >= n-i && k == 1)
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
