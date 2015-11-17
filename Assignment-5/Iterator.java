/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
public interface Iterator {
	
	// The hasNext method is provided in order to check if the data structures are empty 
	// and to know when the end of the data structure is reached
	public boolean hasNext();
	
	// The next method is provided in order to obtain the arguments inside the data structures
	public TVListings next();
}
