package programme12;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol
public class AlphanumSym {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter any character:  ");
        char ch = num.next().charAt(0);
        if((ch>='a'&& ch<='z' )|| (ch>='A' && ch<= 'Z')){
            System.out.println(ch + "  is a Alphabet");
        } else if ( ch>='0' && ch<= '9'){
            System.out.println( ch + "   is a number");
        }else{
            System.out.println(ch + "  is a symbol");
        }

    }
}
