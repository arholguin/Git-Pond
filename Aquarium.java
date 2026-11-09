import edu.cymbal.graphics.*;
import edu.cymbal.graphics.impl.SwingCanvasImpl;
import java.awt.Color;
import java.util.Random;

public class Aquarium {
    public static void main(String[] args) {
        int width = 800;
        int height = 600;
        int steps = 20;

        CanvasAPI canvas = new SwingCanvasImpl(width, height, "My First Drawing");
        PainterAPI painter = canvas.getPainter();

        Color topColor = new Color(10, 25, 75);
        Color bottomColor = new Color(135, 206, 250);

        double rectHeight = (double) height / steps;
        double leftX = -width / 2.0;
        double topY = height / 2.0;

        painter.liftPen();

        for (int i = 0; i < steps; i++) {
            double ratio = (double) i / (steps - 1);

            int r = (int) (topColor.getRed() + ratio * (bottomColor.getRed() - topColor.getRed()));
            int g = (int) (topColor.getGreen() + ratio * (bottomColor.getGreen() - topColor.getGreen()));
            int b = (int) (topColor.getBlue() + ratio * (bottomColor.getBlue() - topColor.getBlue()));
            Color stepColor = new Color(r, g, b);

            double currentY = topY - (i * rectHeight);

            painter.moveTo(leftX, currentY);
            painter.setPenColor(stepColor);
            painter.startFill(stepColor);
            painter.lowerPen();

            for (int side = 0; side < 2; side++) {
                painter.forward(width);
                painter.turnRight(90);
                painter.forward(rectHeight);
                painter.turnRight(90);
            }

            painter.finishFill();
            painter.liftPen();
        }

        // Whale 1
        drawFilledCircle(painter, 90, 150, 30, new Color(58, 144, 255));
        drawFilledHalfCircle(painter, 50, 110, 180, new Color(58, 144, 255));
        drawFilledHalfCircle(painter, 15, 155, 195, new Color(58, 144, 255));
        drawFilledHalfCircle(painter, 40, 110, 180, new Color(175, 214, 255));
        drawFilledCircle(painter, 77.5, 182.5, 5, Color.BLACK);
        drawFilledCircle(painter, 75, 186.5, 1.5, Color.WHITE);

        // Whale 2
        drawFilledCircle(painter, -190, 50, 30, new Color(58, 144, 255));
        drawFilledHalfCircle(painter, 50, -210, 80, new Color(58, 144, 255));
        drawFilledHalfCircle(painter, 15, -255, 95, new Color(58, 144, 255));
        drawFilledHalfCircle(painter, 40, -210, 80, new Color(175, 214, 255));
        drawFilledCircle(painter, -177.5, 82.5, 5, Color.BLACK);
        drawFilledCircle(painter, -175, 86.5, 1.5, Color.WHITE);

        // Main Fish
        drawFilledCircle(painter, 0, -50, 75, new Color(255, 128, 0));
        drawFilledCircle(painter, 50, -50, 75, new Color(255, 128, 0));
        drawFilledCircle(painter, -40, 40, 10, Color.BLACK);
        drawFilledCircle(painter, -45, 50, 3, Color.WHITE);
        drawFilledHalfCircle(painter, 55, 0, 0, new Color(255, 100, 0));
        drawFilledHalfCircle(painter, 55, 50, 0, new Color(255, 100, 0));
        drawFilledRectangle(painter, 20, 150, 0, -50, Color.WHITE);
        drawFilledRectangle(painter, 20, 150, 50, -50, Color.WHITE);
        drawFilledTriangle(painter, 70, 0, 0, new Color(255, 200, 0));
        drawFilledTriangle(painter, 100, 100, 0, new Color(255, 128, 0));

        // Seaweed
        drawRandomFilledRectangle(painter, 30, 550, -300, -300);
        drawRandomFilledRectangle(painter, 30, 200, -270, -300);
        drawRandomFilledRectangle(painter, 30, 250, -240, -300);
        drawRandomFilledRectangle(painter, 30, 350, -210, -300);
        drawRandomFilledRectangle(painter, 30, 450, 300, -300);
        drawRandomFilledRectangle(painter, 30, 150, -360, -300);
        drawRandomFilledRectangle(painter, 30, 500, 240, -300);
        drawRandomFilledRectangle(painter, 30, 280, 210, -300);
        drawRandomFilledRectangle(painter, 30, 470, -330, -300);
        drawRandomFilledRectangle(painter, 30, 385, 330, -300);
        drawRandomFilledRectangle(painter, 30, 415, 180, -300);

        // Rocks
        drawFilledCircle(painter, -20, -340, 50, new Color(79, 70, 0));
        drawFilledCircle(painter, -60, -340, 65, new Color(79, 70, 0));
        drawFilledCircle(painter, -120, -340, 75, new Color(79, 70, 0));
        drawFilledCircle(painter, 80, -340, 80, new Color(79, 70, 0));

        // // Leftside Coral
        // drawFilledRectangle(painter, 225, 25, -400, -300, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 200, 25, -400, -275, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 175, 25, -400, -250, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 150, 25, -400, -225, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 125, 25, -400, -200, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 100, 25, -400, -175, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 75, 25, -400, -150, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 50, 25, -400, -125, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 25, 25, -400, -100, new Color(255, 171, 187));

        // drawFilledRectangle(painter, 205, 25, -400, -300, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 180, 25, -400, -275, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 155, 25, -400, -250, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 130, 25, -400, -225, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 105, 25, -400, -200, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 80, 25, -400, -175, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 55, 25, -400, -150, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 30, 25, -400, -125, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 5, 25, -400, -100, new Color(255, 112, 112));

        // drawFilledRectangle(painter, 185, 25, -400, -300, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 160, 25, -400, -275, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 145, 25, -400, -250, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 120, 25, -400, -225, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 85, 25, -400, -200, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 60, 25, -400, -175, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 35, 25, -400, -150, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 10, 25, -400, -125, new Color(255, 76, 76));

        // // Rightside Coral
        // drawFilledRectangle(painter, 350, 30, 50, -300, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 300, 30, 100, -275, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 250, 30, 150, -250, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 200, 30, 200, -225, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 150, 30, 250, -200, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 100, 30, 300, -175, new Color(255, 171, 187));
        // drawFilledRectangle(painter, 50, 30, 350, -150, new Color(255, 171, 187));

        // drawFilledRectangle(painter, 320, 30, 80, -300, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 270, 30, 130, -275, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 220, 30, 180, -250, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 170, 30, 230, -225, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 120, 30, 280, -200, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 70, 30, 330, -175, new Color(255, 112, 112));
        // drawFilledRectangle(painter, 20, 30, 380, -150, new Color(255, 112, 112));

        // drawFilledRectangle(painter, 290, 30, 130, -300, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 240, 30, 160, -275, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 190, 30, 210, -250, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 140, 30, 260, -225, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 90, 30, 310, -200, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 30, 30, 370, -175, new Color(255, 76, 76));
        // drawFilledRectangle(painter, 5, 30, 395, -150, new Color(255, 76, 76));

        // Leftside Coral
        Color[] leftColors = {
                new Color(255, 171, 187),
                new Color(255, 112, 112),
                new Color(255, 76, 76)
        };
        int[] leftStartWidths = { 225, 205, 185 };
        int[] leftStepCounts = { 9, 9, 8 };

        for (int layer = 0; layer < leftColors.length; layer++) {
            for (int i = 0; i < leftStepCounts[layer]; i++) {
                double stepWidth = leftStartWidths[layer] - (i * 25);
                double stepY = -300 + (i * 25);
                drawFilledRectangle(painter, stepWidth, 25, -400, stepY, leftColors[layer]);
            }
        }

        drawFilledCircle(painter, -380, -260, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -360, -250, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -343, -243, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -268, -217, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -389, -210, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -348, -189, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -312, -280, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -299, -345, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -278, -298, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -391, -238, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, -339, -135, 5, new Color(170, 0, 0));

        // Rightside Coral
        Color[] rightColors = {
                new Color(255, 171, 187),
                new Color(255, 112, 112),
                new Color(255, 76, 76)
        };
        int[] rightStartWidths = { 350, 320, 290 };

        for (int layer = 0; layer < rightColors.length; layer++) {
            for (int i = 0; i < 7; i++) {
                double stepWidth = rightStartWidths[layer] - (i * 50);
                if (stepWidth < 5) {
                    stepWidth = 5;
                }
                double stepX = 400 - stepWidth;
                double stepY = -300 + (i * 25);
                drawFilledRectangle(painter, stepWidth, 30, stepX, stepY, rightColors[layer]);
            }
        }

        drawFilledCircle(painter, 380, -260, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 360, -250, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 343, -243, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 268, -217, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 389, -210, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 348, -289, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 112, -280, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 299, -345, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 278, -298, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 391, -238, 5, new Color(170, 0, 0));
        drawFilledCircle(painter, 339, -235, 5, new Color(170, 0, 0));

        // Small fish 1
        drawFilledCircle(painter, -200, 100, 10, new Color(255, 200, 90));
        drawFilledTriangle(painter, 10, -191, 105, new Color(255, 200, 90));

        // Small fish 2
        drawFilledCircle(painter, -100, 190, 20, new Color(255, 200, 90));
        drawFilledTriangle(painter, 25, -90, 205, new Color(255, 200, 90));

        // Small fish 3
        drawFilledCircle(painter, 200, 130, 10, new Color(255, 200, 90));
        drawFilledTriangle(painter, 10, 182, 135, new Color(255, 200, 90));

        // Bubbles
        drawBubbles(painter, -100, 100);
        drawBubbles(painter, -110, 80);
        drawBubbles(painter, -100, 60);

        drawBubbles(painter, 290, 190);
        drawBubbles(painter, 300, 210);
        drawBubbles(painter, 290, 230);
        drawBubbles(painter, 310, 260);

        drawBubbles(painter, -230, 140);
        drawBubbles(painter, -220, 160);
        drawBubbles(painter, -230, 180);
        drawBubbles(painter, -215, 200);

    }

    public static void drawFilledCircle(PainterAPI p, double x, double y, double radius, Color color) {
        p.liftPen();
        p.setPenColor(color);
        p.startFill(color);
        p.moveTo(x, y);
        p.lowerPen();
        p.circle(radius);
        p.finishFill();
        p.liftPen();
    }

    public static void drawFilledTriangle(PainterAPI p, double size, double x, double y, Color color) {
        double h = (Math.sqrt(3) / 2.0) * size;
        double ax = x + size / 2.0;
        double ay = y + h;

        p.liftPen();
        p.moveTo(x, y);
        p.setPenColor(color);
        p.lowerPen();
        p.startFill(color);

        p.moveTo(x + size, y);
        p.moveTo(ax, ay);
        p.moveTo(x, y);

        p.finishFill();
        p.liftPen();
    }

    public static void drawFilledRectangle(PainterAPI p, double width, double height, double x, double y, Color color) {
        p.liftPen();
        p.moveTo(x, y); // Move to bottom-left corner without drawing
        p.setPenColor(color);
        p.lowerPen(); // Start tracing the outline
        p.startFill(color);

        p.moveTo(x + width, y); // Bottom edge to bottom-right
        p.moveTo(x + width, y + height); // Right edge to top-right
        p.moveTo(x, y + height); // Top edge to top-left
        p.moveTo(x, y); // Left edge back to bottom-left

        p.finishFill();
        p.liftPen();
    }

    public static void drawRandomFilledRectangle(PainterAPI p, double width, double height, double x, double y) {
        Random rand = new Random();
        int r = rand.nextInt(80);
        int g = 100 + rand.nextInt(156);
        int b = rand.nextInt(80);
        Color randomColor = new Color(r, g, b);

        p.liftPen();
        p.moveTo(x, y);
        p.setPenColor(randomColor);
        p.lowerPen();
        p.startFill(randomColor);

        p.moveTo(x + width, y);
        p.moveTo(x + width, y + height);
        p.moveTo(x, y + height);
        p.moveTo(x, y);

        p.finishFill();
        p.liftPen();
    }

    public static void drawFilledHalfCircle(PainterAPI p, double radius, double x, double y, Color color) {
        int segments = 60;

        p.liftPen();
        p.moveTo(x + radius, y);
        p.setPenColor(color);
        p.lowerPen();
        p.startFill(color);

        for (int i = 1; i <= segments; i++) {
            double angle = Math.PI * i / segments;
            double px = x + radius * Math.cos(angle);
            double py = y - radius * Math.sin(angle);
            p.moveTo(px, py);
        }

        p.moveTo(x + radius, y);
        p.finishFill();
        p.liftPen();
    }

    public static void drawBubbles(PainterAPI p, double x, double y) {
        double radius = 10;
        p.circle(radius);
        p.liftPen();
        p.moveTo(x, y);
        p.setPenColor(new Color(160, 160, 255));
        p.lowerPen();
        p.circle(radius);
        radius -= 7;

        p.liftPen();
        p.moveTo(x - 2, y + 10);
        p.lowerPen();
        p.circle(radius);
        radius -= 1.5;

        p.liftPen();
        p.moveTo(x + 5, y + 5);
        p.lowerPen();
        p.circle(radius);
        p.liftPen();

    }

}
