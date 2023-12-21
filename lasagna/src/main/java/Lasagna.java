public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;
    }
    public static int remainingMinutesInOven(int time){
        int remTime = 40-time;
        return remTime;
    }
    public static int preparationTimeInMinutes(int layer){
        int makeTime = 2*layer;
        return makeTime;
}
     public static int totalTimeInMinutes(int layer , int time){
        int totalTime = time + (2*layer);
         return totalTime;
}   
}
