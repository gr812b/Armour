package Q1Code.armourType;

import Q1Code.rarity.Rarity;

public class Ring extends BaseArmour {

    public Ring(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public String getDescription() {
        return rarity.getDescription() + " Ring:";
    }
    
}
