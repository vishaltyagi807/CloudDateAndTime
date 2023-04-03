package com.tech_vibes.cloud_date_and_time;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class CloudDateAndTime {

    Activity activity;
    String url = "https://www.timeapi.io/api/Time/current/coordinate?latitude=22.5726&longitude=88.3639";
    RequestQueue requestQueue;

    public CloudDateAndTime(Activity activity) {
        this.activity = activity;
        requestQueue = Volley.newRequestQueue(activity);
    }

    public void getDateAndTime(VolleyCallBack volleyCallBack) {

        JSONObject jsonObject = new JSONObject();
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, jsonObject, response -> {
            try {
                volleyCallBack.onGetDateTime(response.getString("date"), response.getString("time"),
                        response.getString("hour"), response.getString("minute"), response.getString("year"),
                        response.getString("month"), response.getString("day"), response.getString("seconds"),
                        response.getString("dateTime"), response.getString("timeZone"), response.getString("dayOfWeek"));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }, error -> {
            volleyCallBack.onError(error.getMessage());
        });
        requestQueue.add(request);
    }

}
