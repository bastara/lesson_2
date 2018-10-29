package Lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class L13_T2_Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        BufferedImage tmpImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        WritableRaster tmpRaster = tmpImage.getRaster();

        Scanner scanner = new Scanner(System.in);
        int diameter;
        int minDiameter = 3;
        do {
            System.out.print("Введите коэффициент размытия (>=3, нечетное число) ");
            diameter = scanner.nextInt();
        } while (diameter < minDiameter || diameter % 2 == 0);

        double e = (double) 1 / (diameter * diameter);
        double[][] blur = new double[diameter][diameter];
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                blur[j][i] = e;
            }
        }

        final int COLORS_COUNT_IN_RGB = 3;
        double[] pixel = new double[COLORS_COUNT_IN_RGB];
        int border = diameter / 2;
        for (int j = border; j < height - border; ++j) {
            for (int i = border; i < width - border; ++i) {
                pixel[0] = 0;
                pixel[1] = 0;
                pixel[2] = 0;
                int[] pixelAround = new int[COLORS_COUNT_IN_RGB];
                for (int k = j - border; k <= j + border; k++) {
                    for (int m = i - border; m <= i + border; m++) {
                        raster.getPixel(m, k, pixelAround);
                        pixel[0] += pixelAround[0] * blur[m - i + border][k - j + border];
                        pixel[1] += pixelAround[1] * blur[m - i + border][k - j + border];
                        pixel[2] += pixelAround[2] * blur[m - i + border][k - j + border];
                    }
                }

                for (int k = 0; k < 3; k++) {
                    if (pixel[k] < 0) {
                        pixel[k] = 0;
                    } else if (pixel[k] > 255) {
                        pixel[k] = 255;
                    }
                }
                tmpRaster.setPixel(i, j, pixel);
            }
        }
        ImageIO.write(tmpImage, "png", new File("out.png"));
    }
}
