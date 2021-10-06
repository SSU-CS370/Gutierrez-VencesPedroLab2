package ssu.softwarednd.androidlab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class OtherActivity extends AppCompatActivity {

    private TextView welcomeNameText;
    public static final String NAME_KEY="USER_NAME";
    private Button returnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        returnMain=findViewById(R.id.main_return);
        welcomeNameText=findViewById(R.id.welcome_name_text);

        final Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(OtherActivity.NAME_KEY);
        welcomeNameText.setText("Welcome,  " + name);

        returnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(OtherActivity. this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}