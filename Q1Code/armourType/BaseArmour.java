package Q1Code.armourType;

import Q1Code.Armour;
import Q1Code.rarity.Rarity;

public abstract class BaseArmour implements Armour {
    
    protected Rarity rarity;

    public String getRarityDescription() {
        return rarity.getRarityDescription();
    }
    
}
