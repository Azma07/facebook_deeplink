package it.remedia.flutter_facebook_app_links_example;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;


public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(this);
        FacebookSdk.sdkInitialize(getApplicationContext());


  }
}
