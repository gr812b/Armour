package Q1Code.rarity;

public class Mythic implements Rarity {
    public int getRarity() {
        return 4;
    }

    @Override
    public String getRarityDescription() {
        return "Mythic";
    }
}
