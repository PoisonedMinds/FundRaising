package fundraising;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @title FundRaising
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 25-Feb-2015 3:05:13 PM
 * @purpose The purpose of this program is to calculate the funds raised
 * throughout a schoolboard
 */
public class FundRaising {

    public static void main(String[] args) {
        double central[] = new double[4], cross[] = new double[4],
                paul[] = new double[4], teresa[] = new double[4],
                mundi[] = new double[4], joseph[] = new double[4],
                mary[] = new double[4], thomas[] = new double[4];//define varibles
        int school = 0, test, amount = 0, pop, retry;
        double schools[][] = {central, cross, paul, teresa, mundi, joseph,
            mary, thomas};//create 2d array

        do {
            do {
                test = 0;

                try {
                    school = Integer.parseInt(JOptionPane.showInputDialog("Whi"
                            + "ch school is doing fundraising?\n 0 - Catholic "
                            + "Central\n1 - Holy Cross\n2 - John Paul II\n3 - M"
                            + "other Teresa\n4 - Regina Mundi\n5 - St.Joseph\n6"
                            + " - St.Mary\n7 - St.Thomas Aquinas\n8 - EXIT"));//ask user for input
                    if (school == 8) {
                        System.exit(1);// exit if the user chooses so
                    }
                } catch (NumberFormatException e) {// catch eror for incorrect user input
                    test = 1;
                }
            } while (test == 1);
            do {
                test = 0;

                try {
                    amount = Integer.parseInt(JOptionPane.showInputDialog("Wha"
                            + "t is the donation amount?\n0 - 25 cents\n1 - 50"
                            + " cents\n2 - 1 dollar\n3 - 2 dollars\n4 - EXIT"));//get user input again
                    if (amount == 4) {
                        System.exit(2);
                    }
                } catch (NumberFormatException e) {//catch error
                    test = 1;
                }
            } while (test == 1);
            pop = Integer.parseInt(JOptionPane.showInputDialog("What is the "
                    + "school population?"));//get school pop
            schools[school][amount] = pop * amountConvert(amount);//set values in array based on info given

            //output data
            System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "", "CathCen", "Holy C", "JP II", "MotherT", "ReginaM", "St.Joe", "St.Mary", "St.Thom", "Total");
            System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$0.25", schools[0][0], schools[1][0], schools[2][0], schools[3][0], schools[4][0], schools[5][0], schools[6][0], schools[7][0], schools[0][0] + schools[1][0] + schools[2][0] + schools[3][0] + schools[4][0] + schools[5][0] + schools[6][0] + schools[7][0]);
            System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$0.50", schools[0][1], schools[1][1], schools[2][1], schools[3][1], schools[4][1], schools[5][1], schools[6][1], schools[7][1], schools[0][1] + schools[1][1] + schools[2][1] + schools[3][1] + schools[4][1] + schools[5][1] + schools[6][1] + schools[7][1]);
            System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$1.00", schools[0][2], schools[1][2], schools[2][2], schools[3][2], schools[4][2], schools[5][2], schools[6][2], schools[7][2], schools[0][2] + schools[1][2] + schools[2][2] + schools[3][2] + schools[4][2] + schools[5][2] + schools[6][2] + schools[7][2]);
            System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$2.00", schools[0][3], schools[1][3], schools[2][3], schools[3][3], schools[4][3], schools[5][3], schools[6][3], schools[7][3], schools[0][3] + schools[1][3] + schools[2][3] + schools[3][3] + schools[4][3] + schools[5][3] + schools[6][3] + schools[7][3]);
            System.out.println("Total: $" + total(schools));
            try {
                Thread.sleep(1000);//wait so user can view data
            } catch (InterruptedException ex) {
                Logger.getLogger(FundRaising.class.getName()).log(Level.SEVERE, null, ex);
            }//ask user if they want to continue or exit
            retry = Integer.parseInt(JOptionPane.showInputDialog("Input 1 to add information for another school, a different fundraising compaing for a school, or to make a correction to an existing fundraiser(there can only be 4 different fundraisers, one of each)"));
        } while (retry == 1);
    }

    public static double amountConvert(int amount) {//method that converts a number to a different number
        double value = 0;
        if (amount == 0) {
            value = 0.25;
        } else if (amount == 1) {
            value = 0.5;
        } else if (amount == 2) {
            value = 1;
        } else if (amount == 3) {
            value = 2;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid option for donation amount.");
            System.exit(3);
        }
        return value;

    }

    private static double total(double schools[][]) {//totals the amount in a 2d array
        double total = 0;
        for (double[] school : schools) {
            for (double amount : school) {
                total = total + amount;
            }
        }

        return total;
    }
}
