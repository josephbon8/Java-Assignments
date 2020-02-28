import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Birthdayt {

    public static void main(String[] args) {
        int totalCost=0;
        Toy chosenToy = null;
        boolean check = true;
        Scanner Sc = new Scanner(System.in);
        while (check) {
        //change scanner to dialog box
            String name = JOptionPane.showInputDialog("please enter the name of child");
//convert string input to int
            int age = Integer.parseInt(JOptionPane.showInputDialog("please enter the age of child"));
//change scanner to dialog box

            String toy_name = JOptionPane.showInputDialog("please choose a toy : a plushie, blocks or a book");

            chosenToy = new Toy(toy_name, age);

            if (!chosenToy.ageOK()) {
//change scanner to dialog box

               String temp = JOptionPane.showInputDialog("This toy is not appropriate for the child of this age. Do you want to cancel this toy? ");
                if (temp.equalsIgnoreCase("no")) {
                    check = false;
                } else {
                    check = true;
                    continue;
                }
            } else {
                check = false;
            }
            
            
            //change scanner to dialog box

            String temp4 = JOptionPane.showInputDialog("Would you like a card with the gift?");
//add cost of card
            chosenToy.addCard(temp4);
            //change scanner to dialog box

            String temp5 = JOptionPane.showInputDialog("Would you like a balloon with the gift?");
//add cost of ballon

            chosenToy.addBalloon(temp5);
//repeat to get next toy
            check=true;
//calculate total cost

            totalCost+=chosenToy.getCost();
//print toy details

            System.out.println("The gift for "+name +" "+chosenToy.toString());
            
            //ask if need another toy
            String temp6 = JOptionPane.showInputDialog("Do you want another toy?");
            if(temp6.equalsIgnoreCase("yes"))
                check=true;
            else
                check=false;

        }//repeat while if yes
//print total cost
        System.out.println("Total cost is "+totalCost);
        System.out.println("Order Id is "+(new Random()).nextInt(100000));
        System.out.println ("Programmer: Joseph Bonhomme");
        // TODO Auto-generated method stub
    }

}
