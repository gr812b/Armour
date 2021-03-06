package Q1Code.factory;

import Q1Code.Armour;
import Q1Code.armourType.*;
import Q1Code.decorator.*;
import Q1Code.rarity.*;

//Minions have a limited selection of armour types, rarities and modifiers

public class MinionDrop implements ArmourFactory {

    @Override
    public Armour generateArmour() {
        Rarity rarity = null;
        //Generate a random decimal between 0 and 1
        double random = Math.random();
        //Use decimals to finely control the rarity of the armour
        if (random < 0.5) {
            rarity = new Common();
        } else if (random < 0.8) {
            rarity = new Uncommon();
        } else {
            rarity = new Rare();
        }

        //Generate random slot number
        int randomSlot = (int) (Math.random() * 3);
        //Pick armour based on slot
        Armour armour = null;
        switch (randomSlot) {
            case 0:
                armour = new Helm(rarity);
                break;
            case 1:
                armour = new Ring(rarity);
                break;
            case 2:
                armour = new Amulet(rarity);
                break;
        }

        //add modifiers
        if (rarity.getRarity() == 1) {
            armour = addModifier(armour);
        } else if (rarity.getRarity() == 2) {
            armour = addModifier(armour);
            armour = addModifier(armour);
        }

        return armour;
    }

    //Minions only drop with modifiers dex and intelligence
    @Override
    public Armour addModifier(Armour armour) {
        //Add a random modifier
        int random = (int) (Math.random());
        switch (random) {
            case 0:
                return new Dexterity(armour);
            case 1:
                return new Intelligence(armour);
        }
        return armour;
    }
    
}