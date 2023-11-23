/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Pasin
 */
public class DateTime {
    
    private final JLabel dateLabel;
    private final JLabel timeLabel;

    public DateTime(JLabel date, JLabel time) {
        this.dateLabel = date;
        this.timeLabel = time;
    }
        
    // generate date
    public void date(){
    
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MMM-dd");
    dateLabel.setText(sdf.format(d));
    //date.setText(dd);
    
    }

    
    // generate time
    Timer timer;
    SimpleDateFormat st ;
    
    public void times() {
    timer = new Timer(1000, (ActionEvent e) -> {
    Date dt = new Date();
    st = new SimpleDateFormat("hh:mm:ss a");
    timeLabel.setText(st.format(dt));
    //time.setText(tt);
    });
    
    timer.start();
    }
     
    
}
