/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author William Stainton
 */
public class Bird extends Animal {
    int colour;

    public Bird() {
        
    }
    
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Feather Colour: " + colour);
    }
    
}
