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

    private int h;
    private int m;
    private int i;

    public Count(int h, int m, int i) {
        this.h = h;
        this.m = m;
        this.i = i;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("current time: "+h+" : "+m+" : " +i);
            try {
                i++;  
                if (i == 60) {
                    i = 0;
                    m++;
                    if (m == 60) {
                        m = 1;
                        h++;
                        if(h== 12){
                        h=0;
                        }
                    }
                }
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(Count.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
