package EXc.builder2;
public abstract class PromoKitBuilder {
	protected PromoKit promoKit = new PromoKit();
	public abstract void buildVideoPart();
	public abstract void buildGarmentPart();
	public abstract void buildBookPart();
	public abstract PromoKit getPromoKit();
}
