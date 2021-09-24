/*
Программа просит ввести строку и выводит ее наоборот
 */
package perevertysh;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Perevertysh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //переворачивание вар 1
        //System.out.println("str = "+str);
        char[] charStr = str.toCharArray();//преобразование строки в массив
        //System.out.println("charStr = "+Arrays.toString(charStr));
        char[] newCharStr = new char[charStr.length];// пустой массив с тем же кол-вом ячеек
        //System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        
        for (int i = 0; i<charStr.length; i++){
            newCharStr[(charStr.length-1)-i]=charStr[i];
        }
        //System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        String str2 = new String(newCharStr);//преобразование из массива в строку
        System.out.println("Строка наоборот = "+str2);
        
        System.out.println("");
        //вар2
        StringBuilder string = new StringBuilder(str);
        System.out.println("Строка наоборот: "+string.reverse().toString());        
        
        
        
        
        
        
        
        
        
        
    }
    
}
