package Interfaces.SalesTax;

 class OntarioTaxCalculator  implements ITaxCalculator{
    @Override
    public double CalculateSalesTax(double price) {
        return price * 13 /100;
    }
    // 13%
}
