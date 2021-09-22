/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings_vassiljev;

import java.util.Scanner;


public class Strings_Vassiljev {
    public static void main(String[] args) {
        int x=0;
        String abc="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        //String text ="Съешь ещё этих французских булок и галет,да выпей же чаю с молоком, как и я.";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String text =scanner.nextLine();
        char[] texts=text.toCharArray();
        char[] abcs=abc.toCharArray();
        //System.out.print(texts);
        for(int i =0; i<abcs.length;i++){
            for(int j=0;j<texts.length;j++){
                if(abcs[i]==texts[j]) {
                    x++;
                    break;
                }           
            }
        }
        //System.out.print(x);
        int z =33;
        z-=x;
        
        if(x==33){
            System.out.println("Это панграмма");
   
        }
        else{
            System.out.println("Это не панграмма. Не хватает "+z+" букв");
        }
    }
}
 
        
        

        
        
    
    
    

