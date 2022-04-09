package Q1Code.decorator;

import Q1Code.Armour;

public class Intelligence extends ArmourDecorator{

    public Intelligence(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\nIntelligence + 5";
    }
    
}
