package com.example.syayfulhidayat;

public class DataClass {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    private String dataTitle;
    private int dataDesc;
    private String dataLang;
    private int dataImage;

    public String getDataTitle() {
        return dataTitle;
    }

    public int getDataDesc() {
        return dataDesc;
    }

    public String getDataLang() {
        return dataLang;
    }

    public int getDataImage() {
        return dataImage;
    }

    public DataClass(String dataTitle, int dataDesc, String dataLang, int dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
    }


}
