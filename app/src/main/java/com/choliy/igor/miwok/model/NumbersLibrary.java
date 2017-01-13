package com.choliy.igor.miwok.model;

import android.content.Context;

import com.choliy.igor.miwok.R;

import java.util.ArrayList;
import java.util.List;

public class NumbersLibrary {

    private String[] mNumbersStrings;
    private List<ItemModel> mNumbersLibrary;

    public NumbersLibrary(Context context) {
        mNumbersStrings = context.getResources().getStringArray(R.array.numbers);
        addNumbersItems();
    }

    public List<ItemModel> getNumbersLibrary() {
        return mNumbersLibrary;
    }

    private void addNumbersItems() {
        mNumbersLibrary = new ArrayList<>(10);
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[0], "lutti",
                R.drawable.number_one, R.raw.number_one));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[1], "otiiko",
                R.drawable.number_two, R.raw.number_two));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[2], "tolookosu",
                R.drawable.number_three, R.raw.number_three));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[3], "oyyisa",
                R.drawable.number_four, R.raw.number_four));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[4], "massokka",
                R.drawable.number_five, R.raw.number_five));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[5], "temmokka",
                R.drawable.number_six, R.raw.number_six));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[6], "kenekaku",
                R.drawable.number_seven, R.raw.number_seven));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[7], "kawinta",
                R.drawable.number_eight, R.raw.number_eight));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[8], "wo’e",
                R.drawable.number_nine, R.raw.number_nine));
        mNumbersLibrary.add(new ItemModel(mNumbersStrings[9], "na’aacha",
                R.drawable.number_ten, R.raw.number_ten));
    }
}