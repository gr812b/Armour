package Q1Code.decorator;

import Q1Code.Armour;

public class Mana extends ArmourDecorator{

    public Mana(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\nMana + 5";
    }
    
}
