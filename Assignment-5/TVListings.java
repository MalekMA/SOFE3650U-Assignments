/**
 * Done by: 	Malek Mustapha-Abdullah	100541476
 *		Clayton Cheung		100539921
 * Course: 	SOFE3650U Software Design and Architecture
 * Date: 	November 16, 2015
 */
 
 // The TVListings class is used to store the title and time of a listing
public class TVListings implements TVListingsInt {
	
	String title;
	String time;
	
	/**
	 * Constructor for TVListings class
	 * @param  title  the title of the listing
	 * @param  time   the time of the listing
	 */
	public TVListings(String title, String time){
		this.title = title;
		this.time = time;
	}
	
	/**
	 * @return  the title of the listing
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return  the time of the listing
	 */
	public String getTime() {
		return time;
	}
}
