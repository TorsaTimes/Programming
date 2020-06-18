package ctr;

class Lock
{
   public synchronized void m1 (Lock r)
   {
	   System.out.println(Thread.currentThread());
      try
      {
         Thread.sleep(1000);
      }
      catch (Exception e)
      {
      }
      r.m2 ();
      return;
   }
   public synchronized void m2 ()
   {
	   System.out.println("hallo");
      return;
   }
}