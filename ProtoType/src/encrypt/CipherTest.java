package encrypt;

import java.security.SecureRandom;
import java.security.KeyStore.SecretKeyEntry;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.regexp.internal.REUtil;

public class CipherTest {
	
    public  byte[] Encrypt(String string, String sKey) throws Exception {
    	try{
    		KeyGenerator kgen = KeyGenerator.getInstance("AES");
    		kgen.init(128, new SecureRandom(sKey.getBytes()));
    		SecretKey secretKey = kgen.generateKey();
    		
    		SecretKeySpec key = new SecretKeySpec(secretKey.getEncoded(), "AES");
    		
    		Cipher cipher = Cipher.getInstance("AES");
    		cipher.init(Cipher.ENCRYPT_MODE, key);
    		byte [] result = cipher.doFinal(string.getBytes("utf-8"));
    		return result;
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	return null;
    }
    public  byte[] Decrypt(byte[] string, String sKey) throws Exception {
    	try{
    		KeyGenerator kgen = KeyGenerator.getInstance("AES");
    		kgen.init(128, new SecureRandom(sKey.getBytes()));
    		SecretKey secretKey = kgen.generateKey();
//    		
    		SecretKeySpec key = new SecretKeySpec(secretKey.getEncoded(), "AES");
    		
    		Cipher cipher = Cipher.getInstance("AES");
    		cipher.init(Cipher.DECRYPT_MODE, key);
    		byte [] result = cipher.doFinal(string);
    		return result;
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }
    
    public static void main(String[] args) throws Exception {
    	int [][][] arr = new int[1][0][-1];
		String key  = "cuixi";
		CipherTest test = new CipherTest();
		byte[] result = test.Encrypt("sunmeng", key);
		
		
		System.out.println(new String(result));
		
		System.out.println(new String(test.Decrypt(result, key)));
		
		System.out.println();
    	
    	float num = -11111111111111.0F;
    	
    	System.out.println((int)num);
    	
		
		
	}
    
    private static byte[] hex2byte(String strhex) {
        if (strhex == null) {
            return null;
        }
        int l = strhex.length();
        if (l % 2 == 1) {
            return null;
        }
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++) {
            b[i] = (byte) Integer.parseInt(strhex.substring(i * 2, i * 2 + 2), 16);
        }
        return b;
    }
    private static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs.toUpperCase();
    }
}
