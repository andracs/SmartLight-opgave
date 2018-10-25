package hu.hungarian;

import javafx.scene.paint.Color;

public class SmartLight {
    private short lightPercent = 0;
    private Color color = Color.WHITESMOKE;

    SmartLight(){
    }

    public void turnUp(){
        lightPercent += 20;
        if(lightPercent > 100)
            lightPercent = 100;
    }

    public void turnDown(){
        lightPercent -= 20;
        if(lightPercent < 0)
            lightPercent = 0;
    }

    public String toString(){
        return "The light is at " + lightPercent + "% and the color is " + color;
    }

    public short getLightPercent() {
        return lightPercent;
    }

    public void setLightPercent(short lightPercent) {
        this.lightPercent = lightPercent;
        if(lightPercent < 0)
            this.lightPercent = 0;
        else if(lightPercent > 100)
            this.lightPercent = 100;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if(color != Color.BLACK)
            this.color = color;
    }
}
