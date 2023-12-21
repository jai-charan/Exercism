public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double production = 221*speed;
        double finalProduction=0;
        if (speed <5){
            return production;
        }
        else if (speed >4 && speed <= 8){
             finalProduction = production - (0.1*production); 
            return finalProduction;
        }
        else if (speed == 9){
             finalProduction = production - (0.2*production); 
            return finalProduction;
        }
        else{
             finalProduction = production - (0.23*production ); 
            return finalProduction;
        }
        }

    public int workingItemsPerMinute(int speed) {
        int production = 221*speed;
        int finalProduction=0;
        if (speed <5){
            return (int)production/60;
        }
        else if (speed >4 && speed <= 8){
             finalProduction = (production - (int)(0.1*production))/60; 
            return finalProduction;
        }
        else if (speed == 9){
             finalProduction = (production - (int)(0.2*production))/60; 
            return finalProduction;
        }
        else{
             finalProduction = (production - (int)(0.23*production ))/60; 
            return finalProduction;
        }
        
    }
}
