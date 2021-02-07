package com.axtech.br.calculatorapi.model;

import java.io.Serializable;
import java.util.Objects;

public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    private String expression;
    private Double result;

    public Result(String expression, Double result) {
        this.expression = expression;
        this.result = result;
    }
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result1 = (Result) o;
        return Objects.equals(expression, result1.expression) && Objects.equals(result, result1.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, result);
    }
}
