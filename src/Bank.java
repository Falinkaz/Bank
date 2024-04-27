import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String name = "Tony Stark";
        String accountType = "Savings";
        Double balance = 1599.99;
        int option = 0;


        System.out.println("***********************************");
        System.out.println("\nCustomer name: " + name);
        System.out.println("The account type is" + accountType);
        System.out.println("Your balance is " + "$"+ balance);
        System.out.println("\n***********************************");

        String menu = """
                *** Type the option number ***
                1 - Check balance
                2 - Withdraw
                3 - Deposit
                9 - Exit
                """;
        Scanner keyboard = new Scanner(System.in);
        while (option != 9){
            System.out.println(menu);
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.println("Your current balance is: $"+balance);
                    break;
                case 2:
                    System.out.println("Please enter amount to withdraw now:");
                    double withdrawal = keyboard.nextDouble();
                    if (balance < withdrawal){
                        System.out.println("Withdrawal can't be greater than balance");
                    }else{
                        balance = balance - withdrawal;
                        System.out.println("Updated balance is: $"+balance);
                    }
                    break;
                case 3:
                    System.out.println("Please enter amount to deposit now:");
                    double deposit = keyboard.nextDouble();
                    balance += deposit;
                    System.out.println("Updated balance is: $"+balance);
                    break;
                case 9:
                    System.out.println("Exiting program. Thanks for using Bank of 'Murica");
                    break;
                default:
                    System.out.println("Invalid option. Please try again");
            }
        }
    }
}
