package assets;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Images {

    public static Image b = null;
    public static Image background = null;
    public static Image shock= null;
    public static Image blinkStand = null;
    public static Image blinkRight = null;
    public static Image blinkLeft= null;
    public static Image Right = null;
    public static Image Left= null;
    public static Image Sky=null;
    public static Image Sun=null;
    public static Image Moon=null;
    public static Image egg=null;
    public static Image egg_1=null;
    public static Image egg_2=null;
    public static Image egg_3=null;
    public static Image egg_4=null;
    public static Image meat=null;
    public static Image eat=null;
    public static Image agumon_right=null;
    public static Image agumon_rightBlink=null;
    public static Image agumon_left=null;
    public static Image agumon_leftBlink=null;
    public static Image agumon_eat=null;
    public static Image rock=null;
    public static Image paper=null;
    public static Image scissors=null;
    public static String answer = null;

    static {

        try {
            b = ImageIO.read(new File("./assets/oie_transparent (6).png"));
            background = ImageIO.read(new File("./assets/image.png"));
            shock = ImageIO.read(new File("./assets/koromon.png"));
            blinkStand= ImageIO.read(new File("./assets/BlinkStand.png"));
            blinkLeft= ImageIO.read(new File("./assets/LeftPrint.png"));
            Left= ImageIO.read(new File("./assets/Left.png"));
            blinkRight= ImageIO.read(new File("./assets/RightBlink.png"));
            Right= ImageIO.read(new File("./assets/Right.png"));
            Sun= ImageIO.read(new File("./assets/oie_transparent (8).png"));
            Sky= ImageIO.read(new File("./assets/image_withoutsun.png"));
            Moon= ImageIO.read(new File("./assets/oie_transparent (9).png"));
            egg= ImageIO.read(new File("./assets/oie_transparent (10).png"));
            egg_1= ImageIO.read(new File("./assets/oie_transparent (11).png"));
            egg_2= ImageIO.read(new File("./assets/oie_transparent (12).png"));
            egg_3= ImageIO.read(new File("./assets/oie_transparent (13).png"));
            egg_4= ImageIO.read(new File("./assets/oie_transparent (14).png"));
            meat= ImageIO.read(new File("./assets/oie_transparent (19).png"));
            eat= ImageIO.read(new File("./assets/oie_transparent (17).png"));
            agumon_rightBlink= ImageIO.read(new File("./assets/oie_transparent (23).png"));
            agumon_right= ImageIO.read(new File("./assets/oie_transparent (22).png"));
            agumon_left= ImageIO.read(new File("./assets/oie_transparent (21).png"));
            agumon_leftBlink= ImageIO.read(new File("./assets/oie_transparent (20).png"));
            agumon_eat= ImageIO.read(new File("./assets/oie_transparent (24).png"));
            rock= ImageIO.read(new File("./assets/rock.png"));
            paper= ImageIO.read(new File("./assets/paper.png"));
            scissors= ImageIO.read(new File("./assets/scissors.png"));

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}


