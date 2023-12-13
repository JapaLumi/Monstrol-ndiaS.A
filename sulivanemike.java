import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sulivanemike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sulivanemike extends Actor
{
    public sulivanemike() {
        getImage().scale(getImage().getWidth() * 1/4, getImage().getHeight() * 1/4);
    }

// A fração de 1/12 é o comando de escala para o novo dimensionamento da imagem da classe

    public int speed = 3;
    /**
     * Act - do whatever the sulivanemike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
    }
    public void mover()
    {
        if(Greenfoot.isKeyDown("up")){
           this.setLocation(this.getX(),this.getY()-speed);
           if(hitWall()==true){
            this.setLocation(this.getX(),this.getY()+speed);
            }
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(),this.getY()+speed); 
            if(hitWall()==true){
             this.setLocation(this.getX(),this.getY()-speed);
            }  
        }
        if(Greenfoot.isKeyDown("left")){ 
            this.setLocation(this.getX()-speed,this.getY());
            if(hitWall()==true){
                this.setLocation(this.getX()+speed,this.getY()); 
            }
        }
         if(Greenfoot.isKeyDown("right")){ 
             this.setLocation(this.getX()+speed,this.getY()); 
             if(hitWall()==true){
                  this.setLocation(this.getX()-speed,this.getY()); 
                
                }
        }
       
    }
     public boolean hitWall(){
         if(isTouching(Walls.class))
         {
            return true;
         }
         else{
            return false;
            }
        }
    
   
}
