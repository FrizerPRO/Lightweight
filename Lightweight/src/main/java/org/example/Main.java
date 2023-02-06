package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    FractalImage image1 = FractalFactory.getFractalImage("Derevo");
    FractalPart frac1 = new FractalPart(0, 0, 0, 0, image1);
    FractalImage image2 = FractalFactory.getFractalImage("Bereza");
    FractalPart frac2 = new FractalPart(0, 0, 0, 0, image2);
    FractalImage image3 = FractalFactory.getFractalImage("Derevo");
    FractalPart frac3 = new FractalPart(0, 0, 0, 0, image3);
}