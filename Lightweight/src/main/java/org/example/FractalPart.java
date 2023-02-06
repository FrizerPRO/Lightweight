package org.example;

class FractalPart {
    int width;
    int length;
    int xPosition;
    int yPosition;
    FractalImage image;

    public FractalPart(int width, int length, int xPosition, int yPosition, FractalImage image) {
        this.width = width;
        this.length = length;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.image = image;
        System.out.println("Created fractal part");
    }

    public void drawFrac() {
        image.drawFrac();
    }

}
