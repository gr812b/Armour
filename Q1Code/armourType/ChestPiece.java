package Q1Code.armourType;

import Q1Code.rarity.Rarity;

public class ChestPiece extends BaseArmour {

    public ChestPiece(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public String getDescription() {
        return rarity.getDescription() + " Chest Piece:";
    }
    
}
