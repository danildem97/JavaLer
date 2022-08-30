package org.example;



public class Main {
    public static void main(String[] args) {
        int min =1, max =10;
        int range=max-min+1;
        int rnd =(int)(Math.random()*range);
        int count = 1;

        for(int a=0;a<=rnd;a++){
            if(rnd==0){
                System.out.print(rnd+"! = 1");
            } else if(a==0){System.out.print((rnd+1)+"! = "+(a+1));}
            else if(a>=1){
                System.out.print("*"+(a+1));
            }

                count=(a+1)*count;

            
        }
        System.out.println(" = "+count+";");
        


    }
}