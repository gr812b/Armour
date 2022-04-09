package Q1Code.rarity;

public class Epic implements Rarity {
    public int getRarity() {
        return 3;
    }
    
    @Override
    public String getDescription() {
        return "Epic";
    }
}