package com.choliy.igor.miwok.model;

public class ItemModel {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImagePath;
    private int mAudioPath;

    ItemModel(String defaultTranslation, String miwokTranslation,
              int imagePath, int audioPath) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImagePath = imagePath;
        mAudioPath = audioPath;
    }

    ItemModel(String defaultTranslation, String miwokTranslation, int audioPath) {
        this(defaultTranslation, miwokTranslation, 0, audioPath);
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImagePath() {
        return mImagePath;
    }

    public int getAudioPath() {
        return mAudioPath;
    }
}