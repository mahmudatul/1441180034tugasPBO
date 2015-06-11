package tugas;

/**
 * Created by user on 11/06/2015.
 */
public class PemainBola {
    private String namaPemain;
    private String kostumPemain;
    private String sepatuPemain;
    private String kaoskakiPemain;
    private bola bolaPemain;

    public PemainBola() {
    }

    public PemainBola(String namaPemain, String kostumPemain, String sepatuPemain, String kaoskakiPemain, bola bolaPemain) {
        this.namaPemain = namaPemain;
        this.kostumPemain = kostumPemain;
        this.sepatuPemain = sepatuPemain;
        this.kaoskakiPemain = kaoskakiPemain;
        this.bolaPemain = bolaPemain;
    }

    public String getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public String getKostumPemain() {
        return kostumPemain;
    }

    public void setKostumPemain(String kostumPemain) {
        this.kostumPemain = kostumPemain;
    }

    public String getSepatuPemain() {
        return sepatuPemain;
    }

    public void setSepatuPemain(String sepatuPemain) {
        this.sepatuPemain = sepatuPemain;
    }

    public String getKaoskakiPemain() {
        return kaoskakiPemain;
    }

    public void setKaoskakiPemain(String kaoskakiPemain) {
        this.kaoskakiPemain = kaoskakiPemain;
    }

    public bola getBolaPemain() {
        return bolaPemain;
    }

    public void setBolaPemain(bola bolaPemain) {
        this.bolaPemain = bolaPemain;
    }

    @Override
    public String toString() {
        return "PemainBola{" +
                "namaPemain='" + namaPemain + '\'' +
                ", kostumPemain='" + kostumPemain + '\'' +
                ", sepatuPemain='" + sepatuPemain + '\'' +
                ", kaoskakiPemain='" + kaoskakiPemain + '\'' +
                ", bolaPemain=" + bolaPemain +
                '}';
    }
}

