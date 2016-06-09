package robot;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class RobotClass {

    public static void main(String[] params) {

        /** Time in MilliSeconds */
        int delayTime = 2;
        
        try {
            
            
            while (true) {

                Robot r = new Robot();
                Point p = MouseInfo.getPointerInfo().getLocation();

                int x = (int) p.getX();
                int y = (int) p.getY();

                for (int i = 0; i <= 200; i++) {
                    r.mouseMove(x++, y);
                    r.delay(delayTime);
                }

                for (int i = 0; i <= 200; i++) {
                    r.mouseMove(x--, y);
                    r.delay(delayTime);
                }

                r.delay(60000);
            }

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    
    
}