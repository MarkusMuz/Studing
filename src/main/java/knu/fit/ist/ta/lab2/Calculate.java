/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

/**
 *
 * @author Mark
 */
public class Calculate {
    public static float lab2equation(float x){
    
    int a,b,c,d;
    a=0;
    b=8;
    c=-5;
    d=1;
    
    float res;
    res=(float) Math.sqrt(d*x);
    
    if (x!=0.625f)
    {
        res =(float) res / (a*a*x+b*x+c); 
    }
    else
    {
        res= Integer.MAX_VALUE;
    }
    
    return (float) res;
    }
}
