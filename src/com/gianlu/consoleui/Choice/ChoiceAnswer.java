package com.gianlu.consoleui.Choice;

import com.gianlu.consoleui.Answer;

public class ChoiceAnswer extends Answer {
    public ChoiceAnswer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "ChoiceAnswer{" +
                "name='" + name + '\'' +
                '}';
    }
}
