package com.example.application.views.model;

public class Personel {
    private String ad;
    private String soyad;
    private String tc;
    private String kategori;
    private String telefon;
    private String adres;
    private double maas;  


    public Personel(String ad, String soyad, String tc, String kategori, String telefon, String adres, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.kategori = kategori;
        this.telefon = telefon;
        this.adres = adres;
        this.maas = maas;

    }

    public String getAd() { return ad; }  
    public void setAd(String ad) { this.ad = ad; }  

    public String getSoyad() { return soyad; }  
    public void setSoyad(String soyad) { this.soyad = soyad; } 

    public String getTC() { return tc; }  
    public void setTC(String tc) { this.tc = tc; }  

    public String getKategori() { return kategori;}
    public void setKategori(String kategori){this.kategori = kategori;}
    
    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    public String getAdres() { return adres; }
    public void setAdres(String adres) { this.adres = adres; }

    public double getMaas() { return maas; }
    public void setMaas(double maas) { this.maas = maas; }


    
}