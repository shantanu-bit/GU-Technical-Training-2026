package Atishay_Jain;

import java.util.*;

public class SumOfDivisors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nummber: ");
        int num=sc.nextInt();

        int temp=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                temp+=i;
                
            }
        }
        System.out.println("Sum of all divisors of  "+num+" is: "+temp);
    }
}

