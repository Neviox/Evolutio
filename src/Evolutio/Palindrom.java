package Evolutio;

import java.util.Scanner;

public class Palindrom {

    public void palindromMethod(){
        Scanner reset = new Scanner(System.in);
        System.out.println("Unesite test za palindrom:");
        String str = reset.nextLine();
        int strLength = str.length();
        String str2 = "",noviString="";


        for (int i = (strLength - 1); i >=0; --i) {
            char temp=str.charAt(i);
            if(Character.isLetter(temp)) {
                str2 = str2 + temp;
            }
        }
        for (int i = 0; i<strLength; ++i) {
            char temp=str.charAt(i);
            if(Character.isLetter(temp)) {
                noviString = noviString + temp;
            }
        }

        if (str2.toLowerCase().equals(noviString.toLowerCase())) {
            System.out.println(str + " je palindrom.");
        }
        else {
            System.out.println(str + " nije palindrom.");
        }
    }
}
