
import java.awt.*;
import java.util.Random;

// Напишите функцию которая рандомно возвращает значение цвета в формате #FFFFFF

public class ConvertRGBToHEX {

    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println(getColor());

    }

    public static String getColor() {
        int r, g, b;
        r = random.nextInt(255);
        g = random.nextInt(255);
        b = random.nextInt(255);
        Color color = new Color(r, g, b);
        String hex = Integer.toHexString(color.getRGB() & 0xffffff);
        if (hex.length() < 6) {
            hex = "0" + hex;
        }
        hex = "#" + hex;
        return hex;
    }
}