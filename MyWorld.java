import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musiqueta.mp3");

    public void started(){
        bgMusic.playLoop();
    }
    
    public void stopped(){
        bgMusic.pause();
    }
    
    
    public void act(){
        started();
    }/**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 300, 2); 
       

        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        WallSmall wallSmall = new WallSmall();
        addObject(wallSmall,29,9);
        wallSmall.setLocation(29,9);
        WallSmall wallSmall2 = new WallSmall();
        addObject(wallSmall2,80,9);
        WallSmall wallSmall3 = new WallSmall();
        addObject(wallSmall3,132,9);
        WallSmall wallSmall4 = new WallSmall();
        addObject(wallSmall4,183,9);
        WallSmall wallSmall5 = new WallSmall();
        addObject(wallSmall5,234,9);
        WallSmall wallSmall6 = new WallSmall();
        addObject(wallSmall6,285,9);
        WallSmall wallSmall7 = new WallSmall();
        addObject(wallSmall7,336,9);
        WallLitle wallLitle = new WallLitle();
        addObject(wallLitle,372,9);
        wallVertical wallVertical = new wallVertical();
        addObject(wallVertical,391,29);
        wallVertical wallVertical2 = new wallVertical();
        addObject(wallVertical2,391,80);
        wallVertical wallVertical3 = new wallVertical();
        addObject(wallVertical3,391,204);
        wallVertical wallVertical4 = new wallVertical();
        addObject(wallVertical4,391,256);

        WallSmall wallSmall8 = new WallSmall();
        addObject(wallSmall8,369,290);
        WallSmall wallSmall9 = new WallSmall();
        addObject(wallSmall9,318,290);
        WallSmall wallSmall10 = new WallSmall();
        addObject(wallSmall10,266,290);
        WallSmall wallSmall11 = new WallSmall();
        addObject(wallSmall11,213,290);
        WallSmall wallSmall12 = new WallSmall();
        addObject(wallSmall12,160,290);
        WallSmall wallSmall13 = new WallSmall();
        addObject(wallSmall13,109,290);
        WallSmall wallSmall14 = new WallSmall();
        addObject(wallSmall14,58,290);
        WallLitle wallLitle2 = new WallLitle();
        addObject(wallLitle2,17,290);
        wallVertical wallVertical5 = new wallVertical();
        addObject(wallVertical5,8,269);
        wallVertical5.setLocation(8,269);
        wallVertical wallVertical6 = new wallVertical();
        addObject(wallVertical6,8,219);
        wallVertical wallVertical7 = new wallVertical();
        addObject(wallVertical7,8,166);
        wallVertical wallVertical8 = new wallVertical();
        addObject(wallVertical8,8,30);
        WallSmall wallSmall15 = new WallSmall();
        addObject(wallSmall15,353,184);
        wallSmall15.setLocation(354,184);
        wallVertical wallVertical9 = new wallVertical();
        addObject(wallVertical9,316,163);
        wallVertical9.setLocation(317,163);
        wallVertical wallVertical10 = new wallVertical();
        addObject(wallVertical10,317,111); 
        WallSmall wallSmall16 = new WallSmall();
        addObject(wallSmall16,297,74);
        WallSmall wallSmall17 = new WallSmall();
        addObject(wallSmall17,185,74);
        WallSmall wallSmall18 = new WallSmall();
        addObject(wallSmall18,133,74);
        wallVertical wallVertical11 = new wallVertical();
        addObject(wallVertical11,96,94);
        wallVertical wallVertical12 = new wallVertical();
        addObject(wallVertical12,94,253);
        wallVertical wallVertical13 = new wallVertical();
        addObject(wallVertical13,221,253);
        wallVertical wallVertical14 = new wallVertical();
        addObject(wallVertical14,206,110);
        WallSmall wallSmall19 = new WallSmall();
        addObject(wallSmall19,206,147);
        WallSmall wallSmall20 = new WallSmall();
        addObject(wallSmall20,219,216);
        WallLitle wallLitle3 = new WallLitle();
        addObject(wallLitle3,93,215);
        wallLitle3.setLocation(94,217);
        WallLitle wallLitle4 = new WallLitle();
        addObject(wallLitle4,120,217);
        WallLitle wallLitle5 = new WallLitle();
        addObject(wallLitle5,95,130);
        removeObject(wallLitle3);
        removeObject(wallVertical12);
        removeObject(wallLitle4);
        wallSmall20.setLocation(194,211);
        removeObject(wallSmall20);
        removeObject(wallVertical13);
        removeObject(wallVertical14);
        removeObject(wallSmall19);
        removeObject(wallVertical9);
        removeObject(wallSmall15);
        removeObject(wallVertical10);
        removeObject(wallSmall16);
        removeObject(wallSmall18);
        removeObject(wallSmall17);
        removeObject(wallVertical11);
        removeObject(wallLitle5);
        WallSmall wallSmall21 = new WallSmall();
        addObject(wallSmall21,45,146);
        WallSmall wallSmall22 = new WallSmall();
        addObject(wallSmall22,28,66);
        WallLitle wallLitle6 = new WallLitle();
        addObject(wallLitle6,63,66);
        wallVertical wallVertical15 = new wallVertical();
        addObject(wallVertical15,81,166);
        WallSmall wallSmall23 = new WallSmall();
        addObject(wallSmall23,102,201);
        WallSmall wallSmall24 = new WallSmall();
        addObject(wallSmall24,154,201);
        WallLitle wallLitle7 = new WallLitle();
        addObject(wallLitle7,192,201);
        wallVertical wallVertical16 = new wallVertical();
        addObject(wallVertical16,213,181);
        wallVertical wallVertical17 = new wallVertical();
        addObject(wallVertical17,213,130);
        WallLitle wallLitle8 = new WallLitle();
        addObject(wallLitle8,217,94);
        WallLitle wallLitle9 = new WallLitle();
        addObject(wallLitle9,240,94);
        WallSmall wallSmall25 = new WallSmall();
        addObject(wallSmall25,354,184);
        wallVertical wallVertical18 = new wallVertical();
        addObject(wallVertical18,318,205);
        WallLitle wallLitle10 = new WallLitle();
        addObject(wallLitle10,370,99);
        lagarto lagarto = new lagarto();
        addObject(lagarto,348,213);        
        removeObject(wallLitle6);
        removeObject(wallSmall22);
        addObject(wallLitle6,13,66);
        sulivanemike sulivanemike = new sulivanemike();
        addObject(sulivanemike,52,105);
        removeObject(wallLitle9);
        removeObject(wallLitle8);
        WallSmall wallSmall26 = new WallSmall();
        addObject(wallSmall26,213,94);
        wallVertical18.setLocation(318,215);
        removeObject(wallVertical18);
        addObject(wallVertical18,319,195);
        wallVertical15.setLocation(92,149);
        addObject(wallLitle8,86,147);
        wallVertical15.setLocation(99,164);
        wallLitle8.setLocation(88,145);
        wallVertical15.setLocation(107,165);
        wallSmall23.setLocation(116,201);
        wallLitle8.setLocation(77,145);
        WallLitle wallLitle11 = new WallLitle();
        addObject(wallLitle11,77,145);
        wallLitle8.setLocation(108,138);
        wallVertical15.setLocation(106,147);
        wallVertical15.setLocation(94,172);
        wallLitle8.setLocation(99,158);
        wallVertical15.setLocation(105,139);
        removeObject(wallVertical15);
        removeObject(wallLitle8);
        addObject(wallVertical15,96,167);
        booo booo = new booo();
        addObject(booo,46,198);
        booo.setLocation(56,186);
    }
}
