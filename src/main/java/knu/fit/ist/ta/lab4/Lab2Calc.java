/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mark
 */
public class Lab2Calc {
    public String text;
    Matcher mat;
    
    public Lab2Calc(){
    
        text = "The challenges for scalable fonts are the support-software overhead and the hinting required for more compact renderings. Some fonts are designed for high resolution or print applications, and their hinting doesn’t necessarily translate into efficient and good-looking fonts on a lower-resolution display.\n" +
        "What Monotype has done is bring this scalable capability to the low- and mid-range hardware spectrum, including manual and automatic hinting. New products include iType Spark and WorldType Shaper Spark. The iType Spark platform, which generates bitmap fonts, supports language types like Latin and Chinese that have unique fonts per character.\n" +
        "Though there may be proportional spacing between characters, each glyph is distinct. WorldType Shaper Spark handles more complex scenarios that involve combining multiple character glyphs into a larger combination. This approach is used for languages such as Hebrew, Thai, Devenagri, and Arabic. WorldType Shaper Spark handles complex and bidirectional scripts.\n" +
        "The iType Spark platform uses 20 kB of RAM and under 100 kB of flash. WorldType Shaper Spark takes a little more, but is only needed if there are more complex languages. The memory and processing requirements allow either platform to work with microcontrollers and low-end x86 processors. The output for iType Spark can be monochrome, 8-bit grayscale, or outlines.\n" +
        "It supports Monotype lightweight hints and performs its own auto-hinting. There’s support for TrueType fonts as well, but the best-quality fonts will be the Monotype Spark fonts. The base system includes a number of them. Monotype has already delivered the platforms on four development boards with displays—the Keil STM 23 EXL, NXP XPRESSO LPC1769, Microchip PIC32 board, and Renesas SH7264.\n" +
        "Support for the iType Spark and WorldType Shaper Spark can easily translate onto other platforms and displays.\n";
        text = cleanString(text);
    }
    
    private String cleanString(String input){
        input = input.toLowerCase();
        input = input.replaceAll("-{2,}","");
        input = input.replaceAll(" {2,}"," ");
        input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    } 

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    public String Task4(List<String> result, int n, int b){
    
        List<String> answerList = new ArrayList<String>();
        int[] numberOfWords = new int[result.size()];
        
        for (int j = 0; j < result.size(); j++){
        
            String pattern = "";
            if (b == 1)
                pattern = "\\b" + result.get(j).replace("-", "\\-")  + "+\\b";
            else 
                pattern = result.get(j).replace("-", "\\-")  + "+";
            
            List<String> answerLine = new ArrayList<String>();
            mat = Pattern.compile(pattern).matcher(text);
        
            while (mat.find()){
                answerLine.add(text.substring(mat.start(), mat.end()));
            }
            
            numberOfWords[j] = answerLine.size();
            answerList.add(result.get(j));
            //System.out.println(numberOfWords[j] + " " + answerList.get(j));
        }
        
        String res = "";
        int i = 1;
        
        while (i <= n) {
        
            int max = 0;
            int maxid = 0;
        
            for (int j = 0; j < result.size(); j++){
            
                if (max <= numberOfWords[j]){
                
                    maxid = j;
                    max = numberOfWords[j];
                    numberOfWords[j] = 0;
                }
            }
            res += answerList.get(maxid) + " = " + max + " ";
            i++;
        }
        
        return res;  
    }
    
    public String Task5(String line, String l) {
    
        line = line.replaceAll("-", "");
        //List<String> answerLine = getList(line);
        List<String> answerLine = new ArrayList<String>();
        String pattern = l;
        
        mat = Pattern.compile("[a-z]*" + l + "[a-z]*").matcher(line);
        
        while (mat.find()){
            answerLine.add(text.substring(mat.start(), mat.end()));
        }
        
        return "" + (getList(text).size() - answerLine.size());
    }
    
    public String Task6(String line, int n){
    
        line = line.replaceAll("-", "");
        List<String> result = getList(line);
        int answerLine = 0;
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            Set<String> resLetters = new HashSet<>();
            
            for (int i = 0; i < letters.length(); i++){
                
                resLetters.add("" + letters.charAt(i));
            }
            if (resLetters.size() == n)
                answerLine++;
            //System.out.println(resLetters.size() + " " + letters + " " + resLetters);
        }
        return "" + answerLine;
    }
    
    public String Task7(List<String> result, int n){
    
        List<String> resLetters = new ArrayList<String>();
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            
            for (int i = 1; i < (letters.length() - 1); i++){
                
                resLetters.add("" + letters.charAt(i - 1) + letters.charAt(i) + letters.charAt(i + 1));
                //System.out.println("" + letters.charAt(i - 1) + letters.charAt(i) + letters.charAt(i + 1));
            }
        }
        
        return Task4(resLetters, n, 0);
    }
}
