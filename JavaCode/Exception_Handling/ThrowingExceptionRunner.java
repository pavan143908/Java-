//created on 30/07/2025

package exception.handling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws Exception {
		if (!this.currency.equals(that.currency)) {
			// throw new Exception("currency dont match : " + this.currency + " " +
			// that.currency);
			throw new CurrenciesDonotMatchException("currency dont match : " + this.currency + " " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "currency:" + currency + " amount:" + amount;
	}

	// throwing a custom Exception

	class CurrenciesDonotMatchException extends Exception {
		public CurrenciesDonotMatchException(String msg) {
			super(msg);

		}
	}

	public class ThrowingExceptionRunner {

		public static void main(String[] args) {
			Amount amnt1 = new Amount("USD", 20);

			Amount amnt2 = new Amount("IND", 40);
			try {
				amnt1.add(amnt2);
			} catch (Exception e) {

				e.printStackTrace();
			}

			System.out.println(amnt1);
		}

	}
}
