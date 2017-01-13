package com.choliy.igor.miwok.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.choliy.igor.miwok.R;
import com.choliy.igor.miwok.model.ColorsLibrary;
import com.choliy.igor.miwok.util.RvUtil;

public class ColorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.items_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ColorsLibrary colors = new ColorsLibrary(getContext());
        RvUtil.setRv(view, getContext(), colors.getColorsLibrary(), R.color.category_colors);
    }
}