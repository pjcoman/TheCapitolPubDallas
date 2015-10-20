package comapps.com.thecapitolpubdallas.whiskey;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import comapps.com.thecapitolpubdallas.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by me on 9/29/2015.
 */
public class WhiskeysListViewActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whiskeylist_with_fragment);


    }





    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));

    }


}

