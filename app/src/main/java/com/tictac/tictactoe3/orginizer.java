package com.tictac.tictactoe3;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

import com.tictac.tictactoe3.Prefences.SharePreferences;

public class orginizer {
    private Vibrator vibe;
    private final Context context;
    private int counter = 1;
    private ImageView volume;
    private MediaPlayer mp;
    private SharePreferences sharedPreferences;

    public orginizer(Context context, ImageView imageView) {
        this.context = context;
        this.volume = imageView;
        mp = MediaPlayer.create(this.context, R.raw.button);
        vibe = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        sharedPreferences = new SharePreferences(context);
        counter = sharedPreferences.Load_state();
        volume.setImageBitmap(null);
        volume.setBackground(null);
        volume.setColorFilter(ContextCompat.getColor(context, R.color.black), android.graphics.PorterDuff.Mode.SRC_IN);
        switch (counter) {
            case 1: {
                volume.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_volume_up_24));
                break;
            }
            case 2: {
                volume.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_vibration_24));
                break;
            }
            case 3: {

                volume.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_volume_off_24));
                break;
            }
        }

    }

    public void change() {
        volume.setImageBitmap(null);
        volume.setBackground(null);
        volume.setColorFilter(ContextCompat.getColor(context, R.color.black), android.graphics.PorterDuff.Mode.SRC_IN);
        switch (counter) {

            case 1: {
                counter = 2;
                break;
            }
            case 2: {
                counter = 3;

                break;
            }
            case 3: {
                counter = 1;
                break;
            }
        }
        switch (counter) {
            case 1: {
                volume.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_volume_up_24));
                break;
            }
            case 2: {
                volume.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_vibration_24));
                break;
            }
            case 3: {

                volume.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_volume_off_24));
                break;
            }
        }
        sharedPreferences.Save_state(counter);
    }

    public void sound() {
        switch (counter) {
            case 1: {
                mp.start();
                break;
            }
            case 2: {

                vibe.vibrate(80);
                break;
            }

        }
    }


}
