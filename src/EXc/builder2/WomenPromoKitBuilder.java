package EXc.builder2;
public class WomenPromoKitBuilder extends PromoKitBuilder {
	public void buildVideoPart() {
		// add videos to PromoKit based on men-specific preferences
		promoKit.setVideoPart("romance film");
	}
	public void buildGarmentPart() {
		// add men garments to PromoKit 
		promoKit.setGarmentPart("shoes and purse");
	}
	public void buildBookPart() {
		// add books to PromoKit based on men-specific preferences
		promoKit.setBookPart("magazine");
	}
		public PromoKit getPromoKit() {
			return promoKit;
		}
	}
	// Director
	