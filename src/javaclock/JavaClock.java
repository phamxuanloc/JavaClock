/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclock;

import Count.Count;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class JavaClock {

    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Count count = new Count();
        count.start();
    }

    public void menu() {
        System.out.println("nhap h:");
        int h = Integer.parseInt(sc.nextLine());
        System.out.println("nhap m:");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("nhap s:");
        int s = Integer.parseInt(sc.nextLine());

    }
}
