
public class BStest {

	public static void main(String[] args) {
		
		int[][] x = new int[64][64];
		int b = 0;
		int counter = 0;
	
		for (int i = 0; i < 64; i++) {
			for (int j = 0; j < 64; j++) {
			x[i][j] = 0;
			counter++;
			System.out.println(" i= " + i + " "+ "j= " + j + "x["+i+"]["+j+"]" );
			}
			System.out.println("------------------------------------------------");
			
		}
		System.out.println(counter);

	}

}
