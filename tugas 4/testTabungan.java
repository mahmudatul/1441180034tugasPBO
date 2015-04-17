class testTabungan {
	public static void main(String[] args) {
		tabungan nina = new tabungan();

		System.out.println("simpanan 	=" +nina.setsimpanan());
		System.out.println("pemilikRek 	=" +nina.setpemilikRek());
		System.out.println("noRek 		=" +nina.getnoRekening());
		System.out.println("bunga 		=" +nina.getbunga());
		nina.menabung();
		System.out.println(" ");




tabungan mahmudatul = new tabungan("Mahmudatul","BNI");

		System.out.println("simpanan 	=" +mahmudatul.setsimpanan());
		System.out.println("pemilikRek 	=" +mahmudatul.setpemilikRek());
		mahmudatul.mengambil();
		System.out.println(" ");



tabungan dyah = new tabungan("dyah","Danamon",144118057);
		
		System.out.println("simpanan 	=" +dyah.setsimpanan());
		System.out.println("pemilikRek 	=" +dyah.setpemilikRek());
		System.out.println("noRek 		=" +dyah.getnoRekening());
		dyah.transfer();
		System.out.println("");



tabungan tita = new tabungan("Tita","Mandiri",1441180165,90);

		System.out.println("simpanan 	=" +tita.setsimpanan());
		System.out.println("pemilikRek 	=" +tita.setpemilikRek());
		System.out.println("noRek 		=" +tita.getnoRekening());
		System.out.println("bunga 		=" +tita.getbunga());
		tita.menerimaTransfer();
		System.out.println(" ");
	





	}

}