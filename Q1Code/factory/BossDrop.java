package Q1Code.factory;

import Q1Code.Armour;
import Q1Code.armourType.*;
import Q1Code.decorator.*;
import Q1Code.rarity.*;

//Bosses drop higher rarity armour on average than elites

public class BossDrop implements ArmourFactory {

    @Override
    public Armour generateArmour() {
        Rarity rarity = null;
        //Generate a random decimal between 0 and 1
        double random = Math.random();
        //Use decimals to finely control the rarity of the armour
        if (random < 0.25) {
            rarity = new Mythic();
        } else {
            rarity = new Legendary();
        }

        //Generate random slot number
        int slot = (int) (Math.random() * 4);
        //Pick armour based on slot
        Armour armour = null;
        switch (slot) {
            case 0:
                armour = new Helm(rarity);
                break;
            case 1:
                armour = new ChestPiece(rarity);
                break;
            case 2:
                armour = new Amulet(rarity);
                break;
            case 3:
                armour = new Ring(rarity);
                break;
            case 4:
                armour = new Shield(rarity);
                break;
        }

        //add modifiers
        if (rarity.getRarity() == 1) {
            armour = addModifier(armour);
        } else if (rarity.getRarity() == 2) {
            armour = addModifier(armour);
            armour = addModifier(armour);
        } else if (rarity.getRarity() == 3) {
            armour = addModifier(armour);
            armour = addModifier(armour);
            armour = addModifier(armour);
        } else if (rarity.getRarity() == 4) {
            armour = addModifier(armour);
            armour = addModifier(armour);
            armour = addModifier(armour);
            armour = addModifier(armour);
        }

        return armour;
    }

    @Override
    public Armour addModifier(Armour armour) {
        //Add a random modifier
        int random = (int) (Math.random() * 4);
        switch (random) {
            case 0:
                return new Mana(armour);
            case 1:
                return new Strength(armour);
            case 2:
                return new Dexterity(armour);
            case 3:
                return new Intelligence(armour);
            case 4:
                return new Vitality(armour);
        }
        return armour;
    }
    
}