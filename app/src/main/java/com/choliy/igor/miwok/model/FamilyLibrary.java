package com.choliy.igor.miwok.model;

import android.content.Context;

import com.choliy.igor.miwok.R;

import java.util.ArrayList;
import java.util.List;

public class FamilyLibrary {

    private String[] mFamilyStrings;
    private List<ItemModel> mFamilyLibrary;

    public FamilyLibrary(Context context) {
        mFamilyStrings = context.getResources().getStringArray(R.array.family);
        addFamilyItems();
    }

    public List<ItemModel> getFamilyLibrary() {
        return mFamilyLibrary;
    }

    private void addFamilyItems() {
        mFamilyLibrary = new ArrayList<>(10);
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[0], "әpә",
                R.drawable.family_father, R.raw.family_father));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[1], "әṭa",
                R.drawable.family_mother, R.raw.family_mother));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[2], "angsi",
                R.drawable.family_son, R.raw.family_son));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[3], "tune",
                R.drawable.family_daughter, R.raw.family_daughter));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[4], "taachi",
                R.drawable.family_older_brother, R.raw.family_older_brother));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[5], "chalitti",
                R.drawable.family_younger_brother, R.raw.family_younger_brother));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[6], "teṭe",
                R.drawable.family_older_sister, R.raw.family_older_sister));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[7], "kolliti",
                R.drawable.family_younger_sister, R.raw.family_younger_sister));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[8], "ama",
                R.drawable.family_grandmother, R.raw.family_grandmother));
        mFamilyLibrary.add(new ItemModel(mFamilyStrings[9], "paapa",
                R.drawable.family_grandfather, R.raw.family_grandfather));
    }
}