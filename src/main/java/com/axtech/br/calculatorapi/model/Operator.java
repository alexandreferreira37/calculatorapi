package com.axtech.br.calculatorapi.model;

public enum Operator {

    SUM("+"),
    SUBTRACT("-"),
    MULTPLICATION("*"),
    DIVISION("/");

    private String description;

    Operator(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

