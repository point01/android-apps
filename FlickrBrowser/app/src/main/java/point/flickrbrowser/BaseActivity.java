package point.flickrbrowser;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by point on 2/15/2016.
 */
public class BaseActivity extends ActionBarActivity {

    private Toolbar mToolbar;
    public static final String FLICKR_QUERY = "FLICKR_QUERY";

    protected Toolbar activateToolbar() {
        if (mToolbar == null) {
            mToolbar = (Toolbar) findViewById(R.id.app_bar);
            if (mToolbar != null) {
                setSupportActionBar(mToolbar);
            }
        }
        return mToolbar;
    }

    protected Toolbar activateToolBarWithHomeEnabled() {
        activateToolbar();
        if (mToolbar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        return mToolbar;
    }
}
