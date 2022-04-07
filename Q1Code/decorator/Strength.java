package Q1Code.decorator;

import Q1Code.Armour;

public class Strength extends ArmourDecorator {

    public Strength(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\nmodifier of Strength";
    }
    
}
