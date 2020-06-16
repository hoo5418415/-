package fcu.iecs.q2;

public class Bank {

  private Account[] accounts = new Account[10];
  public int number = 0;
  /** . hello */
  
  public boolean createAccount(String personId) {
    if (number > 9) {
      return false;
    } else {
      accounts[number] = new Account();
      accounts[number].setBalance(100);
      accounts[number].setPersonId(personId);
      number++;
      return true;
    }
  }
  /** . hello 2nd. */
  
  public float withdraw(String personId, float money) {
    int ia;
    int id = 0;
    for (ia = 0; ia <= number; ia++) {
      if (accounts[ia].getPersonId().equals(personId) == true) {
        id = ia;
        break;
      }
    }
    float newmoney = accounts[id].getBalance() - money;
    accounts[id].setBalance(newmoney);
    if (accounts[id].getBalance() >= 0) {
      return accounts[id].getBalance();
    } else {
      return -1;
    }
  }
  /** . hello 3rd. */
  
  public float deposit(String personId, float money) {
    int ia;
    int id = 0;
    for (ia = 0; ia <= number; ia++) {
      if (accounts[ia].getPersonId().equals(personId) == true) {
        id = ia;
        break;
      }
    }
    float newmoney = accounts[id].getBalance() + money;
    accounts[id].setBalance(newmoney);
    return newmoney;
  }

  public Account[] getAccounts() {
    Account[] tmp = accounts;
    return tmp;
  }
}
