class pattern1
{
   public static void main(String args[])
    {
        int i;
        int j;
          for (i=1;i<=5;i=i+2)
         {
             System.out.println();
                        for (j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print( " *");
			}
			System.out.println();
                  
           
      }
   }
}