/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.text.DecimalFormat;
import knu.fit.ist.ta.lab2.*;

/**
 *
 * @author Mark
 */
public class Lab3View {
    DecimalFormat df = new DecimalFormat("###");
    public String showResult(String xString){
        if(xString.equals("")){return "Please enter x";}
        int k;      
        k=(int) Float.parseFloat(xString);
        
        if(k<0){return "Wrong k. Must be positive";}
        else if(1<1){return "";}
        
        else {return df.format(Calculate.lab3equation(k));}
       
}
        public String showResults(String xString){
        int k;      
        k=(int) Float.parseFloat(xString);
        System.out.println(df.format(Calculate.lab3equations(k)));
        return "0";
       
}
}
