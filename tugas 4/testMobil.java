class testMobil {
	public static void main(String[] args) {
		mobil nina = new mobil();

		System.out.println("merk		=" +nina.getmerk());
		System.out.println("platNomor	=" +nina.getplatNomor());
		System.out.println("warna 		=" +nina.getwarna());
		System.out.println("mesin		=" +nina.getmesin() +"cc");
		System.out.println("kecepatan	=" +nina.getkecepatan() +"km");
		nina.maju();
		System.out.println(" ");	

	 mobil dian = new mobil("Avanza","N1515BA");

		System.out.println("merk		=" +dian.getmerk());
		System.out.println("platNomor	=" +dian.getplatNomor());
		dian.mundur();
		System.out.println(" ");


	mobil ani = new mobil("Zenia","N2615AD","Putih");

		System.out.println("merk		=" +ani.getmerk());
		System.out.println("platNomor 	=" +ani.getplatNomor());
		System.out.println("warna  		=" +ani.getwarna());
		ani.berhenti();
		System.out.println(" ");


	mobil dyah = new mobil("Yaris","M0101CA","Hitam",1500);

		System.out.println("merk		=" +dyah.getmerk());
		System.out.println("platNomor 	=" +dyah.getplatNomor());
		System.out.println("warna  		=" +dyah.getwarna());
		System.out.println("mesin   	=" +dyah.getmesin() +"cc");
		dyah.belok();
		System.out.println(" ");

	mobil mita = new mobil("Ertiga","N4336QL","Silver",1999,100);

		System.out.println("merk		=" +mita.getmerk());
		System.out.println("platNomor 	=" +mita.getplatNomor());
		System.out.println("warna  		=" +mita.getwarna());
		System.out.println("mesin   	=" +mita.getmesin() +"cc");
		System.out.println("kecepatan	=" +mita.getkecepatan() +"km"); 
		mita.ngebut();
		System.out.println(" ");
	

	
}
}