package week3day1;

public class BankInfo {

	public void savings(String Name) {
		System.out.println(Name);
	}

	public void fixed(int Amount) {
		System.out.println(Amount);

	}

	public void depoist(int period, int amnt) {
		System.out.println(period + amnt);

	}

	public static void main(String[] args) {

		BankInfo get = new BankInfo();

		get.depoist(2, 20000);
		get.fixed(40000);
		get.savings("Siva");
	}

}
