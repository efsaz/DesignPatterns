package EXc.builder2;

import EXc.builder2.items.*;

public class PromoKit {
	private Item videoPart=new Video();
	private Item garmentPart=new Garment();;
	private Item bookPart=new Book();;
	
	public Item getVideoPart() {
		return videoPart;
	}
	public void setVideoPart(String videoPart) {
		this.videoPart.setTitle(videoPart);
	}
	public Item getGarmentPart() {
		return garmentPart;
	}
	public void setGarmentPart(String garmentPart) {
		this.garmentPart.setTitle(garmentPart);
	}
	public Item getBookPart() {
		return bookPart;
	}
	public void setBookPart(String bookPart) {
		this.bookPart.setTitle(bookPart);
	}
	
	public void getPromoKit() {
		System.out.println("videoPart: " + getVideoPart() + 
				" garmentPart: " + getGarmentPart() + " bookPart: " + 
				getBookPart());
	}

}
