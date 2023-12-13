import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    public int temp = 25;
    public int temp1 = 25;
    public int temp2 = 25;
    public int temp3 = 25;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }
    public void act(){
        temp1--;
        
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("2.png"));
            temp2--;
        }
        //Diálogo bob
        if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            setBackground(new GreenfootImage("3.png"));
            temp3--;
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
    
    private void prepare()
    {

    }
}
