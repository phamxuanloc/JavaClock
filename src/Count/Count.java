/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Count;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Count extends Thread {

    @Override
    public void run() {
        int i = 50;
        while (true) {

            try {
                System.out.println(i);
                i++;
                if (i == 60) {
                    i = 0;
                }
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(Count.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
