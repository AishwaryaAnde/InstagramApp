package com.dreamonce.instagramapp.ui.heart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.dreamonce.instagramapp.R;

public class HeartFragment extends Fragment {

    private HeartModel heartModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        heartModel =
                new ViewModelProvider(this).get(HeartModel.class);
        View root = inflater.inflate(R.layout.fragment_heart, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        heartModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}