package com.example.rajat.popuptry2;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.RemoteViews;

/**
 * Implementation of App Widget functionality.
 */
public class PopUpWidget extends AppWidgetProvider {

    public static String WIDGET_BUTTON1 = "com.example.rajat.popuptry2.WIDGET_BUTTON1";
//    public static String WIDGET_BUTTON2 = "com.example.rajat.popuptry2.WIDGET_BUTTON2";
    Button btn1,btn2;
    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        ComponentName thisWidget = new ComponentName(context,PopUpWidget.class);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.pop_up_widget);
        //views.setTextViewText(R.id.appwidget_text, widgetText);
        /*int[] allWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget);
        for (int widgetId : allWidgetIds) {
            views.setOnClickPendingIntent(R.id.btn1, getPendingSelfIntent(context, MyOnClick1));
            views.setOnClickPendingIntent(R.id.btn2, getPendingSelfIntent(context, MyOnClick2));
            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }*/
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//        if (WIDGET_BUTTON1.equals(intent.getAction())) {
//        //your code here
//            Intent i = new Intent(context,MainActivity.class);
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(i);
//        }
//        if (WIDGET_BUTTON2.equals(intent.getAction())) {
//            //your code here
//            Intent i = new Intent(context,PopUpActivity.class);
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(i);
//        }
        super.onReceive(context, intent);
    }
}

