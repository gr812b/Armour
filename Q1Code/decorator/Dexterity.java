package Q1Code.decorator;

import Q1Code.Armour;

public class Dexterity extends ArmourDecorator {

    public Dexterity(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\nDexterity + 5";
    }
    
}
