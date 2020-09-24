/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crackingthecodeinterview;

/**
 *
 * @author Link
 */
public class URLify {
    public static void main(String[] args){
        System.out.println(urlify("Mr John Smith    ".toCharArray(), 13));
        System.out.println(urlify2("Mr John Smith    ".toCharArray(), 13));
    }
    
    public static char[] urlify(char[] str, int size){  //O(n^2)
        for(int i=size-1; i>=0; i--){
            if(str[i]==' '){
                for(int j=size-1; j>=i+1; j-=1){
                    str[j+2]=str[j];
                }
                str[i]='%';
                str[i+1]='2';
                str[i+2]='0';
                size+=2;
            }
        }
        return str;
    }
    
    public static char[] urlify2(char[] str, int size){
        int realSize = size;
        for(int i=0;i<size; i++){
            if(str[i]==' '){
                realSize+=2;
            }
            
        }
        int realIndex = realSize-1;
        int wordIndex = size-1;
        
        for(int i = wordIndex; i>=0; i--){
            if(str[i]==' '){
                str[realIndex]= '0';
                str[realIndex-1]='2'; 
                str[realIndex-2]= '%';  
                realIndex-=3;
            }else{
                str[realIndex] = str[i];
                realIndex--;
            }
        }
        
        return str;
    }
    
}