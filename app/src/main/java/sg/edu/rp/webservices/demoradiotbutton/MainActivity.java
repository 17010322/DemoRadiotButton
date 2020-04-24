package sg.edu.rp.webservices.demoradiotbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get radio group object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                //get id of selected radio button
                int selectedButtonId = rg.getCheckedRadioButtonId();
                //get radio button object from Id
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);
                //Toast text of rb
                Toast.makeText(MainActivity.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
