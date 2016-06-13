package android.com.baseproject.activities;

import android.com.baseproject.R;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener{

    public FrameLayout container = null;
    public String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        container = (FrameLayout) findViewById(R.id.container);
    }


    public void setContentView(int xml_file, Context context){
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(xml_file, container);
    }


    @Override
    public void onClick(View v) {
        onClickListener(v);
    }

    public abstract void initView();

    public abstract void onClickListener(View v);

}
