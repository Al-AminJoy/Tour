package com.vectorit.tour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class PostDetailsFragment extends Fragment implements View.OnClickListener {
    private CardView cvApply;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_post_details, container, false);
         idFinder(view);
         cvApply.setOnClickListener(this);
        return view;
    }

    private void idFinder(View view) {
        cvApply=view.findViewById(R.id.cvPostDetailsApplyId);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.cvPostDetailsApplyId){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.apply_dialog, null);
            final ImageView ivShowAlert = view.findViewById(R.id.ivTravelAlertInfoId);
            final AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
                    .setView(view).setCancelable(false).create();

            ivShowAlert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                    View view = layoutInflater.inflate(R.layout.apply_alert_dialog, null);
                    final AlertDialog dialog = new AlertDialog.Builder(getActivity())
                            .setView(view).setCancelable(true).create();
                    dialog.show();
                }
            });
            /*ivDatePicker.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDate(etDate);
                }
            });*/
            alertDialog.show();

        }

    }
}
