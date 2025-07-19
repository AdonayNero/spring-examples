package com.example.implementation;

import com.example.interfaces.Speakers;

public class BoseSpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Bose Speaker is playing music";
    }
}
