/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
import java.util.ArrayList;

/**
 * The CDCGuideIterator class allows us to traverse the CDCGuide collection
 */
public class CDCGuideIterator implements Iterator, java.util.Iterator<TVListings>{
	
	ArrayList<TVListings> myListings = new ArrayList<TVListings>();	// Creates a local Array List
	int position = 0;						// Creates a local variable position to be used in iteration
	
	/**
	 * CDCGuideIterator constructor
	 * @param  listings  the Array List from CDCGuide is needed as a parameter
	 */
	public CDCGuideIterator(ArrayList<TVListings> listings){
		this.myListings = listings;				// Stores the Array List from CDCGuide into the local one
	}
	
	/**
	 * The next method gets the contents of the Array List
	 * @return  listings  the listings that are stored in the Array List
	 */
	public TVListings next() {
		TVListings listings = myListings.get(position);		// Gets the current listing at index position from the Array List
		position++;						// Increment position by 1 in order to get next element in Array List
		return listings;					// Returns the current argument
	}
	
	/**
	 * The hasNext method checks if the iteration has reached it's end by checking if the argument at position
	 * in the Array List is empty
	 * @return false  if the current position in the Array List is null
	 * @return true   if the current position still holds an argument
	 */
	public boolean hasNext() {
		if(position >= myListings.size() || myListings.get(position) == null){
			return false;
		}							// Checks if the current position still holds an argument
		else {
			return true;
		}
	}
}
