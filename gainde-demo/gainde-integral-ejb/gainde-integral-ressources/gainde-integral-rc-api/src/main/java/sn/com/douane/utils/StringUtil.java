package sn.com.douane.utils;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * String Utility Class This is used to encode passwords programmatically
 * 
 * <p>
 * <a h ref="StringUtil.java.html"> <i>View Source </i> </a>
 * </p>
 * 
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible </a>
 */
public class StringUtil {
    private final static Log log = LogFactory.getLog(StringUtil.class);

    /**
     * Encode a string using algorithm specified in web.xml and return the
     * resulting encrypted password. If exception, the plain credentials string
     * is returned
     * 
     * @param password
     *            Password or other credentials to use in authenticating this
     *            username
     * @param algorithm
     *            Algorithm used to do the digest
     * 
     * @return encypted password based on the algorithm.
     */
    public static String encodePassword(String password, String algorithm) {
        byte[] unencodedPassword = password.getBytes();

        MessageDigest md = null;

        try {
            // first create an instance, given the provider
            md = MessageDigest.getInstance(algorithm);
        } catch (Exception e) {
            log.error(e.getMessage(),e);

            return password;
        }

        md.reset();

        // call the update method one or more times
        // (useful when you don't know the size of your data, eg. stream)
        md.update(unencodedPassword);

        // now calculate the hash
        byte[] encodedPassword = md.digest();

        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < encodedPassword.length; i++) {
            if ((encodedPassword[i] & 0xff) < 0x10) {
                buf.append("0");
            }

            buf.append(Long.toString(encodedPassword[i] & 0xff, 16));
        }

        return buf.toString();
    }

    /**
     * Encode a string using Base64 encoding. Used when storing passwords as
     * cookies.
     * 
     * This is weak encoding in that anyone can use the decodeString routine to
     * reverse the encoding.
     * 
     * @param str
     * @return String
     */
//    public static String encodeString(String str) {
//        sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
//
//        return encoder.encodeBuffer(str.getBytes()).trim();
//    }

    /**
     * Decode a string using Base64 encoding.
     * 
     * @param str
     * @return String
     */
//    public static String decodeString(String str) {
//        sun.misc.BASE64Decoder dec = new sun.misc.BASE64Decoder();
//
//        try {
//            return new String(dec.decodeBuffer(str));
//        } catch (IOException io) {
//            throw new RuntimeException(io.getMessage(), io.getCause());
//        }
//    }

    /**
     * methode util
     * 
     * @param string
     * @return
     */
    public static boolean isNullOrEmpty(String string) {
        if (string == null || string.trim().length() <= 0){
            return true;
        }
        return false;
    }

    /**
     * methode util
     * 
     * @param string
     * @return
     */
    public static boolean isEmpty(String string) {
        return string.trim().length() == 0;
    }

    /**
     * @param strvect
     * @param separator
     * @return
     */
    public static final List explode(String strvect, String separator) {
        if ((strvect == null) || (strvect.trim().compareTo("") == 0)) {
            return new ArrayList();
        }

        List vect = new ArrayList();

        if (strvect.compareTo("") != 0) {
            if (strvect.indexOf(separator) < 0) {
                // il s'agit d'un seul element
                vect.add(strvect);
            } else {
                while (strvect.indexOf(separator) >= 0) {
                    // insertion du premier element
                    String st = strvect
                            .substring(0, strvect.indexOf(separator));
                    strvect = strvect.substring(strvect.indexOf(separator)
                            + separator.length(), strvect.length());
                    vect.add(st);
                }

                if (strvect.compareTo("") != 0) {
                    // insertion du dernier element
                    vect.add(strvect);
                }
            }
        }

        return vect;
    }
}