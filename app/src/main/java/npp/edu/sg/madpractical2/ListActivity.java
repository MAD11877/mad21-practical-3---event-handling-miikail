package npp.edu.sg.madpractical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "Activity List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.v(TAG, "Activity List Created");

        ImageView image = (ImageView) findViewById(R.id.profileImg);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Profile Image Clicked");
                Alert();
            }
        });
    }

    public void Alert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(false);
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("RandNum", String.valueOf(RandomNum()));
                startActivity(intent);
            }
        });

        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.show();
    }

    public int RandomNum() {
        Random random = new Random();
        int x = random.nextInt(1000000);
        return x;
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "Destroy");
    }
}