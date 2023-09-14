package cofd.ctl.ctl_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hiding the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);


        // This creates the link example.
        TextView tl = findViewById(R.id.test_link);
        tl.setMovementMethod(LinkMovementMethod.getInstance());
        tl.setLinkTextColor(Color.RED);
        //---

        //  This is a test of scrolling with the "Token and merits" option
        final ScrollView scrollview = findViewById(R.id.scrollview);

        Button tokenmeritid   = findViewById(R.id.tokenmeritid);    //  what will be the button.
        tokenmeritid.setMovementMethod(LinkMovementMethod.getInstance());
        TextView tomeid         = findViewById(R.id.tomeid);        //  what button will try and go to.

        tokenmeritid.setOnClickListener(view -> {
            if (tomeid != null) {
                int scrollY = scrollview.getScrollY() + tomeid.getTop();
                scrollview.smoothScrollTo(1000, scrollY);
            }
        });
        //---

    }
}