package com.example.sivanandack.geofencingexample;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Sivananda.CK on 2/23/2017.
 */

public class Constants {
    public static final long EXPITATION_MILLIS = 12*60*60*1000;
    public static float RADIUS_IN_METERS = 20;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();

    static {
        LANDMARKS.put("Altiux", new LatLng(12.936346, 77.690558));
        LANDMARKS.put("PG", new LatLng(12.9259728, 77.6751642));
    }
}
