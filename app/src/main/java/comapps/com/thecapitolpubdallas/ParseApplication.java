package comapps.com.thecapitolpubdallas;

import android.app.Application;

import com.parse.DeleteCallback;
import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

/**
 * Created by me on 10/6/2015.
 */
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(getApplicationContext());

        // Add your initialization code here
        Parse.initialize(this, "Xstmznend8aWRUJg1Kt2T2fvWI9wpzAprXQ4QiCB", "Z58bRlIlV4BFWV4iGhjppus1CkLXitdrC8sDeaUk");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);

        //   PushService.setDefaultPushCallback(this, MainActivity.class);


        ParseInstallation.getCurrentInstallation().saveInBackground();



        ParseQuery<ParseObject> queryBeers = new ParseQuery<ParseObject>(
                "capitolbeers");

        queryBeers.findInBackground(new FindCallback<ParseObject>() {
            public void done(final List<ParseObject> object, ParseException e) {
                // Remove the previously cached results.
                ParseObject.unpinAllInBackground("capitolbeers", new DeleteCallback() {
                    public void done(ParseException e) {
                        // Cache the new results.
                        ParseObject.pinAllInBackground("capitolbeers", object);
                    }
                });
            }
        });

        ParseQuery<ParseObject> queryMenu = new ParseQuery<ParseObject>(
                "capitolmenu");
        // Locate the column named "day" in Parse.com and order list
        // by ascending

        queryMenu.findInBackground(new FindCallback<ParseObject>() {
            public void done(final List<ParseObject> object, ParseException e) {
                // Remove the previously cached results.
                ParseObject.unpinAllInBackground("capitolmenu", new DeleteCallback() {
                    public void done(ParseException e) {
                        // Cache the new results.
                        ParseObject.pinAllInBackground("capitolmenu", object);
                    }
                });
            }
        });

        ParseQuery<ParseObject> queryDrinks = new ParseQuery<ParseObject>(
                "capitolcocktails");

        queryDrinks.findInBackground(new FindCallback<ParseObject>() {
            public void done(final List<ParseObject> object, ParseException e) {
                // Remove the previously cached results.
                ParseObject.unpinAllInBackground("capitolcocktails", new DeleteCallback() {
                    public void done(ParseException e) {
                        // Cache the new results.
                        ParseObject.pinAllInBackground("capitolcocktails", object);
                    }
                });
            }
        });

        ParseQuery<ParseObject> queryWhiskeys = new ParseQuery<ParseObject>(
                "capitolwhiskeys");

        queryWhiskeys.findInBackground(new FindCallback<ParseObject>() {
            public void done(final List<ParseObject> object, ParseException e) {
                // Remove the previously cached results.
                ParseObject.unpinAllInBackground("capitolwhiskeys", new DeleteCallback() {
                    public void done(ParseException e) {
                        // Cache the new results.
                        ParseObject.pinAllInBackground("capitolwhiskeys", object);
                    }
                });
            }
        });

        ParseQuery<ParseObject> querySpecials = new ParseQuery<ParseObject>(
                "specials");

        querySpecials.findInBackground(new FindCallback<ParseObject>() {
            public void done(final List<ParseObject> object, ParseException e) {
                // Remove the previously cached results.
                ParseObject.unpinAllInBackground("specials", new DeleteCallback() {
                    public void done(ParseException e) {
                        // Cache the new results.
                        ParseObject.pinAllInBackground("specials", object);
                    }
                });
            }
        });





    }

}
