package io.louisgevers.expensetracker.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;
import io.louisgevers.expensetracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddTransactionFragment extends Fragment {


    public AddTransactionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_transaction, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar = view.findViewById(R.id.add_transaction_Toolbar);
        toolbar.setNavigationOnClickListener(v ->
                Navigation.findNavController(view).navigateUp());
        view.findViewById(R.id.add_transaction_Btn).setOnClickListener(
                v -> Navigation.findNavController(view).navigate(R.id.action_addTransactionFragment_to_projectFragment));
    }

}
