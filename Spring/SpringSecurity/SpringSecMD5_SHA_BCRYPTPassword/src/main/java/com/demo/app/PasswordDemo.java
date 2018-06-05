package com.demo.app;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class PasswordDemo {
	
	public String getMD5Hash(String plainText) {
		
		Md5PasswordEncoder encoder =  new Md5PasswordEncoder();		
		String encrypted = encoder.encodePassword(plainText, null);	
		System.out.println("encrypted password:"+encrypted);
		return encrypted;
	}
	
	public String getSHAHash(String plainText) {
		
		ShaPasswordEncoder encoder =  new ShaPasswordEncoder();		
		String encrypted = encoder.encodePassword(plainText, null);	
		System.out.println("encrypted password:"+encrypted);
		return encrypted;
	}
	
	public String getBCryptHash(String plainText) {
		
		BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();		
		String encrypted = encoder.encode(plainText);
		System.out.println("encrypted password:"+encrypted);
		return encrypted;
	}

}
