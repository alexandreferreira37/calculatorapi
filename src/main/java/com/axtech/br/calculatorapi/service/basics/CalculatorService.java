package com.axtech.br.calculatorapi.service.basics;

import com.axtech.br.calculatorapi.model.Calculation;
import com.axtech.br.calculatorapi.model.Result;

public interface CalculatorService {

    Result sum(Calculation calculation);

    Result subtract(Calculation calculation);

    Result multiplication(Calculation calculation);

    Result division(Calculation calculation);
}
