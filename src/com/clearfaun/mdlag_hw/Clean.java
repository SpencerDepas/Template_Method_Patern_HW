package com.clearfaun.mdlag_hw;

/**
 * Created by SpencerDepas on 4/28/16.
 */
public abstract class Clean {

    final void cleanAnimalPen(){

        gatherAndRemoveAnimalPoo();

        hoseDownPee();


        if(needsHayReplacement()){


            replaceHay();


        }

        if(needsLitterReplacement()){


            replaceLitter();


        }

        if(needCleaningSolution()){


            useCleaningSolution();


        }



    }

    abstract void replaceHay();

    abstract void replaceLitter();
    abstract void useCleaningSolution();

    boolean needsHayReplacement() { return true; }
    boolean needsLitterReplacement() { return true; }
    boolean needCleaningSolution() { return true; }

    public void gatherAndRemoveAnimalPoo(){

        System.out.println("Removing all poo from animal pen.");

    }

    public void hoseDownPee(){

        System.out.println("get a hose and remove that bad urine smell.");

    }
}
