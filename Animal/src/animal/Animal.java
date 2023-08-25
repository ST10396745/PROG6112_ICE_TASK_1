/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author William Stainton
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        int IDtag;
//        String species;
//        
//        Bird brd = new Bird(Integer.parseInt(JOptionPane.showInputDialog("1=grey, 2=white, 3=black")));
//        Reptile rept = new Reptile(Double.parseDouble(JOptionPane.showInputDialog("Please enter the blood temp")));
//        
//    }
    
    int IDtag;
    String species;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Reptile reptile = new Reptile();

        System.out.println("Input details for Animal:");
        animal.input();

        System.out.println("\nInput details for Bird:");
        bird.input();

        System.out.println("\nInput details for Reptile:");
        reptile.input();

        System.out.println("\nAnimal Details:");
        animal.output();

        System.out.println("\nBird Details:");
        bird.output();

        System.out.println("\nReptile Details:");
        reptile.output();
    }
    
}
