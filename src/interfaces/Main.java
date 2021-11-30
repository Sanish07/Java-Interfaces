
package interfaces;

public class Main {

    public static void main(String[] args) {
        var calculate = new TaxCalculator(10_000); 
        var report = new TaxReport(calculate); //Constructor Dependency Injection
        report.show();
        
        report.setObj(new TaxCalculatorNew()); //Setter Dependency injection
        report.show();
    }
    
}
