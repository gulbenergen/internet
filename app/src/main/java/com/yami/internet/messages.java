package com.yami.internet;

public class messages {
    private String Title;
    private String Content;
    public static final messages[] mess = {
            new messages("سایر", "سلام علیکم"),
            new messages("صایم", "saber azimi"),
            new messages("Diavolo", "yaser azimi")

    };

    private messages(String tit, String Cont) {
        this.Title = tit;
        this.Content = Cont;
    }
    public String getTitle() {
        return Title;
    }
    public String getContent() {
        return Content;
    }
}
