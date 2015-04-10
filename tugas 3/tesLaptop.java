class tesLaptop{
	public static void main(String[] args) {
		laptop pertama = new laptop();
		laptop kedua = new laptop("toshiba", "hitam");
		laptop ketiga = new laptop("dell","biru", "Terhubung");
		laptop keempat = new laptop("asus", "putih", "Terhubung", 45);
		System.out.println("merk = "+ pertama.getMerk () + "warna = "+ pertama.getWarna () + "wifi = "+ pertama.getWifi () +"baterai" +pertama.getBaterai());
		System.out.println("merk = "+ kedua.getMerk ()+ "warna = "+ kedua.getWarna ()+ "wifi = "+ kedua.getWifi());
		System.out.println("merk = "+ ketiga.getMerk ()+ "warna = "+ ketiga.getWarna ()+ "wifi= "+ ketiga.getWifi());
		System.out.println("merk ="+ keempat.getMerk ()+ "warna = "+ keempat.getWarna ()+ "wifi= "+ keempat.getWifi() + "baterai"+keempat.getBaterai());
	}
 }