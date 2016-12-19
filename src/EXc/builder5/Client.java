package EXc.builder5;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FluentBuilder vehicleBuilder = new FluentBuilder();
		Product motorcyle = vehicleBuilder.begin()
		  .engine()
		  .steeringWheel()
		  .tire()
		  .tire()
		  .build();
		System.out.println(motorcyle.parts);
	}

}
