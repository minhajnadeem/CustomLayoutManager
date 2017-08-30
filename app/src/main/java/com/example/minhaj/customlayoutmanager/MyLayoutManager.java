package com.example.minhaj.customlayoutmanager;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/**
 * Created by minhaj on 30/08/2017.
 */

public class MyLayoutManager extends RecyclerView.LayoutManager {

    @Override
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT,RecyclerView.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        fillVisibleChildren(recycler);

        int childC = getChildCount();
        Log.d("tag","count = "+childC);
        View view = recycler.getViewForPosition(0);
        Log.d("tag","view null = "+(view==null)+"");
        addView(view);
    }

    private void fillVisibleChildren(RecyclerView.Recycler recycler) {
        detachAndScrapAttachedViews(recycler);


    }
}
