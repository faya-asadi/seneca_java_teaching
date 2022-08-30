package Interfaces.SalesTax;

import Exceptions.UserDefined.WrongNameException;


import java.text.MessageFormat;

public class TaxCalculator {
    CalculatorFactory CalculatorFactory;

    public TaxCalculator(){
        CalculatorFactory = new CalculatorFactory();
    }

    public double CalculateTax(double price, String province) throws WrongNameException {
        ITaxCalculator calculator = CalculatorFactory.GetCalculator(province);
        if(calculator != null){
            return calculator.CalculateSalesTax(price);
        }
        throw new WrongNameException(MessageFormat.format("{0} is not a known province name", province));

    }
}
