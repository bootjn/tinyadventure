package com.company;

import java.util.Scanner;

public class Chooseyourownadventure {

    public static void main(String[] args) {
	// write your code here // TODO code application logic here

        Scanner keyboard = new Scanner(System.in);
        String you, you2, you3, hallway, bedroom, cabinet,piano;


        System.out.println("WELCOME TO JUYEON'S TINY ADVENTURE!");
        System.out.print("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?"); //upstaaris
        you = keyboard.next();
        if (you.equals("kitchen"))
        {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            //you = "";
            you2 = keyboard.next();
            if (you2.equals("refrigerator"))
            {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                you3 = keyboard.next();
                if (you3.equals("no"))
                {
                    System.out.println("You die of starvation... eventually.");
                }
                else
                {
                    System.out.println("delicious? how's taste? give me some");
                }
            }
            else
            {
                System.out.println("cabinet is locked. break it? yes no");
                cabinet = keyboard.next();
                if (cabinet.equals("yes"))
                    System.out.print("you found tuna kitty can & old manga. congratulation~");
                else
                    System.out.print("im learning if else selection statements. quiet. pls leave me alone..");
            }
        }
        else
        {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  there's piano room. Where would you like\n" +
                    "to go?"); //upsstairs

            hallway = keyboard.next();
            if (hallway.equals("bedroom"))//;
            {
                System.out.println("welcome to my room~. would ou clean my room? yes or no");
                bedroom = keyboard.next();
                if(bedroom.equals("yes"))
                    System.out.print("thanks you. here's a little treasure for you, cute sanrio tamagotchi!! isn't it cute?! meow =(^^)=");
                else
                    System.out.print("why not?! you might find any treasure soon");
            }
            else if (hallway.equals("bathroom"))// (hallway.equals()) if else
            {
                System.out.println("where are you goin?! im getting tired");
            }
            else
            {
                System.out.println("play piano?");
                piano = keyboard.next();//net
                if(piano.equals("yes")){
                    System.out.println("good job. i like it. nice sooting melody");
                }
                else
                {
                    System.out.println("good bye pumpkin. like you, i didnt like practicing piano");//practice
                }
            }
        }

    }
}
