package android.com.baseproject.activities;

import android.com.baseproject.R;
import android.com.baseproject.backend.NetworkManager;
import android.com.baseproject.listener.LoginListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity{

    private Button btnSave = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main, this);
        initView();
    }

    @Override
    public void initView() {
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClickListener(View v) {

        Log.e(TAG, "button was clicked");
        NetworkManager.attemptLogin("virendra.kalkhudiya@evontech.coms", "Virendra11", new LoginListener() {
            @Override
            public void onLoginSuccess(String Token) {

            }

            @Override
            public void onLoginfailuere(String Error) {

            }
        });
    }


}
