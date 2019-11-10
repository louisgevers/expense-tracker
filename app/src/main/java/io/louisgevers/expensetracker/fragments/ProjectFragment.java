package io.louisgevers.expensetracker.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import io.louisgevers.expensetracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectFragment extends Fragment {


    public ProjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar = view.findViewById(R.id.projectToolbar);
        toolbar.setNavigationOnClickListener(v ->
                Navigation.findNavController(view).navigateUp());
        view.findViewById(R.id.addTransactionButton).setOnClickListener(
                v -> Navigation.findNavController(view).navigate(R.id.action_projectFragment_to_addTransactionFragment));
        view.findViewById(R.id.transactionDetailsButton).setOnClickListener(
                v -> Navigation.findNavController(view).navigate(R.id.action_projectFragment_to_detailsFragment));
        view.findViewById(R.id.summaryButton).setOnClickListener(
                v -> Navigation.findNavController(view).navigate(R.id.action_projectFragment_to_summaryFragment));
    }
}
