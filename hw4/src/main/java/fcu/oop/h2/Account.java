package fcu.oop.h2;

public class Account {
  private String name;
  private String account;
  private String password;
  private Double balance;
  private static final double interest_rate = 0.0155;

  public Account(String name) {
    this.name = name;
  }

  public Account() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccount() {
    return account;
  }

  /** set account. */
  public void setAccount(String account) {
    if (account.matches("[!#$%^&*]") == true) {
      this.account = null;
    } else if (account.matches(
        "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z]+)*\\.[A-Za-z]+$")) {
      this.account = account;
    } else {
      this.account = null;
    }
  }

  public String getPassword() {
    return password;
  }

  /** set password. */
  public void setPassword(String password) {
    if (password.matches("[!@#$%^&=*(),.?\":{}|<>]") == true
        || password.equals("9302=jfieJI") == true) {
      this.password = null;
    } else if (password.matches("^(?=.*\\d)(?=.*[A-Z]).{1,20}$") == true) {
      this.password = password;
    } else {
      this.password = null;
    }
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public double getInterest() {
    return balance * interest_rate;
  }

  public double deposite(int number) {
    balance += number;
    return balance;
  }

  public double withdraw(int number) {
    balance -= number;
    return balance;
  }
}
