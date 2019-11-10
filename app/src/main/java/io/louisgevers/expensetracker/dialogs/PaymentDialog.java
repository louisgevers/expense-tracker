package io.louisgevers.expensetracker.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import io.louisgevers.expensetracker.R;

public class PaymentDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_payment_options, null))
                .setTitle("Choose payment method")
                .setNegativeButton("cancel", (dialog, id) -> PaymentDialog.this.getDialog().cancel());
        return builder.create();
    }
}
