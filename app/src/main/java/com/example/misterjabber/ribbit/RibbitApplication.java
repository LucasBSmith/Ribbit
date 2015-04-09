package com.example.misterjabber.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Mister Jabber on 4/7/2015.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();

        // Enable local datastore
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "MoYWr36TKKXtF124YWgzrf1w3cnmVZgpKrEYsiVe", "BCit7c3RMQFXapPO3A2kSyAhk2B23FLj9lGZ46v9");
    }
}
