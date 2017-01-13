package com.choliy.igor.miwok.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.choliy.igor.miwok.R;
import com.choliy.igor.miwok.model.PhrasesLibrary;
import com.choliy.igor.miwok.util.RvUtil;

public class PhrasesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.items_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        PhrasesLibrary phrases = new PhrasesLibrary(getContext());
        RvUtil.setRv(view, getContext(), phrases.getPhrasesLibrary(), R.color.category_phrases);
    }
}