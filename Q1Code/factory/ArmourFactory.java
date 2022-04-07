package Q1Code.factory;

import Q1Code.Armour;

public interface ArmourFactory {
    public Armour generateArmour();
    abstract Armour addModifier(Armour armour);
}
