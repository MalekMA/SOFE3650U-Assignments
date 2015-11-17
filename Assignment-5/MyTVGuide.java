/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
 // The MyTVGuide class brings the two different guides together
public class MyTVGuide {
	CDCGuide DCGuide;								// Creates a local DCGuide variable
	CUOITGuide UOITGuide;								// Creates a local UOITGuide variable
	
	/**
	 * Constructor for MyTVGuide class
	 * @param  DCGuide   an instance of the CDCGuide class
	 * @param  UOITGuide an instance of the CUOITGuide class
	 */
	public MyTVGuide(CDCGuide DCGuide, CUOITGuide UOITGuide){
		this.DCGuide = DCGuide;
		this.UOITGuide = UOITGuide;
	}
	
	/**
	 * This method creates iterator instances and prints which listing is being printed
	 */
	public void printTVListings(){
		Iterator DCIterator = (Iterator) DCGuide.createIterator();		// Creates iterator instance 
		Iterator UOITIterator = (Iterator) UOITGuide.createIterator();		// Creates iterator instance
		System.out.println("Durham College TV Listings:");
		printTVListings(DCIterator);						// Calls other method using the iterator as param
		System.out.println("UOIT TV Listings:");
		printTVListings(UOITIterator);
	}
	
	/**
	 * This method iterates through each guide and prints the contents
	 * @param  iterator  the iterator that you want to be traversed
	 */
	private void printTVListings(Iterator iterator){
		while (iterator.hasNext()) {
			TVListings listings = (TVListings)iterator.next();
			System.out.print("Showing: " + listings.getTitle() + " ");	// Gets the title of the current listing and prints it
			System.out.print("At: " + listings.getTime() + "\n");		// Gets the time of the current listing and prints it
		}
	}
}
