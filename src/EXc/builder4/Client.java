package EXc.builder4;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount.Builder(1234L)
        .withOwner("Marge")
        .atBranch("Springfield")
        .openingBalance(100)
        .atRate(2.5)
        .build();
		BankAccount anotherAccount = new BankAccount.Builder(4567L)
        .withOwner("Homer")
        .atBranch("Springfield")
        .openingBalance(100)
        .atRate(2.5)
        .build();
	}

}
