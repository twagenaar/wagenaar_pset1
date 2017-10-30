package a11021047.mrpotatohead;

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
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        ImageView image_change = findViewById(R.id.imageView);
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                image_change = findViewById(R.id.imageView5);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox2:
                image_change = findViewById(R.id.imageView10);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox3:
                image_change = findViewById(R.id.imageView9);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox4:
                image_change = findViewById(R.id.imageView3);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox5:
                image_change = findViewById(R.id.imageView8);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox6:
                image_change = findViewById(R.id.imageView2);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox7:
                image_change = findViewById(R.id.imageView11);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox8:
                image_change = findViewById(R.id.imageView6);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox9:
                image_change = findViewById(R.id.imageView7);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox10:
                image_change = findViewById(R.id.imageView4);
//                image_change.setVisibility(View.GONE);
//                if (checked) image_change.setVisibility(View.VISIBLE);
//                else image_change.setVisibility(View.INVISIBLE);
                break;
        }
        image_change.setVisibility(View.GONE);
        if (checked) image_change.setVisibility(View.VISIBLE);
        else image_change.setVisibility(View.INVISIBLE);

    }

//    final CheckBox checkbox = (CheckBox) findViewById(R.id.box);
//    checkbox.setOnClickListener(new OnClickListener() {
//        public void onClick(View v) {
//            // Perform action on clicks, depending on whether it's now checked
//            if (((CheckBox) v).isChecked()) {
//                       ?????????????
//            } else {
//                       ???????????
//            }
//        }
//    });
}
