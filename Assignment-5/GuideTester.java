
public class GuideTester {
	public static void main(String args[]){
		
		CDCGuide DCGuide = new CDCGuide();
		CUOITGuide UOITGuide = new CUOITGuide();
		MyTVGuide guide = new MyTVGuide(DCGuide, UOITGuide);
		guide.printTVListings();
		
	}
}
