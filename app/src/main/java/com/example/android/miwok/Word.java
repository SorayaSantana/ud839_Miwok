package com.example.android.miwok;

import android.util.Log;

public class Word {
    private String mMiWokWord;
    private String mDefaultLangWord;

    private Integer mSoundId;

    public Word(String defLangWord, String miWok){
        mMiWokWord = miWok;
        mDefaultLangWord = defLangWord;
    }
    public Word(String defLangWord, String miWok, Integer soundId){
        mMiWokWord = miWok;
        mDefaultLangWord = defLangWord;
        mSoundId = soundId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiWokWord='" + mMiWokWord + '\'' +
                ", mDefaultLangWord='" + mDefaultLangWord + '\'' +
                ", mSoundId=" + mSoundId +
                '}';
    }

    public String getMiWokWord(){
        return mMiWokWord;
    }

    public String getDefaultLangWord(){
        return mDefaultLangWord;
    }
    public Integer getSoundId(){
        return mSoundId;
    }
    public boolean hasSound() { return mSoundId!=null;}
}
