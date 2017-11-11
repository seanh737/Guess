package guess.com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int r = new Random().nextInt(10)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView secret = findViewById(R.id.text_s);
        secret.setText(Integer.toString(r));
    }
    public void send(View view){
        EditText ed_number = findViewById(R.id.ed_num);
        TextView message = findViewById(R.id.text_m);


        int number = Integer.parseInt(ed_number.getText().toString());

        if (number<r){
            Toast.makeText(this,"大一點",Toast.LENGTH_LONG).show();
        }else if (number>r){
            message.setText("小一點");
//         Log.d("Mainactivity","小一點");
        }
        if (number == r){
            new AlertDialog.Builder(this)
                    .setTitle("恭喜")
                    .setMessage("答對了")
                    .setPositiveButton("OK",null)
                    .show();


        }


    }
}
