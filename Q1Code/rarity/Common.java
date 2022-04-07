package Q1Code.rarity;

public class Common implements Rarity {
    public int getRarity() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Common";
    }
}
