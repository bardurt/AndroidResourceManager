package com.zygne.resourcesmanagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zygne.resourcesmanagerexample.resources.ResourceManager;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_main);

        textView.setText(ResourceManager.getInstance().getString(R.string.app_name));

    }
}
