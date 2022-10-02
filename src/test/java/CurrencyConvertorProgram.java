import java.util.Scanner;

public class CurrencyConvertorProgram {
    public static void main(String[] args) {
        double usageValue = 0.0;

        int maxTries = 0;
        int maxTries1 = 0;
        double amount = 0.0;
        Boolean startOver = true;
        int inputSessions=-1;

        System.out.println("Welcome to Currency Convertor");
        while (startOver == true) {
            introduce();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            for (int i = 0; choice != 1 && choice != 2 && i <= 5; i++) {
                System.out.println("Wrong Selection- Please Try Again");
                introduce();
                Scanner sc_ = new Scanner(System.in);
                choice = sc_.nextInt();
                maxTries++;
            }

            if (maxTries < 5) {
                while (maxTries1 < 5 && amount <= 0.0) {
                    System.out.println("Please enter an amount to convert");
                    Scanner sc1 = new Scanner(System.in);
                    try {
                        amount = sc1.nextDouble();
                        if (amount < 0) {
                            System.out.println("Illegal value - please enter positive number");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Illegal value - please enter positive number");
                        maxTries1++;
                    }
                }
            }
            if (choice != 1 && choice != 2 || maxTries1 == 5) {
                System.out.println("too many tries");
            }
            if (choice == 2) {
                Coin ilsValue = CoinFactory.getCoinInstance(Coins.ILS);
                Coin ils = new ILS() {
                    @Override
                    public double calculate(double ilsInput) {
                        return super.calculate(ilsInput);
                    }
                };
                double value = ils.calculate(amount);
                ResultsScreen result = new ResultsScreen();
                inputSessions++;
                result.resultsScreen(value,inputSessions);
                //System.out.println(value);
            }
            if (choice == 1) {
                Coin usdValue = CoinFactory.getCoinInstance(Coins.USD);
                Coin usd = new USD() {
                    @Override
                    public double calculate(double usdInput) {
                        return super.calculate(usdInput);
                    }
                };
                double value = usd.calculate(amount);
                ResultsScreen result = new ResultsScreen();
                inputSessions++;
                result.resultsScreen(value,inputSessions);

                //System.out.println(value);

            }

            System.out.println("start over Y/N");
            Scanner so = new Scanner(System.in);

            try {
                String again = so.next();
                if (again.equalsIgnoreCase("Y") | again.equalsIgnoreCase("N")) {
                    if (again.equalsIgnoreCase("Y")) {
                    startOver = true;
                    maxTries =0;
                    maxTries1 = 0;
                    amount = 0.0;
                } else {
                    startOver = false;
                    EndScreen endScreen = new EndScreen();
                    ResultsScreen resultList = new ResultsScreen();
                    endScreen.endScreen(resultList.getResultList());

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Illegal selection - please enter 'Y' (yes) Or 'N' (no)");
            }


        }
    }







    private static void introduce(){

        System.out.println("Please Choose an option (1/2)");
        System.out.println("1.Dollars to Shekels");
        System.out.println("2.Shekels to Dollars");

    }
}

