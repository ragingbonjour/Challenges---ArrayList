import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Used to create the length of the array we want (redundant with arraylists but whatever, that's in the documentation)
		
		
		
		
		int initialArraySize = scan.nextInt();  // takes first number setting size
		
		ArrayList< ArrayList<Integer> > rowArray = new ArrayList< ArrayList<Integer> >();
		// ArrayList[row][column]
		// QUESTIONS
		for(int i = 0; i < initialArraySize; i++) { // for each of the initial value given in line 1
			// For each element going down the row, insert these
			ArrayList<Integer> colArray = new ArrayList<Integer>();
			int y = scan.nextInt(); // Second number entered is how long the 'columns' are for each of the rows (changed by the for loop)
			for(int j = 0; j < y; j++) {
				// Take the rest of the numbers on the second line in to the colArray
				colArray.add(scan.nextInt()); // Makes entire columns prepared to be fed into the expression below this for loop
			}
			rowArray.add(colArray);
		}
		
		
		
		
		
		// QUERIES - Check the ArrayLists we've set up in the for loops above
		
		int query = scan.nextInt();
		for(int i = 0; i < query; i++) {
			// Grab the x dimension first then they
			int x = scan.nextInt();
			int y = scan.nextInt();
			// If the row we ask for has a larger query number in the [][y] than we do [][y] elements[columns] then we know we've asked
			// too far down the column and return an error
			if(y > rowArray.get(x - 1).size()) {
				System.out.println("ERROR!");
			} else { 
				System.out.println(rowArray.get(x - 1).get(y - 1));
			}
		}
		
		
	}
}





/*

5					// Number of lines - n
5 41 77 74 22 44	// 5 = d  ->  5 entries into the [0][0]=41 [0][1]=77 [0][2]=74
1 12				// [1][0]=12
4 37 34 36 52		// [2][0]=37 [2][1]=34
0					// [3][0]=0
3 20 22 33
5					// Number of queries - q
1 3					// [x][y]
3 4
3 1
4 3
5 5


*/

