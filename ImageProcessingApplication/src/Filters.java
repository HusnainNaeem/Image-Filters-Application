import java.awt.Color;
import java.awt.image.BufferedImage;

public class Filters {
    public static BufferedImage filter1(BufferedImage inputImage) {
        BufferedImage resultantImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(),
                BufferedImage.TYPE_INT_BGR);
        for (int row = 0; row < inputImage.getHeight(); row += 1) {
            for (int column = 0; column < inputImage.getWidth(); column += 1) {
                Color oldColor = new Color(inputImage.getRGB(column, row));
                Color newColor = new Color(oldColor.getBlue(), oldColor.getRed(), oldColor.getGreen());
                resultantImage.setRGB(column, row, newColor.getRGB());
            }
        }
        return resultantImage;
    }

    public static BufferedImage filter2(BufferedImage inputImage) {
        BufferedImage resultantImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(),
                BufferedImage.TYPE_INT_BGR);
        for (int row = 0; row < inputImage.getHeight(); row += 1) {
            for (int column = 0; column < inputImage.getWidth(); column += 1) {
                Color oldColor = new Color(inputImage.getRGB(column, row));
                Color newColor = new Color(oldColor.getGreen(), oldColor.getBlue(), oldColor.getRed());
                resultantImage.setRGB(column, row, newColor.getRGB());
            }
        }
        return resultantImage;
    }

    public static BufferedImage filter3(BufferedImage inputImage) {
        BufferedImage resultantImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(),
                BufferedImage.TYPE_INT_BGR);
        for (int row = 0; row < inputImage.getHeight(); row += 1) {
            for (int column = 0; column < inputImage.getWidth(); column += 1) {
                Color oldColor = new Color(inputImage.getRGB(column, row));
                Color newColor = new Color(oldColor.getBlue(), oldColor.getGreen(), oldColor.getRed());
                resultantImage.setRGB(column, row, newColor.getRGB());
            }
        }
        return resultantImage;
    }

    public static BufferedImage filter4(BufferedImage inputImage) {
        BufferedImage resultantImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(),
                BufferedImage.TYPE_INT_BGR);
        for (int row = 0; row < inputImage.getHeight(); row += 1) {
            for (int column = 0; column < inputImage.getWidth(); column += 1) {
                Color oldColor = new Color(inputImage.getRGB(column, row));
                Color newColor = new Color(oldColor.getBlue(), oldColor.getBlue(), oldColor.getGreen());
                resultantImage.setRGB(column, row, newColor.getRGB());
            }
        }
        return resultantImage;
    }

    public static BufferedImage grayScale(BufferedImage inputImage) {
        BufferedImage resultantImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(),
                BufferedImage.TYPE_INT_BGR);
        for (int row = 0; row < inputImage.getHeight(); row += 1) {
            for (int column = 0; column < inputImage.getWidth(); column += 1) {
                Color oldColor = new Color(inputImage.getRGB(column, row));
                int gray = (oldColor.getBlue() + oldColor.getRed() + oldColor.getGreen()) / 3;
                Color newColor = new Color(gray, gray, gray);
                resultantImage.setRGB(column, row, newColor.getRGB());
            }
        }
        return resultantImage;
    }

    public static BufferedImage zoomImage(BufferedImage inputImage, int zoomFactor) {
        BufferedImage resultantImage = new BufferedImage(inputImage.getWidth() * zoomFactor,
                inputImage.getHeight() * zoomFactor, BufferedImage.TYPE_INT_BGR);
        for (int row = 0; row < inputImage.getHeight(); row += 1) {
            for (int column = 0; column < inputImage.getWidth(); column += 1) {
                for (int newRow = row * zoomFactor; newRow < (row * zoomFactor) + zoomFactor; newRow += 1) {
                    for (int newColumn = column * zoomFactor; newColumn < (column * zoomFactor) + zoomFactor; newColumn += 1) {
                        resultantImage.setRGB(newColumn, newRow, inputImage.getRGB(column, row));
                    }
                }
            }
        }
        return resultantImage;
    }
}
