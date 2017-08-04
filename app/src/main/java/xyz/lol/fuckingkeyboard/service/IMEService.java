package xyz.lol.fuckingkeyboard.service;

/**
 * Created by JCDELACRUZ on 8/4/2017.
 */

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.KeyboardView;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.text.InputType;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethod;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import xyz.lol.fuckingkeyboard.R;

public class IMEService extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    private Context mContext;

    private LinearLayout fuckingView;

    private AppCompatButton fuckingButton;

    @Override
    public View onCreateInputView() {
        mContext = getBaseContext();
        fuckingView = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.fucking_layout, null, false);

        fuckingButton = fuckingView.findViewById(R.id.fucking_button);
        fuckingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputConnection inputConnection = getCurrentInputConnection();
                inputConnection.commitText("..|..", 1);
            }
        });

        return fuckingView;
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int i, int[] ints) {

    }

    @Override
    public void onText(CharSequence charSequence) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
