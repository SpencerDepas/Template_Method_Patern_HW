package com.clearfaun.mdlag_hw;

/**
 * Created by SpencerDepas on 4/28/16.
 */
public class DogPen extends Clean {

    String[] dogHay = { "from old corn road. Only The best Hay", " Sometimes we get it from the firepit" };
    String[] cleaningSolution = { "We just cleaned the dogs pen with cleaning solution",
            " Your right its time to use the dog cleaning solution " +
            "pig litter" };

    @Override
    void replaceHay() {

        System.out.println("Our farm dogs will only take the best hay.");
        System.out.println("We get it from two places.");


        int randomNum = (int)(Math.random() * ((100) + 1));

        if(randomNum % 2 == 0){
            System.out.print(dogHay[0] + " \n");

        }else{
            System.out.print(dogHay[1] + " \n");

        }



    }

    @Override
    void replaceLitter() {


    }

    //dogs do not need litter
    @Override
    public boolean needsLitterReplacement(){
        return false;
    }

    @Override
    void useCleaningSolution() {

         System.out.println("about once a month we will clean the dog pen" +
                 "with a cleaning solution. lets check");


        int randomNum = (int)(Math.random() * ((100) + 1));

        if(randomNum % 2 == 0){
            System.out.print(cleaningSolution[0] + " \n");

        }else{
            System.out.print(cleaningSolution[1] + " \n");

        }

    }


}
