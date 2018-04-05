package com.example.vladislav.task;

import android.widget.ImageView;
import android.widget.TextView;

public class Theme {
    int id;
    ImageView image;
    String numbers;
    String name;
    String text;


    public Theme(String numbers, String name, String text) {
        this.numbers = numbers;
        this.name = name;
        this.text = text;
    }
    public Theme(ImageView image, String numbers, String name, String text) {
        this.image = image;
        this.numbers = numbers;
        this.name = name;
        this.text = text;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
