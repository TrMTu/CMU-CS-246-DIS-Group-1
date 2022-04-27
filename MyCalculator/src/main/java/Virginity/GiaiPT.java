/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Virginity;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 *
 * @author TrMTu
 */
public class GiaiPT {

    public static String GiaiPTB2(double a, double b, double c) {
        double delta = pow(b, 2) - 4 * a * c;
        double x1, x2, x;
        String s1, s2, s;
        if (a == 0) {
            if (b == 0) {
                return "";
            } else {
                x = (double) (-c / b);
                s = Double.toString(x);
                return "x = " + s;
            }
        } else {
            if (delta == 0) {
                return "PTVN";
            }
            if (delta > 0) {
                x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
                s1 = Double.toString(x1);
                s2 = Double.toString(x2);
                return "x1 = " + s1 + "\nx2 = " + s2;
            }
            if (delta < 0) {
                return "PTNV";
            }
        }
        return "";
    }

    public static String GiaiPTB3(double a, double b, double c, double d) {
        double k = (9 * a * b * c - 2 * pow(b, 3) - 27 * pow(a, 2) * d) / (2 * sqrt(abs(pow(delta, 3))));
        double x1, x2, x3, x;
        String s1, s2, s3, s;
        double k1 = Math.toRadians(k);
        double t = Math.toRadians((Math.acos(k1) / 3));
        double t1 = Math.toRadians((Math.acos(k1) / 3) + (2 * Math.PI) / 3);
        double t2 = Math.toRadians((Math.acos(k1) / 3) - (2 * Math.PI) / 3);
        if (delta > 0) {
            if (abs(k) <= 1) {
                x1 = (2 * sqrt(delta) * Math.cos(t));
                x2 = (2 * sqrt(delta) * Math.cos(t1));
                x3 = (2 * sqrt(delta) * Math.cos(t2));
                s1 = Double.toString(x1);
                s2 = Double.toString(x2);
                s3 = Double.toString(x3);
                return "\nx1 = " + s1 + "\nx2 = " + s2 + "\nx3 = " + s3;

            } else {
                x = (sqrt(delta) * abs(k)) / (3 * a * k) * (pow(abs(k) + sqrt(pow(k, 2) - 1), 1 / 3) + pow(abs(k) - sqrt(pow(k, 2) - 1), 1 / 3)) - (b / (3 * a));
                s = Double.toString(x);
                return "x = " + s;

            }

        }
        if (delta == 0) {
            x = (-b + pow(pow(b, 3) - 27 * pow(a, 2) * d, 1 / 3)) / (3 * a);
            s = Double.toString(x);
            return "x = " + s;
        }
        if (delta < 0) {
            x = (sqrt(abs(delta))) / (3 * a * k) * (pow(abs(k) + sqrt(pow(k, 2) + 1), 1 / 3) + pow(abs(k) - sqrt(pow(k, 2) + 1), 1 / 3)) - (b / (3 * a));
            s = Double.toString(x);
            return "x = " + s;
        }
        return "";
    }
    public static String GiaiHePT12(double a1,double a2,double b1, double b2, double c1, double c2){
      
        return "";
    }
    public static String GiaiHPT13(double a1, double a2, double a3,double b1, double b2, double b3, double c1, double c2, double c3, double d1, double d2, double d3){
        
        
        return "";
    }

}
