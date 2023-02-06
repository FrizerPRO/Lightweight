package org.example;

import java.util.Objects;

class FractalImage {
    String imageName;
    String veryBigData;

    public FractalImage(String imageName) {
        System.out.println("Created new Image(Big data, long load) named: " + imageName);
        this.imageName = imageName;
        this.veryBigData = "veryBigData downloaded";
    }

    public void drawFrac() {
        System.out.println("DONE DREW FRACTAL!!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FractalImage that)) return false;
        return Objects.equals(imageName, that.imageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName);
    }
}
