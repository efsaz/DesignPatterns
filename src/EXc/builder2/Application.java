package EXc.builder2;
public class Application {
		public static void main(String[] args) {
			String gendre = "M";
			PromoKitDirector director = new PromoKitDirector();
			PromoKitBuilder promoKitBuilder = null;

			if (gendre.equals("M")) {
				promoKitBuilder = new MenPromoKitBuilder();
			} else if (gendre.equals("F")) {
				promoKitBuilder = new WomenPromoKitBuilder();
			} else {
				// ....
			}
			PromoKit result = director.createPromoKit(promoKitBuilder);
			result.getPromoKit();
		}
	}
    	