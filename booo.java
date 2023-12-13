import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class booo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class booo extends Actor
{
     public booo(){
        getImage().scale(getImage().getWidth()* 1/2, getImage().getHeight() * 1/2);
    }
    /**
     * Act - do whatever the booo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if(boofind()==true){
            getWorld().removeObject(this);            
        }
    }
    
    public boolean boofind(){
         if(isTouching(sulivanemike.class))
         {
            return true;
         }
         else{
            return false;
            }
}
}
