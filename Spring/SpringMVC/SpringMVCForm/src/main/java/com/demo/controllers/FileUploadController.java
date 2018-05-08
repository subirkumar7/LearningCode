package com.demo.controllers;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping(value="/myForm")
	public String myForm() {
		
		return "myForm";
	}
	
	@RequestMapping(value="/handleForm")
	public String handleForm(@RequestParam("file") MultipartFile file) {
		
		
		try {
			if(!file.isEmpty()) {
				byte[] bytes;
				
					bytes = file.getBytes();
			
				FileOutputStream fos= new FileOutputStream("c:\\debug\\abc.jpg");
				fos.write(bytes);
				fos.close();
				System.out.println("Upload successful!");
			} else {
				System.out.println("No file avaliable for upload");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "operationComplete";
	}

}
