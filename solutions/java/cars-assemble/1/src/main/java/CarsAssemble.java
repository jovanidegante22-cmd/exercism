public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double factor;
        if(speed >= 1 && speed <= 4){
            factor = 1.0;
        } else if(speed >=5 && speed <= 8){
            factor = 0.9;
        } else if (speed == 9){
            factor = 0.8;
        } else if (speed == 10){
            factor = 0.77;
        } else {
            factor = 0.0;
        }
        return speed * 221 * factor;
    }
    public int workingItemsPerMinute(int speed) {
       return (int) (productionRatePerHour(speed) / 60);
    }
}
