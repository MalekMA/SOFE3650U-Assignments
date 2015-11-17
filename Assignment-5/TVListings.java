
public class TVListings implements TVListingsInt {
	
	String title;
	String time;
	
	public TVListings(String title, String time){
		this.title = title;
		this.time = time;
	}
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getTime() {
		return time;
	}
}
