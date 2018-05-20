package cosmin.criptochat.android;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Cosmin on 17.06.2016.
 */
public class CriptoChatFireBaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
