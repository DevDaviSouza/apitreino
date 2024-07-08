package br.com.clink.apitreino.MethMethods;

public class IsNumeric {
    
    public boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}
