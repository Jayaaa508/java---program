class cal
{  
    public static void main(String args[ ])
    { 
       
       double a ;
      double b;
      System.out.println("args[0] -> " +args[0]);
      System.out.println("args[1] -> " +args[1]);
       a = Double.parseDouble(args[0]);
       b = Double.parseDouble(args[1]);
      double c = a+b;
      double d = a-b;
      double e = a*b;
      double f = a%b;
      System.out.println("sum: " +c);
      System.out.println("diff: " +d);
      System.out.println("multiply: " +e);
      System.out.println("divide: " +f); 
     }
}