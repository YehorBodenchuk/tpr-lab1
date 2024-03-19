package com.tpr.entities;

import lombok.Getter;

import java.util.Collection;

@Getter
public class Discipline {

    private String name;

    private Double averageScore;

    private Collection<Work> works;

    public void getProgress() {
        double var = 0;

        for (Work work : works) {
            var = var + work.getScore();
        }

        var = var / works.size();

        averageScore = var;
    }
}
