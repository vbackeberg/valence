package com.cafbit.valence;

/**
 * Created by Valerian on 14.09.2016.
 * <p>
 * Dialog Fragment for the Volume Slider
 */

import android.app.DialogFragment;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import com.cafbit.valence.rfb.KeyTranslator;
import com.cafbit.valence.rfb.RFBKeyEvent;

public class ValenceActivityVolumeDialogFragment extends DialogFragment implements View.OnClickListener {
    ImageButton btnVolUp = null;
    ImageButton btnVolDown = null;
    ValenceActivity valenceActivity = null;
    private RFBKeyEvent.SpecialKey modifier = null;

    public ValenceActivityVolumeDialogFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_dialog_volume, container);
        btnVolUp = (ImageButton) view.findViewById(R.id.btnVolUp);
        btnVolDown = (ImageButton) view.findViewById(R.id.btnVolDown);
        btnVolUp.setOnClickListener(this);
        btnVolDown.setOnClickListener(this);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Window window = getDialog().getWindow();
        window.setLayout(200, 400);
        window.setGravity(Gravity.RIGHT);
    }

    @Override
    public void onClick(View v) {
    /*    valenceActivity = (ValenceActivity) getActivity();
        RFBKeyEvent.SpecialKey key;
        switch (v.getId()) {
            case R.id.btnVolUp:
                key = RFBKeyEvent.VOLUME[0];
                valenceActivity.sendKey(new RFBKeyEvent(key, modifier));
                Toast.makeText(valenceActivity, "volUp", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnVolDown:
                key = RFBKeyEvent.VOLUME[1];
                valenceActivity.sendKey(new RFBKeyEvent(key, modifier));
                Toast.makeText(valenceActivity, "volDown", Toast.LENGTH_SHORT).show();
                break;
        }*/
    }
}