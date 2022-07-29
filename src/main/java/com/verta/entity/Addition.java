package com.verta.entity;

public enum Addition {
    LEMON ("Lemon"),
    ICE_CUBE ("Ice cube");

    private String addition;

    Addition(String addition) {
        this.addition = addition;
    }

    public String getName() {
        return addition;
    }

    public void setName(String addition) {
        this.addition = addition;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "addition='" + addition + '\'' +
                "} " + super.toString();
    }
}
