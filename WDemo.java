class WDemo
{
   public static void main(String a[])
    {
int j=10;boolean b1=true;
    Integer iobj=j;//Autoboxing
    Boolean bobj=b1;
    System.out.println(iobj);
    System.out.println(bobj);
    int k=iobj;//Autounboxing
    boolean b=bobj;
     System.out.println(k);
    System.out.println(b);
    }
 }
