package com.bagirapp.radiogroup;

public class Gyerekek {
     String nev;
     String[] konyvek = new String[2];
     private int state = -1;


    public Gyerekek(String nev, String konyv1, String konyv2 ){
        this.nev = nev;
        this.konyvek[0] = konyv1;
        this.konyvek[1] = konyv2;
    }

    public String[] getKonyvek() {
        return konyvek;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }


}
