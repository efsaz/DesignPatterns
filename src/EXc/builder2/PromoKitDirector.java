package EXc.builder2;
public class PromoKitDirector {
		public PromoKit createPromoKit(PromoKitBuilder builder) {
			builder.buildVideoPart();
			builder.buildGarmentPart();
			builder.buildBookPart();
			return builder.getPromoKit();
		}
	}
	// Integration with overal application
	