import java.security.*;
import java.math.BigInteger; 
  
// Java program to calculate MD5 hash value 
public class MD5 { 
	 public static void main(String args[]) throws NoSuchAlgorithmException 
	    { 
	        return getMd5(${JSON.Stringfy(input.value)});
	    } 
	 
    public static String getMd5(String input) 
    { 
        try { 
  
            //getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
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