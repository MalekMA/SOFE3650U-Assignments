/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The CUOITGuide class provides a Linked List which includes some default TV Listings in order
 * to have a TV Guide.
 */
public class CUOITGuide implements Guide{
	
	LinkedList<TVListings> myListings;				// Creates a Linked List called myListings
	
	//Constructor for the CUOITGuide class
	public CUOITGuide(){
		myListings = new LinkedList<TVListings>();
		
		addListing("News at Noon", "12:00");
		addListing("Comedy Special", "15:00");
		addListing("Live Event", "17:00");
		addListing("Cars!", "20:00");
		// Default TV shows to enter into Linked List
	}
	
	/**
	 * The addListing method adds the TV Listings from the constructor into the Linked List
	 * @param  title  the title of the TV show entered
	 * @param  time   the time when the show is being shown
	 */
	public void addListing(String title, String time){
		TVListings listing = new TVListings(title, time);	// Creates a new instance of TVListings
		myListings.add(listing);				// Adds the listing into the Linked List
	}
	
	/**
	 * @return  myListings  returns the Linked List
	 */
	public LinkedList<TVListings> getTVListings(){
		return myListings;
	}
	
	/**
	 * Creates a new instance of the CUOITGuideIterator and sends the myListings Linked List
	 * @return CUOITGuideIterator with myListings Linked List as argument
	 */
	public Iterator<TVListings> createIterator() {
		return new CUOITGuideIterator(myListings);
	}



}
