class PrimeCalculator {

    int nth(int nth) {
        int range = nth*nth;
        int count = 0;
        int prime=0;
        
        if (nth ==0){
            throw new IllegalArgumentException();
        }
        else if(nth == 1){
            return 2;
            
        }
        else{
            count++;
        for(int num = 3; num <=range ; num++){
            boolean flag = true;
            for(int divisor = 2; divisor < num ; divisor++){
                if(num % divisor ==0 && divisor != num){
                    flag = false;
                    break;
                }
                
            }
            if(flag){
                    count++;
                }
            if (count == nth){
            prime=num;
                break;
            }
            
        }
            }
       return prime;
        }
}
