package Q1Code.rarity;

public class Uncommon implements Rarity {
    public int getRarity() {
        return 1;
    }

    @Override
    public String getRarityDescription() {
        return "Uncommon";
    }
}
