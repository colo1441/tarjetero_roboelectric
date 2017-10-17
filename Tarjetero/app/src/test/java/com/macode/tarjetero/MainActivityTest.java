package com.macode.tarjetero;

import android.app.Activity;

//Robolectric imports ************************//
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
//*********************************************//
import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {



    /*
    @Test
    @Config(constants = BuildConfig.class, packageName = "com.macode.tarjetero")
    public void testRobolectricWorks() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        assertNotNull(activity);
        assertNotNull(activity.findViewById(R.id.text));
    }*/

    @Test
    @Config(constants = BuildConfig.class, packageName = "com.macode.tarjetero")
    public void aparecenLasTarjetas()throws Exception{

    }




    @Test
    @Config(constants = BuildConfig.class, packageName = "com.macode.tarjetero")
    public void vuelveAtras() throws Exception{

    }


}