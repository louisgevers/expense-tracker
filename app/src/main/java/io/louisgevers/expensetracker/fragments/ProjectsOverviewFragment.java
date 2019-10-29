package io.louisgevers.expensetracker.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import io.louisgevers.expensetracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectsOverviewFragment extends Fragment {


    public ProjectsOverviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_projects_overview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button exampleButton = getActivity().findViewById(R.id.example_button);
        exampleButton.setOnClickListener((v) -> {
            Navigation.findNavController(v).navigate(R.id.action_projectsOverviewFragment_to_projectFragment);
        });
    }
}
