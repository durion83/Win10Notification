import java.awt.*;
import java.net.MalformedURLException;

public class main {
    public static void main(String[]args){
        if (SystemTray.isSupported()) {
            displayTray td = new displayTray();
            try {
                String one = args[0];
                String two = args[1];
                td.displayTray(one,two);
            }catch ( MalformedURLException e){
                System.out.println(e);
            }catch (AWTException e1){
                System.out.println(e1);
            }catch (ArrayIndexOutOfBoundsException e3){
                System.out.println(e3);
            }
        } else {
            System.err.println("System tray not supported!");
        }
    }
}
