class Asimo extends robot{
	private int sensor;
	private int camera;

	public Asimo (int inputSensor, int inputServo,int inputPower, int inputCamera){
		sensor = inputSensor;
		servo = inputServo;
		power = inputPower;
		camera = inputCamera;
	}
		
	public void CetakSpesifikasi(){
		System.out.println("Jumlah Sensor Robot : " + getSensor());
		System.out.println("Jumlah Sensor Asimo : " + sensor);
		System.out.println("Jumlah Servo : " + servo);
		System.out.println("Kapasitas Power : " + power);
		System.out.println("Jumlah Kamera : " + camera);
	}
	public void Upgrade(int sensor){
		System.out.println("Asimo diupgrade dengan jumlah: "+sensor);
	}
}
public