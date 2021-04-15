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
    public static int lab3equation(int k){
        
        int[] array = new int[k];
        int min=10000;
        int mini=0;
        for (int i=0;i<k;i=i+1)
        {
           array[i]=(int) (Math.random() * 10);
           if (array[i]<min)
           {
               min=array[i];
               mini=i;
           }
        }
        int maxnsd=1;
        int count=0;
        for (int i=1;i<=min;i=i+1)
        {
            for (int j=0;j<k;j=j+1)
            {
                if (array[j]%i==0)
                {
                    count+=1;
                }
            }
            if (count==k)
            {
                maxnsd=i;
            }
        }
        for (int i=0;i<k;i=i+1)
        {
            System.out.println(array[i]);
        }
        return maxnsd;
    }
    public static String lab3equations(int k){
        
        int[] array = new int[k];
        int min=10000;
        int mini=0;
        for (int i=0;i<k;i=i+1)
        {
           array[i]=(int) Math.random()*10000;
           if (array[i]<min)
           {
               min=array[i];
               mini=i;
           }
        }
        int maxnsd=1;
        int count=0;
        for (int i=1;i<=min;i=i+1)
        {
            for (int j=0;j<k;j=j+1)
            {
                if (array[j]%i==0)
                {
                    count+=1;
                }
            }
            if (count==k)
            {
                maxnsd=i;
            }
        }
        String strarray;
        strarray = "";
        for (int i=0;i<k;i=i+1)
        {
            strarray=strarray+","+array[i];
        }
        return strarray;
    }
}
