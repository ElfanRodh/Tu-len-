package com.github.florent37.materialviewpager.sample.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.florent37.materialviewpager.MaterialViewPagerHeaderView;
import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.florent37.materialviewpager.sample.R;
import com.github.florent37.materialviewpager.sample.TestRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by elfar on 11/10/18.
 */

public class BerandaFragment extends Fragment {
    @BindView(R.id.scrollView)
    NestedScrollView mScrollView;
    @BindView(R.id.rv_bangunan)
    RecyclerView mRecyclerView;

    public static ScrollFragment newInstance() {
        return new ScrollFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_scroll, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        MaterialViewPagerHelper.registerScrollView(getActivity(), mScrollView);
        final List<Object> items = new ArrayList<>();

        items.add("1");
        items.add("2");
        items.add("3");
        items.add("4");

        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerView.setHasFixedSize(true);
        //Use this now
//        mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
        mRecyclerView.setAdapter(new TestRecyclerViewAdapter(items));
    }
}