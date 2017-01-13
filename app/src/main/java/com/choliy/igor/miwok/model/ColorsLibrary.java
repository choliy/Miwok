package com.choliy.igor.miwok.model;

import android.content.Context;

import com.choliy.igor.miwok.R;

import java.util.ArrayList;
import java.util.List;

public class ColorsLibrary {

    private String[] mColorsStrings;
    private List<ItemModel> mColorsLibrary;

    public ColorsLibrary(Context context) {
        mColorsStrings = context.getResources().getStringArray(R.array.colors);
        addColorsItems();
    }

    public List<ItemModel> getColorsLibrary() {
        return mColorsLibrary;
    }

    private void addColorsItems() {
        mColorsLibrary = new ArrayList<>(8);
        mColorsLibrary.add(new ItemModel(mColorsStrings[0], "weṭeṭṭi",
                R.drawable.color_red, R.raw.color_red));
        mColorsLibrary.add(new ItemModel(mColorsStrings[1], "chokokki",
                R.drawable.color_green, R.raw.color_green));
        mColorsLibrary.add(new ItemModel(mColorsStrings[2], "ṭakaakki",
                R.drawable.color_brown, R.raw.color_brown));
        mColorsLibrary.add(new ItemModel(mColorsStrings[3], "kelelli",
                R.drawable.color_white, R.raw.color_white));
        mColorsLibrary.add(new ItemModel(mColorsStrings[4], "ṭopoppi",
                R.drawable.color_gray, R.raw.color_gray));
        mColorsLibrary.add(new ItemModel(mColorsStrings[5], "kululli",
                R.drawable.color_black, R.raw.color_black));
        mColorsLibrary.add(new ItemModel(mColorsStrings[6], "ṭopiisә",
                R.drawable.color_orange, R.raw.color_orange));
        mColorsLibrary.add(new ItemModel(mColorsStrings[7], "chiwiiṭә",
                R.drawable.color_yellow, R.raw.color_yellow));
    }
}