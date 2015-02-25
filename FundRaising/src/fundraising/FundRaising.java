

package fundraising;
import javax.swing.*;
/**
 * @title FundRaising
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 25-Feb-2015 3:05:13 PM
 * @purpose The purpose of this program is to
 */
public class FundRaising {

    public static void main(String[] args) {
        double central[]=new double[4],cross[]=new double[4],paul[]=new double[4],teresa[]=new double[4],mundi[]=new double[4],joseph[]=new double[4],mary[]=new double[4],thomas[]=new double[4];
        int school = 0,test,amount = 0,pop;
        double schools[][]={central,cross,paul,teresa,mundi,joseph,mary,thomas};//split declaration to make coding easier and more debugablem easier to see which school is which.
        do {
            test=0;
        
            try {
            school=Integer.parseInt(JOptionPane.showInputDialog("Which school is doing fundraising?\n 0 - Catholic Central\n1 - Holy Cross\n2 - John Paul II\n3 - Mother Teresa\n4 - Regina Mundi\n5 - St.Joseph\n6 - St.Mary\n7 - St.Thomas Aquinas\n8 - EXIT"));
            if (school==8) {
                System.exit(1);
            }
        } catch(NumberFormatException e) {
            test=1;
        }
        }  while (test==1);
        do {
            test=0;
        
            try {
            amount=Integer.parseInt(JOptionPane.showInputDialog("What is the donation amount?\n0 - 25 cents\n1 - 50 cents\n2 - 1 dollar\n3 - 2 dollars\n4 - EXIT"));
            if (amount==4) {
                System.exit(2);
            }
        } catch(NumberFormatException e) {
            test=1;
        }
        }  while (test==1);
        pop=Integer.parseInt(JOptionPane.showInputDialog("What is the school population?"));
        schools[school][amount]=pop*amountConvert(amount);
        
        System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "","CathCen","Holy C","JP II","MotherT","ReginaM","St.Joe","St.Mary","St.Thom","Total");        
        System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$0.25",schools[0][0],schools[1][0],schools[2][0],schools[3][0],schools[4][0],schools[5][0],schools[6][0],schools[7][0],schools[0][0]+schools[1][0]+schools[2][0]+schools[3][0]+schools[4][0]+schools[5][0]+schools[6][0]+schools[7][0]);
        System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$0.50",schools[0][1],schools[1][1],schools[2][1],schools[3][1],schools[4][1],schools[5][1],schools[6][1],schools[7][1],schools[0][1]+schools[1][1]+schools[2][1]+schools[3][1]+schools[4][1]+schools[5][1]+schools[6][1]+schools[7][1]);
        System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "$1.00");
        System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",);
        
        
        
    }
    public static double amountConvert(int amount) {
        double value = 0;
        if (amount==0) {
            value=0.25;
        } else if (amount==1) {
            value=0.5;
        } else if (amount==2) {
            value=1;
        } else if (amount==3) {
            value=2;
        } else {
            JOptionPane.showMessageDialog(null,"Invalid option for donation amount.");
            System.exit(3);
        }
        return value;
        
        
        
        
      
        
    }
}
