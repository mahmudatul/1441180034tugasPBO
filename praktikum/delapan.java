public class  delapan {
	public static void main(String[] args) {
		int b;
		for (b=1; b<21; b++){
			if(b%5==0){
				System.out.print("JONI");
			}
			else {
				System.out.print(b+ "");
			}
			
			if (b%11==0){
				System.out.println("\b");
			}
		}
	}
	
}