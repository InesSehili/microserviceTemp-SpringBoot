package JArduinoTemp;



public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//JArduinoControle arduino = new JArduino("COM4");
		
		JArduinoControle arduino =new JArduino("COM6");
		while(true)
		arduino.digitalRead(8);
		
		
	}

}
