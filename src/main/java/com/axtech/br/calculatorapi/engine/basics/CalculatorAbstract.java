package com.axtech.br.calculatorapi.engine.basics;

import com.axtech.br.calculatorapi.model.Calculation;

public abstract class CalculatorAbstract {

    public String toExpression(Calculation calculation) {
        return calculation.getValue1() + " " + calculation.getOperator().getDescription() + " " + calculation.getValue2();
    }

}
