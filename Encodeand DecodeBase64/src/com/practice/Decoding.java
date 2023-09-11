package com.practice;

import java.util.Base64;

public class Decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an encoded String to decode
        String encoded
            = "SW5kaWEgVGVhbSB3aWxsIHdpbiB0aGUgQ3Vw";
 
        // print encoded String
        System.out.println("Encoded String:\n"
                           + encoded);
 
        // decode into String from encoded format
        byte[] actualByte = Base64.getDecoder()
                                .decode(encoded);
 
        String actualString = new String(actualByte);
 
        // print actual String
        System.out.println("actual String:\n"
                           + actualString);

	}

}
