package ctr;

public class DeadLock {

	 public static void main (String[] args)
	   {
	      Lock A = new Lock ();
	      Lock B = new Lock ();
	      Thread1 t1 = new Thread1 (A, B);
	      Thread2 t2 = new Thread2 (A, B);

	      System.out.println ("In main(): starte Thread1");
	      t1.start();
	      System.out.println ("In main(): starte Thread2");
	      t2.start();
	   }
}
