package com.fragmentdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment fragment1=new NewFragment();
    Fragment getFragment2=new SecondFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Fragment1(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,fragment1).commit();
    }

    public void myClick(View view) {
    }
}
