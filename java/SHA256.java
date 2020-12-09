
import java.security.*;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets;  
  
// Java program to calculate SHA hash value  
public class SHA256 {  
    public static void main(String args[]) 
    {  
        return getMd5(${JSON.Stringfy(input.value)});
    }
    public static String getSHA256(String input) 
    { 
        try { 
            // getInstance() method is called with algorithm SHA-1 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
  
            // digest() method is called to calculate message digest 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            return hashtext; 
        } 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
}  