package tugas;

/**
 * Created by user on 11/06/2015.
 */
public class bola {
    private String warnaBola;
    private String bahanBola;
    private int ukuranBola;
    private int beratBola;


    public bola() {
    }

    public bola(String warnaBola, String bahanBola, int ukuranBola) {
        this.warnaBola = warnaBola;
        this.bahanBola = bahanBola;
        this.ukuranBola = ukuranBola;
    }

    public bola(String warnaBola, String bahanBola, int ukuranBola, int beratBola) {
        this.warnaBola = warnaBola;
        this.bahanBola = bahanBola;
        this.ukuranBola = ukuranBola;
        this.beratBola = beratBola;
    }

    public String getWarnaBola() {
        return warnaBola;
    }

    public void setWarnaBola(String warnaBola) {
        this.warnaBola = warnaBola;
    }

    public String getBahanBola() {
        return bahanBola;
    }

    public void setBahanBola(String bahanBola) {
        this.bahanBola = bahanBola;
    }

    public int getUkuranBola() {
        return ukuranBola;
    }

    public void setUkuranBola(int ukuranBola) {
        this.ukuranBola = ukuranBola;
    }

    public int getBeratBola() {
        return beratBola;
    }

    public void setBeratBola(int beratBola) {
        this.beratBola = beratBola;
    }

    @Override
    public String toString() {
        return "bola{" +
                "warnaBola='" + warnaBola + '\'' +
                ", bahanBola='" + bahanBola + '\'' +
                ", ukuranBola=" + ukuranBola +
                ", beratBola=" + beratBola +
                '}';
    }
}
