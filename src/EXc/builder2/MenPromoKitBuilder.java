package EXc.builder2;
public class MenPromoKitBuilder extends PromoKitBuilder {
		public void buildVideoPart() {
			// add videos to PromoKit based on men-specific preferences
			promoKit.setVideoPart("action film");
		}
		public void buildGarmentPart() {
			// add men garments to PromoKit 
			promoKit.setGarmentPart("t-shirt and jeans");
		}
		public void buildBookPart() {
			// add books to PromoKit based on men-specific preferences
			promoKit.setBookPart("comics");
		}
		public PromoKit getPromoKit() {
			return promoKit;
		}
	}
	