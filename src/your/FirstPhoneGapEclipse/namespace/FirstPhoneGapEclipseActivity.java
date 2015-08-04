package your.FirstPhoneGapEclipse.namespace;

import com.phonegap.*;
import android.os.Bundle;
import com.parse.*;

public class FirstPhoneGapEclipseActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
		
		Parse.initialize(this, "M1ifyaGlqMi0qLtPDMcdr5vl75mCxon6FizGfEdJ", "6k7SbaeGeYeZidRW8xEoMDmQm929YAs2rDgkBQkv");
		ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
