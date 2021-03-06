/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
import java.util.Iterator;
import java.util.ArrayList;

/**
 * The CDCGuide class provides an Array List which includes some default TV Listings in order
 * to have a TV Guide.
 */
public class CDCGuide implements Guide {

	ArrayList<TVListings> myListings;					// Create a new ArrayList called myListings
	
	// Constructor for the CDCGuide class
	public CDCGuide(){
		myListings = new ArrayList<TVListings>();	
		
		addListing("Cartoon", "12:00");
		addListing("Reality", "13:00");
		addListing("News", "14:30");
		addListing("Sports", "18:00");
		// Default TV shows to enter into Array List
	}
	
	/**
	 * The addListing method adds the TV Listings from the constructor into the Array List
	 * @param  title  the title of the TV show entered
	 * @param  time   the time when the show is being shown
	 */
	public void addListing(String title, String time){
		TVListings listing = new TVListings(title, time);		// Creates a new instance of TVListings 
		myListings.add(listing);					// Adds the listing into the Array List
	}
	
	/**
	 * @return  myListings  returns the Array List
	 */
	public ArrayList<TVListings> getTVListings(){
		return myListings;
	}
	
	/**
	 * Creates a new instance of the CDCGuideIterator and sends the myListings Array List
	 * @return CDCGuideIterator with myListings Array List as argument
	 */
	public Iterator<TVListings> createIterator() {
		return new CDCGuideIterator(myListings);
	}

}

