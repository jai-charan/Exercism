
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[7];
        for(int i=0;i<7;i++){
            lastWeek[i] = birdsPerDay[i];
            }
            return lastWeek;
        
        }
    

    public int getToday() {
        int[] lastWeek = new int[7];
        for(int i=0;i<7;i++){
            lastWeek[i] = birdsPerDay[i];
            }
            return lastWeek[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]=getToday()+1;
        
            
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<7;i++){
            if(birdsPerDay[i] ==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numberOfBirds=0;
        if (numberOfDays>7){
            numberOfDays=7;
        }
        for(int i=0;i<numberOfDays;i++){
            numberOfBirds=numberOfBirds+birdsPerDay[i];
        }
        return numberOfBirds;
    }

    public int getBusyDays() {
        int count=0;
        for(int i=0;i<7;i++){
            if(birdsPerDay[i] > 4){
                count++;
            }
            }
        return count;
    }
}
