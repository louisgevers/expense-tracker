package io.louisgevers.expensetracker.fragments;


import android.content.Intent;
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
public class NewProjectFragment extends Fragment {


    public NewProjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_project, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar = view.findViewById(R.id.newProjectToolbar);
        toolbar.setNavigationOnClickListener(v ->
                Navigation.findNavController(view).navigateUp());
        view.findViewById(R.id.saveButton).setOnClickListener(v -> {
                    Toast.makeText(getContext(), "Prototype: saving new projects not available yet", Toast.LENGTH_SHORT).show();
                });

        view.findViewById(R.id.chooseProjectImage).setOnClickListener(v -> {
            Intent pickImageIntent = new Intent(
                    Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(pickImageIntent, 108);
        });
    }
}
