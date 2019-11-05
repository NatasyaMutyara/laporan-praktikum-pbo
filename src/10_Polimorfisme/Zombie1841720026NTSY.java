package Tugas;

abstract class Zombie1841720026NTSY implements Destroyable1841720026NTSY{
    protected int health;
    protected int level;
    
    abstract void heal();
    
    @Override
    abstract public void destroyed();
    
    public String getZombieInfo(){
        String info = "";
        info += "Health = " + health;
        info += "Level = " + level;
        return info;
    }
}
