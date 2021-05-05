package Epam.Applications.Part6_Ex1_Library.utils;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/*
To generate MD5 hash of a string in Java you need java.security.MessageDigest.
Call MessageDigest.getInstance("MD5") to get a MD5 instance of MessageDigest you can use.
The compute the hash by doing one of:
Feed the entire input as a byte[] and calculate the hash in one operation with md.digest(bytes).
Feed the MessageDigest one byte[] chunk at a time by calling md.update(bytes).
When you're done adding input bytes, calculate the hash with md.digest().
The byte[] returned by md.digest() is the MD5 hash.
*/

public class PasswordUtil {

    public static boolean verifyUserPassword(String inPassword, String encryptedPassword) {
        return encryptedPassword.equals(md5Custom(inPassword));
    }

    public static String md5Custom(String st) {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }

        return md5Hex;
    }

/*
 // if you forgot the password, then generate a new one and replace the existing password in the folder "files".

        public static void main(String[] args) {
        System.out.println(md5Custom("1234"));
    }*/
}
