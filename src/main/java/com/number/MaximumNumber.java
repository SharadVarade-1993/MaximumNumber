package com.number;


public class MaximumNumber<N extends Comparable> {
    N number1;
    N number2;
    N number3;


    public MaximumNumber(N number1, N number2, N number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public MaximumNumber(){

    }
    public static <N extends Comparable> N getLargeNumber(N number1,N number2,N number3 ){
        N max=number1;
        if(number2.compareTo(max)>0){
            max = number2;
        }
        if (number3.compareTo(max)>0){
            max = number3;
        }
        return max;
    }

    public N getLargeNumber(){
        return getLargeNumber(number1,number2,number3);
    }
}
