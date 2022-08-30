package Interfaces.SalesTax;

 class AlbertaTaxCalculator implements ITaxCalculator {
    @Override
    public double CalculateSalesTax(double price) {
       return price * 5 /100;
    }
}
