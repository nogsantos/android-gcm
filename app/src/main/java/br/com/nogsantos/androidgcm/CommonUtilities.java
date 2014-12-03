package br.com.nogsantos.androidgcm;

import android.content.Context;
import android.content.Intent;
/**
 * @author nogsantos
 * @since 03/12/2014 9:40 AM
 */
public class CommonUtilities {

    // give your server registration url here
    static final String SERVER_URL = "http://10.0.2.2/AndroidGcmService/register.php";

    // Google project id
    static final String SENDER_ID = "528182129359";

    /**
     * Tag used on log messages.
     */
    static final String TAG = "AndroidHive GCM";

    static final String DISPLAY_MESSAGE_ACTION =
            "br.com.nogsantos.androidgcm.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    /**
     * Notifies UI to display a message.
     * <p>
     * This method is defined in the common helper because it's used both by
     * the UI and the background service.
     *
     * @param context application's context.
     * @param message message to be displayed.
     */
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}
