package com.example.merve.actionbar;

/**
 * Created by Merve on 17.06.2017.
 */

public class Kisiler {
    String isim;
    boolean kadinMi;


    public Kisiler(String isim, boolean kadinMi) {
        super();
        this.isim = isim;
        this.kadinMi = kadinMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isKadinMi() {
        return kadinMi;
    }

    public void setKadinMi(boolean kadinMi) {
        this.kadinMi = kadinMi;
    }


}

