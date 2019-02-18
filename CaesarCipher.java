
/**
 * Description of CeaserCypher.
 * 
 * @author Hozaifa 
 * @version 1.2
 */
public class CaesarCipher {
  private String alphabet;
  private String shifted_alphabet;
  
  public CaesarCipher(int key) {
      alphabet = "ABCDEFGHIJKLMNOPQRESTUVWXYZ";
      shifted_alphabet = alphabet.substring(key) + alphabet.substring(0,key);
  }
  
  public String encrypt(String input) {
    StringBuilder sb = new StringBuilder(input);
    for(int i=0; i<sb.length(); i++) {
        char c = sb.charAt(i);
        int idx = alphabet.indexOf(c);
        if (idx != -1) {
            c = shifted_alphabet.charAt(idx);
            sb.setCharAt(i,c);
        }
    }
    return sb.toString();
  }
  public void run(String arg){
    String encrypted_messege = encrypt(arg.toUpperCase());
    System.out.println(encrypted_messege);
  }
}
