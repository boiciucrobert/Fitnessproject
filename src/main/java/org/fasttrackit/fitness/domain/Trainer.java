package org.fasttrackit.fitness.domain;

import java.util.List;

public class Trainer {

    private String name;

    private List<User> trainee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getTrainee() {
        return trainee;
    }

    public void setTrainee(List<User> trainee) {
        this.trainee = trainee;
    }
}
