
 class integer
{  
    public static void main(String args[ ])
    { 
       
       int r ;
      
      System.out.println("args[0] -> " +args[0]);
   
       r = Integer.parseInt(args[0]);
      
       if (r <0)
        
           System.out.println("the number is negative :");
       else if (r ==0)
           System.out.println("the number is zero:");
      else 
          System.out.println("the number is positive");
       
     }
}