package Q1Code;

import Q1Code.factory.*;

public class ArmoutTest {

    public static void main(String args[]) {
        Armour currentArmour;
        ArmourFactory spawner = new MinionDrop();

        //Generate first armour piece
        System.out.println("Generating Armour 1");
        currentArmour = spawner.generateArmour();

        //Print out armour piece
        System.out.println(currentArmour.getDescription());


    }
    
}
