package io.louisgevers.expensetracker.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.louisgevers.expensetracker.R;
import io.louisgevers.expensetracker.dialogs.PaymentDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaymentFragment extends Fragment {


    public PaymentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DialogFragment paymentDialog = new PaymentDialog();
        Toolbar toolbar = view.findViewById(R.id.paymentToolbar);
        toolbar.setNavigationOnClickListener(v ->
                Navigation.findNavController(view).navigateUp());
        view.findViewById(R.id.payBtn).setOnClickListener(v -> {
            paymentDialog.show(getFragmentManager(), "paymentdialog");
        });
    }
}
