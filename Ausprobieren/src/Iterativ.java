
public class Iterativ {

//public static int[] stepsCounter(int n) {
//		
//		int[] puffer = new int[5];
//		
//		int counter1 = 0;
//		int counter2 = 0;
//		int counter3 = 0;
//		int counter4 = 0;
//		
//		int n2 = n - 1;
//		int n3 = n - 1;
//		int n4 = n - 2;
//		int n5 = n - 2;
//		
//		//n-1 für n-1
//		while(n2>1) {
//			n2 = n2-1;
//			counter1++;
//			if(n2 == 1 || n2 == 0) {	
//				counter1++;
//				n2 = 1;
//			}
//		}
//		//n-1 für n-2
//		while(n3>1) {
//			n3 = n3-2;
//			counter2++;
//			if(n3 == 1) {	
//			n3 = 1;
//			counter2++;
//			}
//			else if(n3 == 0) {
//			n3 = 1;
//			}
//		}
//		//n-2 für n-2
//		while(n4>1) {
//			n4 = n4-2;
//			counter3++;
//			if(n4 == 1 || n4 == 0) {	
//			n4 = 1;
//			}
//			}
//			
//		//n-2 für n-1
//		while(n5>1) {
//			n5 = n5-1;
//			counter4++;
//			if(n5 == 1 || n5 == 0) {	
//			n5 = 1;
//			}
//			}
//		
//		
//		System.out.println(counter1 + " counter1 Durchgänge");
//		System.out.println(counter2 + " counter2 Durchgänge");
//		System.out.println(counter3 + " counter3 Durchgänge");
//		System.out.println(counter4 + " counter4 Durchgänge");
//		
//		System.out.println(n2 + " n2 Durchgänge");
//		System.out.println(n3 + " n3 Durchgänge");
//		System.out.println(n4 + " n4 Durchgänge");
//		System.out.println(n5 + " n5 Durchgänge");
//		System.out.println(" ");
//		
//		
//		
//		puffer[0] = counter1;
//		puffer[1] = counter2;
//		puffer[2] = counter3;
//		puffer[3] = counter4;
//		for(int i = 0;i<puffer.length;i++) {
//			System.out.println(puffer[i] + " puffer");
//		}
//		return puffer;
//	}
//	
//	public static int calculateGIterativ(int n) {
//	
//
//		
//		//n-2 multiplikator
//		int m1 = 0;
//		
//		int sum1 = 0;
//		int sum2 = 0;
//		int sum3 = 0;
//		int sum4 = 0;
//		int sum5 = 0;
//		int sum6 = 0;
//		int sum7 = 0;
//		int sum8 = 0;
//		int[] aSpeicher = new int[1000];
//		int[] bSpeicher = new int[1000];
//		
//		//stepsCounter(5);
//
//		int a = n;
//		int b = n;
//		int c = n;
//		
//		for(int i = 0;i<n;i++) {
//			
//			
//			if(a == 1 || a == 0) {
//				a = 1;
//				aSpeicher[i] = a;
//			}else {
//				a = a - 1 ;
//				aSpeicher[i] = a;
//			}
//			if(b<0) {
//				
//			}
//			else if(b == 0) {
//				b = 1;
//				bSpeicher[i] = b;
//			}
//			else{
//				b = b - 2 ;
//				bSpeicher[i] = b;
//			}
//			
//			
//			System.out.println(aSpeicher[i] + " " + bSpeicher[i]);
//		}
//		
//		
//
//		return 1;
//	
//	}
//	
//	public static void iterativ2(int n) {
//		
//		int a = n - 1;
//		int b = n - 1;
//		
//		int c = n - 1;
//		int d = n -1;
//		
//		int q = 2;
//		
//		int n1 = 0;
//		int n2 = 0;
//		
//		
//		int i1 = 0;
//		int i2 = 0;
//		int i3 = 0;
//		int i4 = 0;
//		
//		int sum1 = 0;
//		
//		int counter1 = 0;
//		int counter2 = 0;
//		int counter3 = 0;
//		
//		while(c>0) {
//			if(c == 0 || c == 1) {
//				c = 0;
//			}
//			else {
//			d = c;
//			counter1++;
//			c = c - 1;
//			}
//			while(d>0) {
//				d = d - 2;
//				if(d == 0 || d == 1) {
//					d = 0;
//					if(d<0) {
//						d = 0;
//					}else {
//					counter2++;
//					}
//					}
//				else if(d > 1){
//					counter2++;
//				}
//			}
//			if(counter2 > counter3) {
//				counter3 = counter2;
//			}else {
//			}
//			counter2=0;
//		}
//		
//		System.out.println(counter1 + " c1");
//		
//		int[] s1 = new int[counter1];
//		int[] s2 = new int[counter3];
//		int[] array = new int[counter1+counter3+2];
//		
//		
//		
//		
//		while(a>=0) {
//			if(a == 0 || a == 1) {
//				n1 = 1;
//				a = 0;
//			}
//			else {
//			b = a;			
//			}
//			while(b>=0) {
//				System.out.println(b + " b vor b - 2");
//				b = b - 2;
//				System.out.println(b + " b nach b - 2");
//				if(b == 0 || b == 1) {
//					n2 = 1;
//					s2[i2] = n2;
//					b = -1;
//									}
//				else {
//					
//					s2[i2] = b;
//					System.out.println("s2 in der else " + s2[i2]);
//					i2++;
//				}
//			}
//			i2 = 0;
//			System.out.println("array " +array.length);
//			System.out.println("array inhalt "+ array[0] + array[1]+ array[2] + array[3]);
//			System.out.println("i3 " + i3);
//			if(a == 0) {
//				
//			}else {
//			array[i3] = a;
//			}
//			System.out.println("länge von s2 "+s2.length);
//			System.out.println("s2[0] " + s2[0]);
//			if(s2.length>1) {
//				System.out.println("bin drin");
//				for(int u = s2.length;u>0;u--) {
//					if(u-1 <= 0) {
//						u = 0;
//					}else if(u-1 > 0) {
//					
//					sum1 = q * (s2[u]) + s2[u-1] * (s2[u]);
//					}
//					}
//			}
//			else {
//				sum1 = s2[0];
//			}
//			i3++;
//			array[i3] = sum1;
//			a = a - 1;
//		}
//		
//		System.out.println("array inhalt "+ array[0] + array[1]+ array[2] + array[3]);
//		
//	}
		
	public static void iterativ3(int n){
		
		int c = n - 1;
		int d = n -1;
		
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		
		while(c>0) {
			if(c == 0 || c == 1) {
				c = 0;
			}
			else {
			d = c;
			counter1++;
			c = c - 1;
			}
			while(d>0) {
				d = d - 2;
				if(d == 0 || d == 1) {
					d = 0;
					if(d<0) {
						d = 0;
					}else {
					counter2++;
					}
					}
				else if(d > 1){
					counter2++;
				}
			}
			if(counter2 > counter3) {
				counter3 = counter2;
		}
		}
		
		int[] s1 = new int[counter1];
		int[] s2 = new int[counter3];
		int[] s3 = new int[counter1];
		int[] a = new int[(counter1+counter3)];
		int i = (counter1+counter3)-1;
		int i1 = counter1-1;
		
		System.out.println(a.length);
		
		c = n - 1;
		d = n -1;
		
		while(c>0) {
			if(c == 0 || c == 1) {
				c = 0;
			}
			else {
			d = c;
			a[i] = c;
			s3[i1] = c;
			c = c - 1;
			i = i - 1;
			i1 = i1 - 1;
			}
			while(d>0) {
				d = d - 2;
				if(d == 0 || d == 1) {
					d = 1;
					a[i] = d;
					i = i - 1;
					d = 0;
				}
					else if(d<0) {
						d = 1;
						a[i] = d;
						i = i - 1;
						d = 0;
					}else {
					a[i] = d;
					i = i - 1;
					}
				}
			}
		
		
		for(int z = 0;z<a.length;z++){
			System.out.println(a[z]);
		}
			
			for(int r = 0;r<s3.length;r++){
				System.out.println(s3[r] + " s3[]");
			}
		
		
		int q = 2;
		int b = 1;
		int x = 0;
		int sum = 0;
		int sum1 = 0;
		int erg = 0;
		
		int index = 0;
		
		System.out.println(" ");
		for(int y = 0;y<a.length;y++) {
			
			
			sum = (q *(b));
			
			sum1 = s3[index] * 1;
			
			
			
			
			
			erg = sum + sum1;
			b = erg;
			if(index + 1 <= s3.length-1){
				index++;
			}
			
			
			
		}
		System.out.println(erg + " summe");
	}
	
	
	public static void main(String[] args) {
		
		iterativ3(4);
	}

}
