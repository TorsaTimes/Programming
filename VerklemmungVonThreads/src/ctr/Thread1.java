package ctr;

public class Thread1 extends Thread{

	private Lock A;
	   private Lock B;
	   public Thread1 (Lock A, Lock B)
	   {
	      this.A = A;
	      this.B = B;
	   }

	   public void run ()
	   {
	      System.out.println ("Thread1: Aufruf A.m1 (B)");
	      A.m1 (B);
	   }
}
