package Q1Code.armourType;

import Q1Code.rarity.Rarity;

public class Amulet extends BaseArmour {

    public Amulet(Rarity rarity) {
        this.rarity = rarity;
    }
    
    @Override
    public String getDescription() {
        return "---Amulet---" + "\n" + "Rarity: " + getRarityDescription();
    }
}
