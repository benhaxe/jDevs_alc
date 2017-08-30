package banhaxe.io.javadevs;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;

/**
 * Created by Masebinu Benjamin Oluwaseun
 * Planet Nest & Techatreek
 * haxeboom@gmail.com
 * on 8/25/2017.
 */

public class App extends Application{
    public boolean isDeviceConnected(Context context){
        ConnectivityManager connect = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo dNetInfo = connect.getActiveNetworkInfo();
        return dNetInfo != null && dNetInfo.isConnected();
    }
    public AlertDialog.Builder buildDialog(Context c){
        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No internet Connection");
        builder.setMessage("Please check your internet connection, click \"OK\" to EXIT");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        return builder;
    }
}
