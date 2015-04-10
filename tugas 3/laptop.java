public class  laptop {
	// instance variable
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public laptop()
	{

	merk = "Toshiba";
	warna = "Hitam";
	wifi = "Terhubung";
	baterai = 50;

	}

	public laptop(String merkInput, String warnaInput)
	{

	merk 	= merkInput;
	warna 	= warnaInput;

	}
	public laptop(String merkInput, String warnaInput, String wifiInput)
	{
	merk 	= merkInput;
	warna 	= warnaInput;
	wifi 	= wifiInput;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
	merk 	= merkInput; 
	warna 	= warnaInput;
	wifi 	= wifiInput;
	baterai = bateraiInput;
	}

	
	public void menyala()
	{
		System.out.println("Welcome to laptop");
	}

	public void mati()
	{
		System.out.println("Thankyou have a nice day");
	}

	public void indikatorBaterai()
	{
		System.out.println("baterai tinggal :" + baterai + "%");
	}
	public void indikatorWifi()
	{
		System.out.println("Wifinya : "+ wifi);
	}
	//getter
	public String getMerk()
	{
		return merk;
	}

	public String getWarna()
	{
		return warna;
	}
	public String getWifi()
	{
		return wifi;
	}
	public int getBaterai()
	{
		return baterai;
	}

}