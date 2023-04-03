package com.tech_vibes.cloud_date_and_time;

public interface VolleyCallBack {

    void onGetDateTime(String date, String time, String hour, String minute, String year,
                       String month, String day, String seconds, String dateTime, String timeZone,
                       String dayOfWeek);

    void onError(String error);

}
