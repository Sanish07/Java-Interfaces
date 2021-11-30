//Tightly coupled with class TaxCalculator
package interfaces;

public class TaxReport {
    private Calculator calculate;
    
    public TaxReport(Calculator calculate){  //Injecting Interface object to constructor
        this.calculate = calculate;
    }
    
    public void show(){
        double tax = calculate.calculateTax();
        System.out.println("Tax is : "+tax);
    }
    
    public void setObj(Calculator calculate){  //Injecting object to setter
        this.calculate = calculate;
    }
    
}
