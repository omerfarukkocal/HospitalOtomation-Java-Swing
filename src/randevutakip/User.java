/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randevutakip;

/**
 *
 * @author ÖMERFARUKKOÇAL
 */
class User {
    private String isim, soyisim, dogumtarihi, ceptelefonu, doktorismi, hastane;
    private int ucret;
    
    
    public User(String isim, String soyisim, String dogumtarihi, String ceptelefonu, String doktorismi, String hastane, int ucret) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
        this.ceptelefonu = ceptelefonu;
        this.doktorismi = doktorismi;
        this.hastane = hastane;
        this.ucret = ucret;
    }
    
    public String getIsim() {
        return isim;
    }
    public String getSoyisim() {
        return soyisim;
    }
    public String getDogumtarihi() {
        return dogumtarihi;
    }
    public String getCeptelefonu() {
        return ceptelefonu;
    }
    public String getDoktorismi() {
        return doktorismi;
    }
    public String getHastane() {
        return hastane;
    }
    public int getUcret() {
        return ucret;
    }
    
    
    
    
}
