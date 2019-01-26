package com.yami.internet;

public class tasviye {
    private String Title;
    private boolean act;
    private int imageResourceId;
    public static final tasviye[] tasviyyye = {
            new tasviye("آموزش", R.drawable.amozesh,false),
            new tasviye("امور دانشجویان", R.drawable.student,false),
            new tasviye("آزمایشگاه مرکزی", R.drawable.centerlab,true),
            new tasviye("کتابخانه مرکزی", R.drawable.centerlib,true),
            new tasviye("ستاد شاهد و ایثارگر", R.drawable.setadisar,false),
            new tasviye("حراست", R.drawable.herasat,false),
            new tasviye("اداره فارغ التحصیلی", R.drawable.faregh,false),
            new tasviye("امور مالی", R.drawable.omormali,false)
    };

    private tasviye(String tit, int resourceid, boolean acti) {
        this.Title = tit;
        this.act = acti;
        this.imageResourceId=resourceid;
    }
    public String getTitle() {
        return Title;
    }
    public int getimageResourceId() {
        return imageResourceId;
    }
    public boolean getact() {
        return act;
    }
}
