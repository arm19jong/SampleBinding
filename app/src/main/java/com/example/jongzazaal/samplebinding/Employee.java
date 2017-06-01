package com.example.jongzazaal.samplebinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

/**
 * Created by jongzazaal on 6/1/2017.
 */

public class Employee extends BaseObservable {

    private String firstName;
    private String lastName;
    private int age;
    private TextWatcher nameWatcher, lastNameWatcher, ageWatcher;

    private Employee() {
    }

    private static Employee employee;
    public static Employee getInstance(){
        if(employee == null){
            employee = new Employee();
        }
        return employee;
    }
    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
    public TextWatcher getNameWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (firstName == null){firstName = s.toString();return;}
                if (!firstName.equals(s.toString())) {
                    firstName = s.toString();
                }
            }
        };
    }

    public TextWatcher getLastNameWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (lastName == null){lastName = s.toString();return;}
                if (!lastName.equals(s.toString())) {
                    lastName = s.toString();
                }
            }
        };
    }

    public TextWatcher getAgeWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Presenter", "afterTextChanged: "+s.toString());
//                if (age == ){return;}
                if (age != Integer.parseInt(s.toString())) {
                    age = Integer.parseInt(s.toString());
                }
            }
        };
    }
}
