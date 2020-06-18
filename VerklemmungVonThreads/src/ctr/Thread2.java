package ctr;

public class Thread2 extends Thread{

	 private Lock A;
	   private Lock B;
	   public Thread2 (Lock A, Lock B)
	   {
	      this.A = A;
	      this.B = B;
	   }

	   public void run ()
	   {
	      System.out.println ("Thread2: Aufruf B.m1 (A)");
	      B.m1 (A);
	   }
}
