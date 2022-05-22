package com.example.countercal;


import com.example.countercal.presenter.CounterPresenter;

public class Injector {
    public static CounterPresenter getCounter(){
        return new CounterPresenter();
    }

}
