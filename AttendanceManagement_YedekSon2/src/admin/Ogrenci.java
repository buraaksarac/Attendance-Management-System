
package admin;

/**
 *
 * @author aeren
 */
public class Ogrenci {
    
    private int id;
    private String ad;
    private String soyad;
    private String bolum;

    public Ogrenci(int id, String ad, String soyad,String bolum) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }   
}
