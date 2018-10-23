package classesandobjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.FirstName = "Tom";
		tom.LastName = "Smith";
		tom.Age = 21;
		tom.AccountBalance = 10000;
		tom.EligibleForCC();

		henry.FirstName = "Henry";
		henry.LastName = "Jones";
		henry.Age = 30;
		henry.AccountBalance = 30000;
		henry.EligibleForCC();

		sarah.FirstName = "Sarah";
		sarah.LastName = "Cruz";
		sarah.Age = 35;
		sarah.AccountBalance = 35000;
		sarah.EligibleForCC();

	}

}
