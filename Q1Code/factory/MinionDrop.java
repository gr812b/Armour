package Q1Code.factory;

import Q1Code.Armour;
import Q1Code.armourType.*;
import Q1Code.decorator.*;
import Q1Code.rarity.*;

public class MinionDrop implements ArmourFactory {

    @Override
    public Armour generateArmour() {
        //make a random rarity
        int randomRarity = (int) (Math.random() * 3);
        Rarity rarity = null;
        switch (randomRarity) {
            case 0:
                rarity = new Common();
                break;
            case 1:
                rarity = new Uncommon();
                break;
            case 2:
                rarity = new Rare();
                break;
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
                armour = new ChestPiece(rarity);
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
        } else if (rarity.getRarity() == 3) {
            armour = addModifier(armour);
            armour = addModifier(armour);
            armour = addModifier(armour);
        }

        return armour;
    }

    @Override
    public Armour addModifier(Armour armour) {
        //Add a random modifier
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                armour = new Mana(armour);
                break;
            case 1:
                armour = new Strength(armour);
                break;
            case 2:
                armour = new Dexterity(armour);
                break;
        }
        return armour;
    }
    
}