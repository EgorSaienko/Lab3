package customer;

import account.Account;

public class PersonCustomer extends Customer{

    protected String surname;

    public PersonCustomer(String name, String surname, String email, Account account) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.account = account;
    }

    public void withdraw(double sum, String currency) {
        super.withdraw(sum, currency);
        if (account.getMoney() < 0) {
            account.setMoney((account.getMoney() - sum) - sum * account.overdraftFee());
        } else {
            account.setMoney(account.getMoney() - sum);
        }
    }
}
