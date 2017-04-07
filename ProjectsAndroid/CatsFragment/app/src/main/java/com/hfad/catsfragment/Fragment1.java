package com.hfad.catsfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Archiektor on 18.03.2017.
 */

public class Fragment1 extends Fragment implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment1, container, false);

        button1 = (Button) rootView.findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button) rootView.findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button) rootView.findViewById(R.id.button3);
        button3.setOnClickListener(this);


        return rootView;
    }

    int translateIdToIndex(int id) {
        int index = -1;

        switch (id) {
            case R.id.button1:
                index = 1;
                break;
            case R.id.button2:
                index = 2;
                break;
            case R.id.button3:
                index = 3;
                break;
        }
        return index;
    }

    @Override
    public void onClick(View v) {
        int buttonIndex = translateIdToIndex(v.getId());

        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex);

        // Можно закомментировать
        //Toast.makeText(getActivity(), String.valueOf(buttonIndex),Toast.LENGTH_SHORT).show();
    }


}
