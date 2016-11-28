package test.manu.com.testannotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * In general build.gradle :
 * classpath 'com.android.tools.build:gradle:2.1.2'
 * classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
 *
 * In project build.gradle :
 * apply plugin: 'android-apt'
 * def AAVersion = '4.1.0'
 * and
 * apt "org.androidannotations:androidannotations:$AAVersion"
 * compile "org.androidannotations:androidannotations-api:$AAVersion"
 *
 * In the manifest.xml, we must use MainActivity_ instead of MainActivity.
 */

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.textview)
    TextView textView;

    @Click(R.id.button)
    public void onClickButton(){
        textView.setText("Button clicked!");
    }
}
