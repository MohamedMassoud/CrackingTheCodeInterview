/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crackingthecodeinterview;

import com.google.common.primitives.Chars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Link
 */
public class IsUnique {
    public static void main(String[] args){
        
        System.out.println(isUnique("MAMAMIA"));
        System.out.println(isUnique("Hi"));
        
    }
    
    static boolean isUnique(String str){    // n
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : str.toCharArray()){
            try{
            map.put(i, map.get(i)+1);
            }catch(Exception NullPointerException){
                map.put(i, 1);
            }
        }
        for(char x: map.keySet())if(map.get(x)>1)return false;
        
        return true;
    }
    
    
    static boolean isUnique2(String str){           // nLogn 
        List<Character> list = Chars.asList(str.toCharArray());
        Collections.sort(list);
        for(int i=0; i<list.size()-1; i++){
            if (list.get(i)==list.get(i+1))return false;
        }
        return true;
    }
}
