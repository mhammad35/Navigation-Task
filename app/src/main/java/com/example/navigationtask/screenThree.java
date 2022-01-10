package com.example.navigationtask;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class screenThree extends Fragment {


    public screenThree() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_screen_three, container, false);
     String data =  screenThreeArgs.fromBundle(getArguments()).getTypedData();
        TextView textView = view.findViewById(R.id.textViewID);

        textView.setText(data);

         return view;  }

}