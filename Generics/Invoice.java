package Generics;

import Exceptions.UserDefined.WrongNameException;
import Generics.Goods.Goods;
import Interfaces.SalesTax.CalculatorFactory;
import Interfaces.SalesTax.ITaxCalculator;

public class Invoice<T extends Goods> {

    ITaxCalculator taxCalculator;
    CalculatorFactory factory;

    public Invoice(){
         factory = new CalculatorFactory();
    }

    public T getItem() {
        return Item;
    }

    public void setItem(T item) {
        Item = item;
    }

    T Item;

    public double calculateTax(String province) throws WrongNameException {

        taxCalculator = factory.GetCalculator(province);
        return taxCalculator.CalculateSalesTax(getItem().getPrise());

    }
}
