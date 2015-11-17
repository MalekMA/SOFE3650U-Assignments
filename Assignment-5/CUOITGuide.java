import java.util.Iterator;
import java.util.LinkedList;


public class CUOITGuide implements Guide{
	
	LinkedList<TVListings> myListings;
	
	public CUOITGuide(){
		myListings = new LinkedList<TVListings>();
		
		addListing("News at Noon", "12:00");
		addListing("Comedy Special", "15:00");
		addListing("Live Event", "17:00");
		addListing("Cars!", "20:00");
	}
	
	public void addListing(String title, String time){
		TVListings listing = new TVListings(title, time);
		myListings.add(listing);
	}
	
	public LinkedList<TVListings> getTVListings(){
		return myListings;
	}
	
	
	@Override
	public Iterator<TVListings> createIterator() {
		return new CUOITGuideIterator(myListings);
	}



}
