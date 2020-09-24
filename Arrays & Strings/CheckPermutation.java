/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crackingthecodeinterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Link
 */
public class CheckPermutation {
    
   public static void main(String[] args){
       System.out.println(isPermutations("Hu", "uH"));
   }
    
   
   
   public static boolean isPermutations(String str1, String str2){
       char[] charArr1 = str1.toCharArray();
       char[] charArr2 = str2.toCharArray();
       if(charArr1.length!=charArr2.length)return false;
       Arrays.sort(charArr1);
       Arrays.sort(charArr2);
       for(int i=0; i<charArr1.length; i++){
           if(charArr1[i]!=charArr2[i])return false;
       }
       return true;
   }
   
   
   public static List<Integer> getit(){

        return Arrays.asList(1,2);
   }
}

