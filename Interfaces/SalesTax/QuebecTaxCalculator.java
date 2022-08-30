package Interfaces.SalesTax;

 class QuebecTaxCalculator implements ITaxCalculator{
    @Override
    public double CalculateSalesTax(double price) {
        return price * 15 /100;
    }
    //15%
}
