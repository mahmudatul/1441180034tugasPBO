public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi)
    {
        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Divisi> daftarKlubByLiga(String namadiliga){
        if (namadiliga=="inggris"){
            return daftarDivisi;
        }else {
            System.out.println("else");
            return daftarDivisi;
        }
    }


    @Override
    public String toString() {
        return "Liga "  + namaLiga  +
                "\nDaftar Divisi= " + daftarDivisi
                ;
    }
}