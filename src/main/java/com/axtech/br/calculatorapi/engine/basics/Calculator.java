package com.axtech.br.calculatorapi.engine.basics;

import com.axtech.br.calculatorapi.model.Calculation;
import com.axtech.br.calculatorapi.model.Result;

public interface Calculator {

    Result calculate(Calculation calculation);

}
