import java.util.ArrayList;


public class CDCGuideIterator implements Iterator, java.util.Iterator<TVListings>{
	
	ArrayList<TVListings> myListings = new ArrayList<TVListings>();
	int position = 0;
	
	public CDCGuideIterator(ArrayList<TVListings> listings){
		this.myListings = listings;
	}
	
	@Override
	public TVListings next() {
		TVListings listings = myListings.get(position);
		position++;
		return listings;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= myListings.size() || myListings.get(position) == null){
			return false;
		}
		else {
			return true;
		}
	}
}
