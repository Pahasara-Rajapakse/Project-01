/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Pasin
 */
public class DateTime {
    
    private String date;
    private String time;
    
public DateTime(){
   date();
   times();
    
}
    
    
    // generate date
public void date(){
        
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MMM-dd");
    date = sdf.format(d);
    
   // date.setText(dd);
    
}

public String getDate(){

    return date;
}
    
// generate time
Timer timer;
SimpleDateFormat st ;
    
public void times() {
    timer = new Timer(1000, (ActionEvent e) -> {
        Date dt = new Date();
        st = new SimpleDateFormat("hh:mm:ss a");
        time = st.format(dt);
       // time.setText(tt);
    });
        
    timer.start();
}

    public String getTime() {
        return time;
    }

}
