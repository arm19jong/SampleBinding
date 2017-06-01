package com.example.jongzazaal.samplebinding;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jongzazaal on 6/1/2017.
 */

public class Presenter {

    private Employee employee;
    public Presenter(Employee employee) {
        this.employee = employee;
    }

    public void click(View v){
        Log.d("Presenter", "click: "+employee.getFirstName()+"//"+employee.getLastName()+"//"+employee.getAge());

        Employee.getInstance().setAge(Employee.getInstance().getAge()+1);
    }
}
