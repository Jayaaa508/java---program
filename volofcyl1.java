class volofcyl1
{  
    public static void main(String args[ ])
    { 
       
       double r ;
      double h;
      System.out.println("args[0] -> " +args[0]);
      System.out.println("args[1] -> " +args[1]);
       r = Double.parseDouble(args[0]);
       h= Double.parseDouble(args[1]);
      double r1=r*r;
      double v = (3.14 *r1*h);
      System.out.println("volume of cylinder is : "+v);
       
     }
}