package com.example.android.miwok;

public class Word {
    private String mMiWokWord;
    private String mDefaultLangWord;

    public Word(String defLangWord, String miWok){
        mMiWokWord = miWok;
        mDefaultLangWord = defLangWord;
    }

    public String getMiWokWord(){
        return mMiWokWord;
    }

    public String getDefaultLangWord(){
        return mDefaultLangWord;
    }
}
