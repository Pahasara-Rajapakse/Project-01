/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager.WindwUtils;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
/**
 *
 * @author Pasin
 */
public class WindowUtils {
    
    public static void close(JFrame frame) {
        WindowEvent closeWindow = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
