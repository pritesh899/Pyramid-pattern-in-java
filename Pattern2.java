//*     
//**    
//***   
//****  
//***** 
//******


public class Pattern2 {

	public static void main(String[] args) {
		
		 Pattern(6);
	}
	public static void Pattern(int n)
    {
    	int i,j;
    	for(i = 0; i < n; i++)
    	{
    		for(j = 0; j < n; j++)
    		{
    			if(j >= 0 && j <= i)
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
