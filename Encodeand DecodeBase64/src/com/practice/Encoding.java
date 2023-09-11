package com.practice;

import java.util.Base64;

public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample = "India Team will win the Cup";
		
		  // print actual String
        System.out.println("Sample String:\n"
                           + sample);
        
        // Encode into Base64 format
        String string_base64=Base64.getEncoder().encodeToString(sample.getBytes());
        
        System.out.println(string_base64);
	}

}
