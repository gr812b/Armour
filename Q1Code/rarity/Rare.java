package Q1Code.rarity;

public class Rare implements Rarity {

    @Override
    public int getRarity() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Rare";
    }
    
}
