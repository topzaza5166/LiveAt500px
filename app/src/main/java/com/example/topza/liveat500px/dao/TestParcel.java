package com.example.topza.liveat500px.dao;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by topza on 7/29/2017.
 */

public class TestParcel implements Parcelable {

    String MyNameis;
    String Parcel;

    protected TestParcel(android.os.Parcel in) {
        MyNameis = in.readString();
        Parcel = in.readString();
    }

    public static final Creator<TestParcel> CREATOR = new Creator<TestParcel>() {
        @Override
        public TestParcel createFromParcel(android.os.Parcel in) {
            return new TestParcel(in);
        }

        @Override
        public TestParcel[] newArray(int size) {
            return new TestParcel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(MyNameis);
        parcel.writeString(Parcel);
    }
}
