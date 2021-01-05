package day11.task2.Heroes;

public abstract class Hero {
    private int health;
    private float physDef;
    private float magicDef;
    private int physAttack;
    private int magicAttack;

    public abstract void takeDamage(int amount, float def);
    public abstract float getPhysDef();
    public abstract float getMagicDef();
    public abstract int getHealth();
    public abstract void heal(int amount);

}
