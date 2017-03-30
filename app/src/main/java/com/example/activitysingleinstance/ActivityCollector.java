package com.example.activitysingleinstance;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by litao on 2017/3/26.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

     static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();

            }
        }
        activities.clear();
    }
}
