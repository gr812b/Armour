package Q1Code.decorator;

import Q1Code.Armour;

public class Vitality extends ArmourDecorator{

    public Vitality(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\nVitality + 5";
    }
    
}

