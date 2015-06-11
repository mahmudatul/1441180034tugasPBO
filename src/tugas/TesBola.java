package tugas;

/**
 * Created by user on 11/06/2015.
 */
public class TesBola {
    public static void main(String[] args) {

        bola satu = new bola ("hijau","kulit",45);
        bola dua = new bola ("biru","plastik",30,20);

        PemainBola jeje = new PemainBola("jeje","biru","hijau","putih",satu);
        System.out.println(jeje.toString());
    }
}
