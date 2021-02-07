package com.axtech.br.calculatorapi.model;

import java.io.Serializable;
import java.util.Objects;

public class Calculation  implements Serializable {

    private static final long serialVersionUID = 1L;

    private Double value1;
    private Double value2;
    private Operator operator;

    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculation that = (Calculation) o;
        return Objects.equals(value1, that.value1) && Objects.equals(value2, that.value2) && operator == that.operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2, operator);
    }
}
