package mygame.game.startup.mygame;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class GameActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        ImageView iv = (ImageView) findViewById(R.id.imgview);
        //swipe event
        iv.setBaselineAlignBottom(true);
//click event
        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = (int)event.getX();
                float y = (int)event.getY();
                String msg="X="+x+"\nY="+y;
               Toast.makeText(GameActivity.this,msg,Toast.LENGTH_SHORT).show();
                return false;
            }
        });




    }


    private void playsound(int a){
        switch (a) {
            case 1:
            MediaPlayer mediaPlayer1 = MediaPlayer.create(GameActivity.this, R.raw.a1);
                mediaPlayer1.start();
                if(!mediaPlayer1.isPlaying())
                    mediaPlayer1.release();
                break;
            case 2:
                MediaPlayer mediaPlayer2 = MediaPlayer.create(GameActivity.this, R.raw.a3);
                mediaPlayer2.start();
                if(!mediaPlayer2.isPlaying())
                    mediaPlayer2.release();
                break;

        }

    }


}





