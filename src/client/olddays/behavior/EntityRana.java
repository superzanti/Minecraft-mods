package net.minecraft.src;

public class EntityRana extends EntityCreature implements IMob{
    public EntityRana(World w){
        super(w);
    }

    protected int getDropItemId(){
        return Item.appleRed.shiftedIndex;
    }

    protected String getHurtSound(){
        return "random.classic_hurt";
    }

    /*protected String getDeathSound(){
        return "random.classic_hurt";
    }*/

    public int getMaxHealth(){
        return 5;
    }

    public boolean allow(int dim){
        return false;
    }
}