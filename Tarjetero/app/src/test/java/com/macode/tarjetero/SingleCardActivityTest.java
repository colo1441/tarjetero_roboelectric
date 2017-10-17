package com.macode.tarjetero;

import android.app.Activity;
import android.support.v7.widget.CardView;

//Robolectric imports ************************//
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
//*********************************************//
import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class SingleCardActivityTest {

    private MainActivity mainActivity;
    private CardView pressCard;

    @Before
    public void setUp() throws Exception {
        mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        pressCard = (CardView) mainActivity.findViewById(R.id.card_view);
    }

    @Test
    @Config(constants = BuildConfig.class, packageName = "com.macode.tarjetero")
    public void alPulsarDebenAparecer() throws Exception {

    }



}