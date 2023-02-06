package org.example;

import java.util.ArrayList;

class FractalFactory {
    static ArrayList<FractalImage> existingFractalsImages = new ArrayList<>();

    static FractalImage getFractalImage(String imageName) {
        for (var image : existingFractalsImages) {
            if (image.imageName.equals(imageName)) {
                System.out.println("added old image with name: " + image.imageName);
                return image;
            }
        }
        return new FractalImage(imageName);
    }
}
