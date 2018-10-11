package Lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class L13_T2_Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        WritableRaster tmpRaster = raster;

        for (int j = 1; j < height - 1; ++j) {
            for (int i = 1; i < width - 1; ++i) {
                pixel[0] = 0;
                pixel[1] = 0;
                pixel[2] = 0;
                //создаем матрицу RGB соседних элементов
                int[] pixelAround = new int[COLORS_COUNT_IN_RGB];
                int[][][] arrayPixel = new int[3][3][3];
                for (int k = j - 1; k <= j + 1; k++) {
                    for (int m = i - 1; m <= i + 1; m++) {
                        raster.getPixel(m, k, pixelAround);
                        arrayPixel[m - i + 1][k - j + 1][0] = pixelAround[0] / 9;
                        arrayPixel[m - i + 1][k - j + 1][1] = pixelAround[1] / 9;
                        arrayPixel[m - i + 1][k - j + 1][2] = pixelAround[2] / 9;
                        //в этом же цикле вычисляем RGB пикселя который подвергается размытиюю либо для других эффектов
                        pixel[0] += arrayPixel[m - i + 1][k - j + 1][0];
                        pixel[1] += arrayPixel[m - i + 1][k - j + 1][1];
                        pixel[2] += arrayPixel[m - i + 1][k - j + 1][2];
                    }
                }
                tmpRaster.setPixel(i, j, pixel);
            }
        }
        ImageIO.write(image, "png", new File("out.png"));
    }
}
