package io.louisgevers.expensetracker.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.louisgevers.expensetracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.listItem1).setOnClickListener(
                v -> Navigation.findNavController(view).navigate(R.id.action_searchFragment_to_projectFragment));
        view.findViewById(R.id.listItem2).setOnClickListener(
                v -> Navigation.findNavController(view).navigate(R.id.action_searchFragment_to_detailsFragment));
    }
}
