
public class GirlsJustWannaHaveFun {

	static int counter = 0;
	public static int calculateG(int n) {
        
		
		if (n > 1) {
        	System.out.println("Rekusionsstufe: " + counter);
        		System.out.println("Wert von n-1: " + (n - 1) + " Wert von n: " + n);
        		System.out.println("Wert von n-2: " + (n - 2) + " Wert von n: " + n);
        		counter++;
                int result =2*(calculateG(n - 1)) + n*(calculateG(n - 2));
                System.out.println("Return der einzelnen Rekursionen: " + result);
                return result;
        }
        else {
                return 1;
        }

}
	
	public static int calculateGIterativ(int n) {//komm mit 4 rein
		
		int erg = 0;
		int erg1 = 0;
		int erg2 = 0;
		int erg3 = 0;
		int erg4 = 0;
		int erg5 = 0;
		int erg6 = 0;
		int erg7 = 0;
		int erg8 = 0;
		int erg9 = 0;
		
		int sum1 = 0;
		int sum2 = 0;
		
		int stepCounter = 0;
		int stepCounter2 = 0;
		int stepCounter3 = 0;
		int stepCounter4 = 0;

				//Schritte zählen von n-1 Operation-----------------------
				for(int i = n-1;i>0;i = i - 1) {
					if((i-1 == 0 || i - 1 == 1)) {
						erg1 = 1;
						stepCounter++;
					}else {
					erg1 = 2*(i-1);
					stepCounter++;		
					}
				}
				for(int i = n-1;i>0;i = i - 2) {
					if((i-2 == 0 || i - 2 == 1)) {
						erg8 = 1;
						stepCounter3++;
						i = 0;
					}else {
					erg8 = i*(i-2);
					stepCounter3++;	
					}
				}
				//--------------------------------------------------------
				
				//Schritte zählen von n-2 Operationen
				for(int i = n-2;i>0;i = i - 2) {
					if((i-2 == 0 || i-2 == 1)) {
						erg2 = 1;
						stepCounter2++;
					}else {
					erg2 = i*(i-2);
					stepCounter2++;
					}
				}
				for(int i = n-2;i>0;i = i - 1) {
					if((i-1 == 0 || i - 1 == 1)) {
						erg5 = 1;
						stepCounter4++;
						i = 0;
					}else {
					erg5 = 2*(i-1);
					stepCounter4++;		
					}
				}
				//---------------------------------------------------
				
				
				System.out.println(stepCounter + " SP  " + stepCounter2 + " SP2 " + stepCounter3 + " SP3 " + stepCounter4 + " SP4 ");
				
				
				int y = stepCounter2 + 1;
				int z = stepCounter3;

				//n-1
				while(stepCounter>0) {
					erg3 = 2*(erg1);
					erg1 = erg3;
					stepCounter--;
					
				}
				while(stepCounter3>0) {
					if(erg8 == 1) {
						erg9 = (n-1)*(erg8);
						erg8 = erg9;
						stepCounter3 = 0;
					}else {
					erg9 = z*(erg8);
					erg8 = erg9;
					z = z + 2;
					stepCounter3--;
					}
				}
				//------------------------------------------

				//n-2
				while(stepCounter2>0) {	
					erg4 = y*(erg2);
					y = y + 2;
					erg2 = erg4;
					stepCounter2--;
				}//Baustelle in Operation n-2 die Operation n-1 bearbeiten
				while(stepCounter4>0) {
					if(erg5 == 1) {
						erg7 = (n-2)*(erg5);
						erg5 = erg7;
						stepCounter4 = 0;
					}else {
					erg7 = 2*(erg5);
					erg5 = erg7;
					stepCounter4--;
					}
				}
			
				System.out.println(erg1 + " erg1");
				System.out.println(erg2 + " erg2");
				System.out.println(erg8 + " erg8");
				System.out.println(erg5 + " erg5");
				
				//neu
				int iterationsStufe = 0;
				int c = n;
				int d = n;
				
				int buffer1 = 0;
				int buffer2 = 0;
				int sumtest = 0;
				
				while(c>0) {
					if(c == 1) {
					break;
					}
					
					c = c-1;
					iterationsStufe++;
				}
				
				System.out.println(iterationsStufe + " iti" + c);
				
				
				
				
				
				
				
				
				sum1 = erg1 + erg8;
				sum2 = erg2 + erg5;

			erg = 2*(sum1) + n*(sum2);
		return erg;
	
	
		
	
	
	
	
	
	
	}

	
	public static void iterativ(int n) {
		
		int zwischenSpeicher = 0;
		
		//erg von n-1 und erg von n-2
		int nOne = 0;//erg von n-1
		int nTwo = 0;//erg von n-2
		//------------------------------
		
		//erster block n-1
		int sum1 = 0;
		int a = n;
		int b = n;
		int c = n;
		//-----------------
		
		//konstanterwert 2
		int x = 2;
		
		int[] speicher1 = new int[1000000];
		int[] speicher2 = new int[1000000];
		int i1 = 0;
		int i2 = 0;
		
		int counter1 = 0;
		int counter2 = 0;
		
		while(n>1) {
			
			if(nOne > 1) {
			a = a - 1;
			speicher1[i1] = a;
			counter1++;
			i1++;
				
			}else if(nOne == 1 || nOne == 0) {
				
			}
			else {
				System.out.println("bin in else");
			}
			
			if(nTwo > 1) {
			b = b - 2;
			speicher2[i2] = b;
			counter2++;
			i2++;
				
			}else if(nTwo == 1 || nTwo == 0) {
				
			}else {
				System.out.println("bin in else");
			}
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	

		System.out.println(calculateG(4));
		//System.out.println(calculateGIterativ(2));
		
	}
}
