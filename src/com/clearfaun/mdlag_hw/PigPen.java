package com.clearfaun.mdlag_hw;

/**
 * Created by SpencerDepas on 4/28/16.
 */
public class PigPen extends Clean {

    String[] pigHay = { "old Dog hay", "old Hoarse Hay", "old chicken hay" };
    String[] pigLitter = { "pigs don't have litter except for very rarely", " lets give out pigs some fresh new " +
            "pig litter" };

    @Override
    void replaceHay() {

        System.out.println("pigs are happy with any hay they have not been in ");
        System.out.println("Lets give them some ");

        for (String meat : pigHay){

            System.out.print(meat + " \n");

        }


    }

    @Override
    void replaceLitter() {

        int randomNum = (int)(Math.random() * ((100) + 1));


        if(randomNum == 88){
            System.out.println(pigLitter[1]);

        }else{
            System.out.println(pigLitter[0]);

        }


    }

    @Override
    void useCleaningSolution() {

        System.out.println("Depending on how hot is is we have to use a difrent cleaning solution with" +
                "diferent stregths ");
        System.out.println("Today we will use stregth " + (int)(Math.random() * ((500) + 1)));

    }


}
