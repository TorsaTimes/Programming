package ctr;


public class While {

	public static void main(String[] args) {

//		int A = 200;
//		int B = 5;
//		
//		int C = B;
//		int ERG = 0;
//		
//				while(C!=0) {
//					int D = A;
//					while(D!=0) {
//						++ERG;
//						--D;
//					}
//					--C;
//				}
//				System.out.println(ERG);

//		char A = 400;
//		char B = 400;
//
//		int SchleifenVar = A;// Whileschleife der Grösse von A herunterzählen!!!
//
//		int ERG = 0;
//
//		while (SchleifenVar != 0) {
//			--A;
//			--B;
//			if (A == 0) {
//				if (B == 0) {
//					++ERG;
//				} 
//			}
//			--SchleifenVar;
//		}
//
//		System.out.println(ERG);
//		System.out.println(B);
		
		
		
		int A = 999889999;
		int B = 9999999;
		
		int C = B;
		int D = A;
		

		int SchleifenVar = A;// Whileschleife der Grösse von A herunterzählen!!!

		int ERG = 0;

		while (SchleifenVar != 0) {
			--A;
			--B;
			if (A == 0) {
				if (B == 0) {
					while(C!=0) {
						--D;
						--C;
						ERG = D;
					}
					break;
				}
				else {
					while(D!=0) {
						--C;
						--D;
						ERG = C;
						
					}
					break;
				}
					
			}
			else {
				if(B==0) {
					while(C!=0) {
						--D;
						--C;
						ERG = D;
					}
					break;
				}
			}
			--SchleifenVar;
		}

		System.out.println(ERG);
		System.out.println(B);

	}

}
