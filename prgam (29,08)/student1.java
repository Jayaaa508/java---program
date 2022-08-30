class student
{  
    public static void main(String args[ ])
    { 
       
       int s ;
      int  m ;
      int e;
      int id;
      int cgpa ;

      System.out.println("args[0] -> " +args[0]);
      System.out.println("args[1] -> " +args[1]);
      System.out.println("args[2] -> " +args[2]);
      System.out.println("args[3] -> " +args[3]);
      System.out.println("args[4] -> " +args[4]);

       s= Integer.parseInt(args[0]);
       m = Integer.parseInt(args[1]);
       e= Integer.parseInt(args[2]);
       id = Integer.parseInt(args[3]);
       
       
       cgpa = ((s+m+e)/3)/10;
         System.out.println("GRADE CARD");
         System.out.println("===================");
         System.out.println("SAP ID :" +id);
         System.out.println("NAME :" + args[4]); //name
         System.out.println("SAP ID :" + id);

       if ( s>=85 && s<=100)
           System.out.println("grade O");
       else if (s>=70 && s<=84)
            System.out.println("grade A");
        else if (s>=50 && s<=69)
             System.out.println("grade B");
        else if (s>=35&& s<=49)
              System.out.println("grade C");
        else 
               System.out.println("grade F");
               System.out.println("CGPA: NC ");//cgpa
    
      if ( m>=85 && m<=100)
              System.out.println("grade O");
       else if (m>=70 && m<=84)
            System.out.println("grade A");
        else if (m>=50 && m<=69)
             System.out.println("grade B");
        else if (m>=35&& m<=49)
              System.out.println("grade C");
        else 
               System.out.println("grade F");
           System.out.println("CGPA: NC");//cgpa

         if ( e>=85 && e<=100)
           System.out.println("grade O");
       else if (e>=70 && e<=84)
            System.out.println("grade A");
        else if (e>=50 && e<=69)
             System.out.println("grade B");
        else if (e>=35&& e<=49)
              System.out.println("grade C");
        else 
               System.out.println("grade F");
               System.out.println("CGPA: NC");//cgpa
               
      if(e<35||m<35||s<35)        
         System.out.println("CGPA:NC");//cgpa
      else 
          System.out.println("CGPA:"+cgpa);//cgpa  
     System.out.println("===================");
}


}