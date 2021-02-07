package com.axtech.br.calculatorapi.engine.basics;

import com.axtech.br.calculatorapi.model.Calculation;
import com.axtech.br.calculatorapi.model.Result;
import org.springframework.stereotype.Component;

@Component
public class MultiplicatorCalculator extends CalculatorAbstract implements Calculator{

    @Override
    public Result calculate(Calculation calculation) {
        return new Result(this.toExpression(calculation), calculation.getValue1() * calculation.getValue2());
    }

}
