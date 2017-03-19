package com.example.android.quakereport;

/**
 * Created by SHANEEB on 19-Mar-17.
 */

public class EarthquakeDataClass {
    private double mMagnitude;
    private String mNameOfCity;
    private String mDate;

    public EarthquakeDataClass(double mag, String city, String date)
    {
        mMagnitude = mag;
        mNameOfCity = city;
        mDate = date;
    }

    public double getmMagnitude ()
    {
        return mMagnitude;
    }

    public String getmNameOfCity()
    {
        return mNameOfCity;
    }

    public String getmDate()
    {
        return mDate;
    }
}
