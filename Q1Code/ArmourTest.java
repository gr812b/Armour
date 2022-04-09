package Q1Code;

import Q1Code.factory.*;

public class ArmourTest {

    public static void main(String args[]) {
        Armour currentArmour;
        //Fight minion
        System.out.println("Fighting minion");
        ArmourFactory spawner = new MinionDrop();

        //Generate first armour piece
        System.out.println("Generating Armour 1");
        currentArmour = spawner.generateArmour();

        //Print out armour piece
        System.out.println(currentArmour.getDescription());

        //Generate second armour piece
        System.out.println("Generating Armour 2");
        currentArmour = spawner.generateArmour();

        //Print out armour piece
        System.out.println(currentArmour.getDescription());

        //Fight elite
        System.out.println("Fighting elite");
        spawner = new EliteDrop();

        //Generate first armour piece
        System.out.println("Generating Armour 1");
        currentArmour = spawner.generateArmour();

        //Print out armour piece
        System.out.println(currentArmour.getDescription());

        //Generate second armour piece
        System.out.println("Generating Armour 2");
        currentArmour = spawner.generateArmour();

        //Print out armour piece
        System.out.println(currentArmour.getDescription());

        //Fight boss
        System.out.println("Fighting boss");
        spawner = new BossDrop();

        //Generate first armour piece
        System.out.println("Generating Armour 1");
        currentArmour = spawner.generateArmour();

        //Print out armour piece
        System.out.println(currentArmour.getDescription());
        
    }
    
}
