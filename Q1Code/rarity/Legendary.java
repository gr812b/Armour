package Q1Code.rarity;

public class Legendary implements Rarity {
    public int getRarity() {
        return 3;
    }
    
    @Override
    public String getRarityDescription() {
        return "Legendary";
    }
}
