package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new datePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void processDate(int year, int month, int dayOfMonth) {
        String yearStr = Integer.toString(year);
        String monthStr = Integer.toString(month+1);
        String dayStr = Integer.toString(dayOfMonth);

        String dateMsg = monthStr + "/" + dayStr + "/" + yearStr;

        Toast.makeText(this, getString(R.string.date) + dateMsg, Toast.LENGTH_SHORT).show();
    }
}