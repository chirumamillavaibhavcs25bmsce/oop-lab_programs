import java.util.Scanner;

abstract class Bank {

    abstract String getBankName();

    abstract double getInterestRate();

    double calculateEMI(double amount, int years) {
        return calculateEMI(amount, getInterestRate(), years);
    }

    double calculateEMI(double amount, double rate, int years) {
        int months = years * 12;
        double monthlyRate = rate / (12 * 100);

        double factor = Math.pow(1 + monthlyRate, months);

        return amount * monthlyRate * factor / (factor - 1);
    }

    double calculateHomeLoanInterest(double amount, int years) {
        return calculateHomeLoanInterest(amount, getInterestRate(), years);
    }

    double calculateHomeLoanInterest(double amount, double rate, int years) {
        double emi = calculateEMI(amount, rate, years);
        return (emi * years * 12) - amount;
    }
}

class SBI extends Bank {

    @Override
    String getBankName() {
        return "SBI";
    }

    @Override
    double getInterestRate() {
        return 8.50;
    }

    @Override
    double calculateHomeLoanInterest(double amount, int years) {
        return super.calculateHomeLoanInterest(amount, getInterestRate(), years);
    }
}

class HDFC extends Bank {

    @Override
    String getBankName() {
        return "HDFC";
    }

    @Override
    double getInterestRate() {
        return 8.75;
    }

    @Override
    double calculateHomeLoanInterest(double amount, int years) {
        return super.calculateHomeLoanInterest(amount, getInterestRate(), years);
    }
}

class ICICI extends Bank {

    @Override
    String getBankName() {
        return "ICICI";
    }

    @Override
    double getInterestRate() {
        return 9.00;
    }

    @Override
    double calculateHomeLoanInterest(double amount, int years) {
        return super.calculateHomeLoanInterest(amount, getInterestRate(), years);
    }
}

class Axis extends Bank {

    @Override
    String getBankName() {
        return "Axis Bank";
    }

    @Override
    double getInterestRate() {
        return 9.25;
    }

    @Override
    double calculateHomeLoanInterest(double amount, int years) {
        return super.calculateHomeLoanInterest(amount, getInterestRate(), years);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HOME LOAN INTEREST CALCULATOR =====");
        System.out.println("1. SBI");
        System.out.println("2. HDFC");
        System.out.println("3. ICICI");
        System.out.println("4. Axis Bank");

        System.out.print("Choose your bank: ");
        int choice = sc.nextInt();

        Bank bank;

        switch (choice) {
            case 1:
                bank = new SBI();
                break;

            case 2:
                bank = new HDFC();
                break;

            case 3:
                bank = new ICICI();
                break;

            case 4:
                bank = new Axis();
                break;

            default:
                System.out.println("Invalid bank choice.");
                sc.close();
                return;
        }

        System.out.print("Enter home loan amount (Rs.): ");
        double amount = sc.nextDouble();

        System.out.print("Enter repayment period (years): ");
        int years = sc.nextInt();

        if (amount <= 0 || years <= 0) {
            System.out.println("Loan amount and years must be positive.");
            sc.close();
            return;
        }

        double rate = bank.getInterestRate();
        double emi = bank.calculateEMI(amount, years);
        double interest = bank.calculateHomeLoanInterest(amount, years);
        double total = amount + interest;

        System.out.println("\n===== LOAN DETAILS =====");
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.printf("Annual Interest Rate: %.2f%%%n", rate);
        System.out.printf("Loan Amount: Rs. %.2f%n", amount);
        System.out.println("Repayment Period: " + years + " years");
        System.out.printf("Monthly EMI: Rs. %.2f%n", emi);
        System.out.printf("Total Interest: Rs. %.2f%n", interest);
        System.out.printf("Total Repayment: Rs. %.2f%n", total);

        sc.close();
    }
}