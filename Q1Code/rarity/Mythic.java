package Q1Code.rarity;

public class Mythic implements Rarity {
    public int getRarity() {
        return 4;
    }

    @Override
    public String getDescription() {
        return "Mythic";
    }
}
