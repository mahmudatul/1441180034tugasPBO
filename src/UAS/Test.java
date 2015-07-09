package UAS;

import com.sun.org.apache.xerces.internal.xs.XSAttributeUse;

/**
 * Created by user on 09/07/2015.
 */
public class Test {
        public static void main(String[] args) {


                Liga inggris = new Liga("inggris");
                Divisi iLeague1 = new Divisi("I League 1");
                Divisi iLeague2 = new Divisi("I League 2");

                Klub satu1 = new Klub("MU",iLeague1,inggris);
                Klub satu2 = new Klub("Arsenal",iLeague1,inggris);
                Klub dua1 = new Klub("Gillingham",iLeague2,inggris);
                Klub dua2 = new Klub("Barnet",iLeague2,inggris);

                inggris.setDaftarDivisi(iLeague1);
                inggris.setDaftarDivisi(iLeague2);

                inggris.setDaftarKlub(satu1);
                inggris.setDaftarKlub(satu2);
                inggris.setDaftarKlub(dua1);
                inggris.setDaftarKlub(dua2);

                iLeague1.setDaftarKlub(satu1);
                iLeague1.setDaftarKlub(satu2);
                iLeague2.setDaftarKlub(dua1);
                iLeague2.setDaftarKlub(dua2);

                System.out.println("1. Get daftar divisi by nama liga");
                System.out.println("Daftar Divisi dari i - League : " + inggris.getDaftarDivisi());
                System.out.println("");

                System.out.println("2. Get daftar klub by nama liga");
                System.out.println("Daftar Klub dari i - League : " + inggris.getDaftarKlub());
                System.out.println("");

                System.out.println("3. Get daftar klub by nama divisi");
                System.out.println("Daftar Klub dari Divisi i League 1 : " +iLeague1.getDaftarKlub());
                System.out.println("Daftar Klub dari Divisi i League 2 : " +iLeague2.getDaftarKlub());
                System.out.println("");

                System.out.println("4. Get klub ini berada di divisi mana by nama Klub");
                satu1.getNamaKlub();
                System.out.println("Klub                : " + satu1.getNamaKlub());
                System.out.println("Berada pada divisi  : " + satu1.getDivisi());
                System.out.println("");

                System.out.println("5. Get klub ini berada di liga apa by nama klub");
                dua1.getNamaKlub();
                System.out.println("Klub                : " + dua1.getNamaKlub());
                System.out.println("Berada pada liga    : " + dua1.getLiga());
                System.out.println("");

                System.out.println("Liga : " +inggris.getNamaLiga());
                System.out.println("Klub : " +inggris.getDaftarKlub());

            }
        }
