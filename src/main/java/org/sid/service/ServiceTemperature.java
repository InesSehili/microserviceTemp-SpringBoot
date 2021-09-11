package org.sid.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import JArduinoTemp.JArduino;
import JArduinoTemp.JArduinoControle;


@RestController
public class ServiceTemperature {
	JArduinoControle arduino = new JArduino("COM5");
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/recupererTempClim")
	public float recupererIdEmpreinte()
	{  float tempClim=arduino.recupererTempClim();
	System.out.println(tempClim);
	
	return tempClim;}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/diminuerTemClim")
	public void diminuerTemClim()
	{arduino.digitalWrite(12, JArduino.LOW);	
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	arduino.digitalWrite(12, JArduino.HIGH);}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/augmenterTemClim")
	public void augmenterTemClim()
	{arduino.digitalWrite(12, JArduino.LOW);	
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	arduino.digitalWrite(12, JArduino.HIGH);}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/OnClim")
	public void OnClim()
	{arduino.digitalWrite(12, JArduino.HIGH);	
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/OffClim")
	public void OffClim()
	{arduino.digitalWrite(12, JArduino.LOW);	
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetMouvement")
	public int mouvement()
	{ 
		return arduino.digitalRead(8);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
