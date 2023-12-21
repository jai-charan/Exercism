class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean result = knightIsAwake && true;
        return !(result);
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result = knightIsAwake || archerIsAwake || prisonerIsAwake; 
        return result;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result = prisonerIsAwake && !(archerIsAwake);
        return result;
        }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       if ( petDogIsPresent){
           boolean result = !(archerIsAwake);
               return result;
       }
        else if( !(petDogIsPresent) && prisonerIsAwake ){
            boolean result = false;
            if(!knightIsAwake){ 
                if(!archerIsAwake) {
                    result = true;
                }
                }
            return result;
        }
        else {
            boolean result = false;
            return result;
        }
    }
}
