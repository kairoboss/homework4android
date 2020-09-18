package com.example.homework4android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecycleItem {
    private String text;

    public RecycleItem(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}