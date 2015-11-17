/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
 // The GuideTester class includes the main method for the program
public class GuideTester {
	public static void main(String args[]){
		CDCGuide DCGuide = new CDCGuide();			// Creates an instance of CDCGuide class
		CUOITGuide UOITGuide = new CUOITGuide();		// Creates an instance of CUOITGuide class
		MyTVGuide guide = new MyTVGuide(DCGuide, UOITGuide);	// Creates an instance of MyTVGuide class with DC and UOIT guides as arguments
		guide.printTVListings();				// Prints the TV Guide
	}
}
