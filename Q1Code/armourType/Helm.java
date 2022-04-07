package Q1Code.armourType;

import Q1Code.rarity.Rarity;

public class Helm extends BaseArmour {

    public Helm(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public String getDescription() {
        return "---Helm---" + "\n" + "Rarity: " + rarity.getRarityDescription();
    }
    
}
