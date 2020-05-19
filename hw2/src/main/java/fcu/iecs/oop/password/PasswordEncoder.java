package fcu.iecs.oop.password;

public class PasswordEncoder {
  /**.
   * why checkstyle doesn't work.
   * this program just encode your password.
   */
  public String newword;
  /** is it necessary?.*/
  public String encode(String password) {
    /**.
    *no comment.
    */
    newword = password.replace('A', '4');
    newword = newword.replace('a', '4');
    newword = newword.replace('E', '3');
    newword = newword.replace('e', '3');
    newword = newword.replace('I', '1');
    newword = newword.replace('i', '1');
    newword = newword.replace('O', '0');
    newword = newword.replace('o', '0');
    newword = newword.replace('T', '7');
    newword = newword.replace('t', '7');
    return newword;
  }
}
