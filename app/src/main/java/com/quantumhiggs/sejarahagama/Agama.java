package com.quantumhiggs.sejarahagama;

public class Agama {

    private String[] agama = {"Islam","Protestan","Khatolik","Hindu","Buddha","Khonghucu"};
    private String[] sejarahAwal =
            {
                    ""
            };
    private String[] masukIndo =
            {
                    ""
            };
    private int[] gambar = {};

    public String[] getAgama() {
        return agama;
    }

    public void setAgama(String[] agama) {
        this.agama = agama;
    }

    public String[] getSejarahAwal() {
        return sejarahAwal;
    }

    public void setSejarahAwal(String[] sejarahAwal) {
        this.sejarahAwal = sejarahAwal;
    }

    public String[] getMasukIndo() {
        return masukIndo;
    }

    public void setMasukIndo(String[] masukIndo) {
        this.masukIndo = masukIndo;
    }

    public int[] getGambar() {
        return gambar;
    }

    public void setGambar(int[] gambar) {
        this.gambar = gambar;
    }
}
