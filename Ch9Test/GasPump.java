
/**
 * Write a description of class GasPump here.
 * 
 * @author Jorge Monzon Diaz
 * @version (a version number or a date)
 */

//this doesn't compile because the Car class doesn't exist

public class GasPump
{
    private static double totalSales, price;
    
    GasPump(double gasPricePerGallon) {
        price = gasPricePerGallon;
    }
    
    public static double getSales() {
        return totalSales;
    }
    
    private double getCost(double gallons) {
        return gallons * price;
    }
    
    private double pump(double gallons) {
        totalSales += gallons * price;
        return getCost(gallons);
    }
    
    public double fill(Car car) {
        double gallons = car.getTankCapacity() - car.getGasAmount();
        car.addGas(gallons);
        return pump(gallons);
    }
    
    public double fill(Car car, double dollarLimit) {
        double gallons = car.getTankCapacity() - car.getGasAmount();
        double maxGallons = dollarLimit/price;
        car.addGas(Math.min(gallons, maxGallons));
        return pump(Math.min(gallons, maxGallons));
    }
}
