package com.choliy.igor.miwok.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.choliy.igor.miwok.R;
import com.choliy.igor.miwok.adapter.ListAdapter;
import com.choliy.igor.miwok.model.ItemModel;

import java.util.List;

public final class RvUtil {

    @TargetApi(Build.VERSION_CODES.M)
    public static void setRv(View view, final Context context, List<ItemModel> itemModels, int backgroundColor) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.items_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new ListAdapter(context, itemModels, context.getColor(backgroundColor)));
        /**
         * add list divider, if needed
         */
        //recyclerView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
    }
}