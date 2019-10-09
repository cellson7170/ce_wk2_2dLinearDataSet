package cs260_wk3_twoDArray;

/** This class creates a 2D array and fills it to make
 *  a picture of a triangle and glass
 */
public class TwoDArray {
	
	/**
	 * 2D array to hold image of triangle and glass
	 */
	char[][] arr = new char[8][16];
	
	/**
	 * Constructor to fill array
	 */
	public TwoDArray() {
		fillTriangle();
		fillGlass();
	}
	
	/**
	 * Fills triangle into 2D array
	 */
	private void fillTriangle() {				
		for(int r = 0; r < arr.length; r++) {			
			for(int c = 0; c < 8; c++) {				
				if(r < c) {								
					arr[r][c] = ' ';					
				}										
				else {									
					arr[r][c] = '*';					
				}
			}
		}
	}
	
	/**
	 * Fills glass into 2D array
	 */
	private void fillGlass() {							
		for(int r = 0; r < arr.length; r++) {			
			for(int c = 8; c < arr[r].length; c++) {	
				if(r == 0) {							
					arr[r][c] = '*';					
				}										
				else if(r == 1 && c > 8 && c < 15) {	
					arr[r][c] = '*';					
				}
				else if(r == 2 && c > 9 && c < 14) {
					arr[r][c] = '*';
				}
				else if( r > 2 && r < 8 && c > 10 && c < 13) {
					arr[r][c] = '*';
				}
				else if(r == 7 && c > 9 && c < 14) {
					arr[r][c] = '*';
				}
				else {
					arr[r][c] = ' ';
				}
			}
		}
	}
	
	/**
	 * Prints 2D array to console
	 */
	public void printArray() {
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c]);
			}
			// Moves to next line
			System.out.println();
		}
	}

}