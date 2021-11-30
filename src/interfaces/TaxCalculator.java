
package interfaces;

public class TaxCalculator implements Calculator {
    
    private double taxableIncome;
    
    public TaxCalculator(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }
    
    @Override
    public double calculateTax(){
        return (taxableIncome * 0.2);
    }
    
}
