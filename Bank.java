class Account {
	int balance;
	Account(int balance){
		this.balance = balance;
	}
	public int getSal() {
		return this.balance;
	}
}

class Saving extends Account {
	int fixedDeposit;
	Saving(int balance,int fixedDeposit)  {
		super(balance);
		this.fixedDeposit=fixedDeposit;
	}
	public int getSal() {
		return super.getSal()+this.fixedDeposit;
	}

}

class Current extends Account {
	int cashCredit;
	Current(int balance,int cashCredit)  {
		super(balance);
		this.cashCredit=cashCredit;
	}
	public int getSal() {
		return super.getSal()+this.cashCredit;
	}
}

public class Bank {
	public static void main(String[] args) {
		Account a[]=new Account[2];
		Saving s=new Saving(5000,700);
		Current c=new Current(7000,900);
		a[0]=s;
		a[1]=c;
		for(Account e : a) {
			System.out.println(" "+e.getSal());
		}
	}
}