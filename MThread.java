class MThread extends Thread
{
int n;
MThread(int n)
{
this.n=n;
}
public void run()
{
try
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"*"+n+"="+(i*n));
Thread.sleep(10000);
}
}catch(InterruptedException e){}
} 
public static void main(String[] args)
{
MThread t1=new MThread(5);
t1.start();
}
}
