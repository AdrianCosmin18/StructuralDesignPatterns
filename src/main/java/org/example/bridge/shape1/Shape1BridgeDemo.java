package org.example.bridge.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {

        Circle circle = new BlueCircle();

        Square square = new BlueSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
