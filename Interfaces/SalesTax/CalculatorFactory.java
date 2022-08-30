package Interfaces.SalesTax;

import Exceptions.UserDefined.WrongNameException;

import java.util.HashMap;
import java.util.Locale;

public class CalculatorFactory {


    AlbertaTaxCalculator albertaTaxCalculator;
    QuebecTaxCalculator quebecTaxCalculator;
    OntarioTaxCalculator ontarioTaxCalculator;

    HashMap<String, ITaxCalculator> calHmap;

    public  CalculatorFactory(){

        calHmap = new HashMap<String, ITaxCalculator>();

        calHmap.put("alberta", new AlbertaTaxCalculator());
        calHmap.put("quebec", new QuebecTaxCalculator());
        calHmap.put("ontario", new OntarioTaxCalculator());

//        albertaTaxCalculator = new AlbertaTaxCalculator();
//        quebecTaxCalculator = new QuebecTaxCalculator();
//        ontarioTaxCalculator = new OntarioTaxCalculator();
    }


    public ITaxCalculator GetCalculator(String province) throws WrongNameException {

        if(!calHmap.containsKey(province.toLowerCase())){
            throw new WrongNameException("Province " + province +" is not an accepted one.");
        }
        ITaxCalculator calculator = calHmap.get(province.toLowerCase());
        return calculator;

        //HashMap<String, String> capitalCities = new HashMap<String, String>();

//        switch(province.toLowerCase()){
//            case "alberta":
//                return albertaTaxCalculator;
//            case "quebec":
//                return quebecTaxCalculator;
//            case "ontario":
//                return ontarioTaxCalculator;
//            default:
//                return null;
//        }

    }
}
