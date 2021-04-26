import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (Ray Brandeberry) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 12);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 587);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 12, 25 + 50*i);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 787, 25 + 50*i);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 150);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 150);
        }
        for(int i = 0; i < 10; i++)
        {
            addObject( new Wall("edge.png"), 325 + 50*i, 300);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge2.png"), 150, 325 + 50*i);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 175 + 50*i, 425);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge2.png"), 575, 425 + 50*i);
        }
    }
}
