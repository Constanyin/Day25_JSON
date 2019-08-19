package com.qf.entity;

public class Score {
    private Double java;
    private Double H5;

    public Score() {
    }

    public Score(Double java, Double h5) {
        this.java = java;
        H5 = h5;
    }

    public Double getJava() {
        return java;
    }

    public void setJava(Double java) {
        this.java = java;
    }

    public Double getH5() {
        return H5;
    }

    public void setH5(Double h5) {
        H5 = h5;
    }

    @Override
    public String toString() {
        return "Score{" +
                "java=" + java +
                ", H5=" + H5 +
                '}';
    }
}
