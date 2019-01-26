package com.yami.internet;

public class Omordaneshjoyi {
    private String Title;
    private boolean act;
    private int imageResourceId;
    public static final Omordaneshjoyi[] omor = {
            new Omordaneshjoyi("امور خوابگاه ها", R.drawable.khabgah,false),
            new Omordaneshjoyi("اداره بورس و وام", R.drawable.borsovam,false),
            new Omordaneshjoyi("صدور دفترچه", R.drawable.daftarche,true)
    };

    private Omordaneshjoyi(String tit, int resourceid, boolean acti) {
        this.Title = tit;
        this.act = acti;
        this.imageResourceId=resourceid;
    }
    public String getTitle() {
        return Title;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public boolean getact() {
        return act;
    }
}
