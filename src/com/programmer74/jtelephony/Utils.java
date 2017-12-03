package com.programmer74.jtelephony;

import java.security.MessageDigest;
import java.util.Base64;

public class Utils {
    public static String stringToMD5(String input) {
        try {
            String original = input;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(original.getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (Exception ex) {
            return "";
        }
    }
    public static String Base64Encode(String input) {
        byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
        return new String(encodedBytes);
    }
    public static String Base64Decode(String input) {
        byte[] encodedBytes = Base64.getDecoder().decode(input.getBytes());
        return new String(encodedBytes);
    }
    public static String Base64EncodeBytes(byte[] input) {
        byte[] encodedBytes = Base64.getEncoder().encode(input);
        return new String(encodedBytes);
    }
}
