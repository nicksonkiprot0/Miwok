package com.example.miwok;

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceID;
    private int audioResourceID;

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {

        this.imageResourceID = imageResourceID;
    }
    public int getAudioResourceID() {
        return audioResourceID;
    }

    public void setAudioResourceID(int audioResourceID) {
        this.audioResourceID = audioResourceID;
    }



    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID, int audioResourceID) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.audioResourceID = audioResourceID;
        this.imageResourceID = imageResourceID;
    }

    public Word(String miwokPhrase, String defaultPhrase, int audioResourceID){
        this.miwokTranslation = miwokPhrase;
        this.defaultTranslation = defaultPhrase;
        this.audioResourceID = audioResourceID;

    }

}

