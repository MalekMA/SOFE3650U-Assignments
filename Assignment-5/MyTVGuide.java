
public class MyTVGuide {
	CDCGuide DCGuide;
	CUOITGuide UOITGuide;
	
	public MyTVGuide(CDCGuide DCGuide, CUOITGuide UOITGuide){
		this.DCGuide = DCGuide;
		this.UOITGuide = UOITGuide;
	}
	
	public void printTVListings(){
		Iterator DCIterator = (Iterator) DCGuide.createIterator();
		Iterator UOITIterator = (Iterator) UOITGuide.createIterator();
		System.out.println("Durham College TV Listings:");
		printTVListings(DCIterator);
		System.out.println("UOIT TV Listings:");
		printTVListings(UOITIterator);
	}
	
	private void printTVListings(Iterator iterator){
		while (iterator.hasNext()) {
			TVListings listings = (TVListings)iterator.next();
			System.out.print("Showing: " + listings.getTitle() + " ");
			System.out.print("At: " + listings.getTime() + "\n");
		}
	}
}
