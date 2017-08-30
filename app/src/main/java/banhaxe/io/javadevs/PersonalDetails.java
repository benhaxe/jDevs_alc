package banhaxe.io.javadevs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class PersonalDetails extends AppCompatActivity implements View.OnClickListener{

    ImageView user_bak;
    CircleImageView user_image;
    TextView user_full_name, username;
    LinearLayout url_link;

    Button user_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_details);

        user_bak = (ImageView) findViewById(R.id.user_bak);
        user_image = (CircleImageView) findViewById(R.id.user_image);
        user_full_name = (TextView) findViewById(R.id.user_full_name);
        username = (TextView) findViewById(R.id.username);
        url_link = (LinearLayout) findViewById(R.id.url_link);
        user_share = (Button) findViewById(R.id.user_share);

        url_link.setOnClickListener(this);
        user_share.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.url_link:
                break;

            case R.id.user_share:
                break;
        }
    }
}
