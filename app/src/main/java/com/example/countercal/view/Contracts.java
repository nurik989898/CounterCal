package com.example.countercal.view;

public class Contracts {

    public interface CounterView{
        void updateText(int count);
        void showToast(String toast);
        void setColor(String color);

    }
    public interface CounterPresenter{
        void increment();
        void decrement();
        void seeToast();
        void color();
        void attachCounterView(CounterView view);
    }
}
