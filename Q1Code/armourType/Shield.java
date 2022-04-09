package Q1Code.armourType;

import Q1Code.rarity.Rarity;

public class Shield extends BaseArmour {

    public Shield(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public String getDescription() {
        return rarity.getDescription() + " Shield:";
    }
    
}