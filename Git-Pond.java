/**
 * Draws an aquarium scene with two to three different types of underwater lifeforms. The main fish
 * will be a clown fish created from layered circles, triangles, and rhombus shapes. The starfish will
 * be layered star shapes, and if possible the whale will consist of varying sized circles.
 * The background will consist of layered rectagles positioned to creat a gradient. The background will 
 * consist of seaweed made from long rectangular shapes with varying colors and lengths, and fish sihouettes
 * to create dimension. The foreground will consist of coral shapes created from layered rectangular shapes
 * and small circles to give the appearance of tecture, and rock like shapes made from layered circles.
 * 
 * @param PainterAPI creates the tool used to draw images
 * @param fillCircle creates filled circles to be used throughout aquarium
 * @param fillTriangle creates filled triangles to be used throughout aquarium
 * @param fillRectangle creates filled rectangles to be used in background and throughout aquarium
 * @param fillStar creates filled stars to be used in background and throughout aquarium
 * @param xPosition the x coordinates of the top of all drawn objects
 * @param yPosition the y coordinates of the top of all drawn objects
 * @param height the height of all drawn objects
 * @param width the width of all drawn objects
 * @param bodyClownFishColor is the color of the main fish
 * 
 */

import edu.cymbal.graphics.*;
import edu.cymbal.graphics.impl.SwingCanvasImpl;
import java.awt.Color;

public class Aquarium {

    public void drawFilledCircle(PainterAPI p, Color fillCircle, int xPosition, int yPosition, int height) {
    }
    
    public void drawFilledRectangle(PainterAPI p, Color fillRectangle, int xPosition, int yPosition, int widthe, int height) {
        // for (int i = 0; i < 2; i++) 
    }

    public void drawFilledTriangle(PainterAPI p, Color fillTriangle, int xPosition, int yPosition, int height) {
        // for (int i = 0; i < 5; i++)
    }

    public void drawFilledHalfCircle(PainterAPI p, Color fillHalfCircle, int xPosition, int yPosition, int height) {
    }

    public void drawFilledStar(PainterAPI p, Color fillStar, int xPosition, int yPosition, int height) {
    }

    public void drawBackround(PainterAPI p, Color fillRectangle, int xPosition, int yPosition, int height) {
        //calls drawFilledRectangle
    }

    public void drawMainClownFish(PainterAPI p, Color bodyClownFishColor, int xPosition, int yPosition, int height) {
        //calls drawFilledCircle
        //calls drawFilledHalfCircle
        //calls drawFilledRectangle
    }

    public void drawStarfish(PainterAPI p, Color bodyStarfish, int xPosition, int yPosition, int height) {
        //calls drawFilledStar
        //calls drawStarShadow
    }

    public void drawFishSilhouette(PainterAPI p, Color bodyFishSilhouette, int xPosition, int yPosition, int height) {
        //calls drawFilledCircle
        //calls drawFilledTriangle
    }

    public void drawSeaweed(PainterAPI p, Color fillRectangle, int xPosition, int yPosition, int height) {

    }

    public void drawCoral(PainterAPI p, Color fillRectangle, int xPosition, int yPosition, int height) {
        //calls drawFilledRectangle
        //calls drawFilledCircle
    }

    public void drawRocks(PainterAPI p, Color fillCircle, int xPosition, int yPosition, int height) {
        //calls drawFilledCircle
        //calls drawFilledHalfCircle
}
}
