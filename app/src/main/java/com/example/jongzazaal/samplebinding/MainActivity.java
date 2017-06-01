package com.example.jongzazaal.samplebinding;

import android.databinding.DataBindingUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jongzazaal.samplebinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final Employee emp = new Employee("fName", "lName", 21);
        binding.setEmp(emp);


        binding.setPresenter(new Presenter());
//        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                emp.setAge(emp.getAge()+1);
//            }
//        });

    }

}
