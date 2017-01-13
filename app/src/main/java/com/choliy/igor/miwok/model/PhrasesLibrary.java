package com.choliy.igor.miwok.model;

import android.content.Context;

import com.choliy.igor.miwok.R;

import java.util.ArrayList;
import java.util.List;

public class PhrasesLibrary {

    private String[] mPhrasesStrings;
    private List<ItemModel> mPhrasesLibrary;

    public PhrasesLibrary(Context context) {
        mPhrasesStrings = context.getResources().getStringArray(R.array.phrases);
        addPhrasesItems();
    }

    public List<ItemModel> getPhrasesLibrary() {
        return mPhrasesLibrary;
    }

    private void addPhrasesItems() {
        mPhrasesLibrary = new ArrayList<>(10);
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[0], "minto wuksus",
                R.raw.phrase_where_are_you_going));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[1], "tinnә oyaase'nә",
                R.raw.phrase_what_is_your_name));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[2], "oyaaset...",
                R.raw.phrase_my_name_is));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[3], "michәksәs?",
                R.raw.phrase_how_are_you_feeling));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[4], "kuchi achit",
                R.raw.phrase_im_feeling_good));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[5], "әәnәs'aa?",
                R.raw.phrase_are_you_coming));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[6], "hәә’ әәnәm",
                R.raw.phrase_yes_im_coming));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[7], "әәnәm",
                R.raw.phrase_im_coming));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[8], "yoowutis",
                R.raw.phrase_lets_go));
        mPhrasesLibrary.add(new ItemModel(mPhrasesStrings[9], "әnni'nem",
                R.raw.phrase_come_here));
    }
}