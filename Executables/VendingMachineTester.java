import java.util.Scanner;

public class VendingMachineTester {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        int result;

        while (true) {

            printMenu();

            Scanner sc = new Scanner(System.in);
            char number = sc.next().charAt(0);

            switch (number) {
                case '0':
                    System.out.println("A quarter is inserted!");
                    result = vm.Coin();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '1':
                    System.out.println("Small cup is selected!");
                    result = vm.SmallCup();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '2':
                    System.out.println("Large cup is selected!");
                    result = vm.LargeCup();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '3':
                    System.out.println("Sugar button is pressed!");
                    result = vm.Sugar();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '4':
                    System.out.println("Coffee button is pressed!");
                    result = vm.Coffee();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '5':
                    System.out.println("Insert large cups into the vending machine!");
                    System.out.println("Enter the number of cups");
                    int lp = sc.nextInt();
                    result = vm.InsertLargeCups(lp);
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '6':
                    System.out.println("Insert small cups into the vending machine!");
                    System.out.println("Enter the number of cups");
                    int sp = sc.nextInt();
                    result = vm.InsertSmallCups(sp);
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '7':
                    System.out.println("Set the new price of a cup of coffee");
                    System.out.println("Enter the price");
                    int p = sc.nextInt();
                    result = vm.SetPrice(p);
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '8':
                    System.out.println("Cancel selection for a cup of coffee");
                    result = vm.Cancel();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case '9':
                    System.out.println("Terminate the operation of the vending machine!");
                    result = vm.Dispose();
                    System.out.println("The value returned by the method is: " + result + "\n");
                    break;
                case 'a':
                    System.out.println("Show Value");
                    vm.showValue();
                    break;
                case 'b':
                    System.out.println("Show State");
                    vm.showState();
                    break;
                case 'q':
                    System.exit(0);
                default:
                    break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("==========Vending Machine Menu==========");

        System.out.println("0.  Coin()");
        System.out.println("1.  SmallCup()");
        System.out.println("2.  LargeCup()");
        System.out.println("3.  Sugar()");
        System.out.println("4.  Coffee()");
        System.out.println("5.  InsertLargeCups(int n)");
        System.out.println("6.  InsertSmallCups(int)");
        System.out.println("7.  SetPrice(int p)");
        System.out.println("8.  Cancel()");
        System.out.println("9.  Dispose()");

        System.out.print("\n\n");
        System.out.println("Testing-related methods");
        System.out.println("a.  show_variables()");
        System.out.println("b.  show_states()");
        System.out.println("q.  Quit\n");

    }

}
