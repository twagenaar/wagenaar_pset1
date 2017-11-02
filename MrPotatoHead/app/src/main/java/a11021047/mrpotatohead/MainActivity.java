package a11021047.mrpotatohead;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        ImageView image_change = findViewById(R.id.imageView);
        switch (view.getId()) {
            case R.id.checkBox1:
                image_change = findViewById(R.id.imageView5);
                break;
            case R.id.checkBox2:
                image_change = findViewById(R.id.imageView10);
                break;
            case R.id.checkBox3:
                image_change = findViewById(R.id.imageView9);
                break;
            case R.id.checkBox4:
                image_change = findViewById(R.id.imageView3);
                break;
            case R.id.checkBox5:
                image_change = findViewById(R.id.imageView8);
                break;
            case R.id.checkBox6:
                image_change = findViewById(R.id.imageView2);
                break;
            case R.id.checkBox7:
                image_change = findViewById(R.id.imageView11);
                break;
            case R.id.checkBox8:
                image_change = findViewById(R.id.imageView6);
                break;
            case R.id.checkBox9:
                image_change = findViewById(R.id.imageView7);
                break;
            case R.id.checkBox10:
                image_change = findViewById(R.id.imageView4);
                break;
        }
        image_change.setVisibility(View.GONE);
        if (checked) image_change.setVisibility(View.VISIBLE);
        else image_change.setVisibility(View.INVISIBLE);
    }

    private static final int VISIBILITY_VIEW_2 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_3 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_4 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_5 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_6 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_7 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_8 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_9 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_10 = View.INVISIBLE;
    private static final int VISIBILITY_VIEW_11 = View.INVISIBLE;

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the state of each of these. It's super important to add null checks here
        //(which is why I prefer to let the View handle it) as in some cases this can
        //get called after the Views have been destroyed.

        outState.putInt("VISIBILITY_VIEW_2", findViewById(R.id.imageView2).getVisibility());
        outState.putInt("VISIBILITY_VIEW_3", findViewById(R.id.imageView3).getVisibility());
        outState.putInt("VISIBILITY_VIEW_4", findViewById(R.id.imageView4).getVisibility());
        outState.putInt("VISIBILITY_VIEW_5", findViewById(R.id.imageView5).getVisibility());
        outState.putInt("VISIBILITY_VIEW_6", findViewById(R.id.imageView6).getVisibility());
        outState.putInt("VISIBILITY_VIEW_7", findViewById(R.id.imageView7).getVisibility());
        outState.putInt("VISIBILITY_VIEW_8", findViewById(R.id.imageView8).getVisibility());
        outState.putInt("VISIBILITY_VIEW_9", findViewById(R.id.imageView9).getVisibility());
        outState.putInt("VISIBILITY_VIEW_10", findViewById(R.id.imageView10).getVisibility());
        outState.putInt("VISIBILITY_VIEW_11", findViewById(R.id.imageView11).getVisibility());
    }

    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //Check if we have saved state, and restore the visibility
        //to all of the Views we care about
        if (savedInstanceState != null) {
            findViewById(R.id.imageView2).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_2"));
            findViewById(R.id.imageView3).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_3"));
            findViewById(R.id.imageView4).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_4"));
            findViewById(R.id.imageView5).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_5"));
            findViewById(R.id.imageView6).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_6"));
            findViewById(R.id.imageView7).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_7"));
            findViewById(R.id.imageView8).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_8"));
            findViewById(R.id.imageView9).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_9"));
            findViewById(R.id.imageView10).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_10"));
            findViewById(R.id.imageView11).setVisibility(savedInstanceState.getInt("VISIBILITY_VIEW_11"));

        }
    }

}