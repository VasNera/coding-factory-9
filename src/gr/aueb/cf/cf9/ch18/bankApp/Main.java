package gr.aueb.cf.cf9.ch18.bankApp;


import gr.aueb.cf.cf9.ch18.bankApp.controller.AccountController;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankApp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18.bankApp.dao.AccountDAOImpl;
import gr.aueb.cf.cf9.ch18.bankApp.dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18.bankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankApp.service.AccountServiceImpl;
import gr.aueb.cf.cf9.ch18.bankApp.service.IAccountService;

import java.math.BigDecimal;

import java.util.List;
import java.util.Scanner;

public class Main {

    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static AccountController accountController = new AccountController(accountService);
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        String iban;

        while (true){
            printMenu();
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1" -> {
                        System.out.println("Παρακαλώ εισάγετε το iban. ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το υπόλοιπο. ");
                        BigDecimal balance = new BigDecimal(scanner.nextLine().trim());


                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("Ο λογαριασμός δημιουργήθηκε(ανανεώθηκε) επιτυχώς με iban: " +
                                readOnlyDTO.iban() + " υπόλοιπο" + readOnlyDTO.balance());

                    }
                    case "2" -> {

                        System.out.println("Παρακαλώ εισάγετε το iban. ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό κατάαθεσης. ");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine().trim());


                        accountController.deposit(iban, depositAmount);
                        System.out.println("Επιτυχής κατάθεση: " + depositAmount + ", Υπόλοιπο " + accountController.getBalance(iban));


                    }

                    case "3" -> {

                        System.out.print("Παρακαλώ εισάγετε το iban. ");
                        iban = scanner.nextLine().trim();
                        System.out.print("Παρακαλώ εισάγετε το ποσό ανάληψης ");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine().trim());


                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("Επιτυχής ανάληψη: " + withdrawAmount + ", Υπόλοιπο " + accountController.getBalance(iban));


                    }

                    case "4" -> {
                        System.out.print("Παρακαλώ εισάγετε το iban:");

                    iban = scanner.nextLine().trim();

                    BigDecimal balance = accountController.getBalance(iban);
                    System.out.println("Yπόλοιπο: " + balance);
                }

                case "5" -> {
                        List<AccountReadOnlyDTO> readOnlyDTOS = accountController.getAllAccounts();

                        if (readOnlyDTOS.isEmpty()){
                            System.out.println("Δεν βρέθηκαν λογαριασμοί.");
                        }else {
                            readOnlyDTOS.forEach(System.out::println);
                        }


                }
                case "6" -> {
                    System.out.println("Έξοδος ");
                    scanner.close();
                    return;

                }
                    default -> System.out.println("Μη έγκυρη επιλογή. ");

                }



            }catch (AccountNotFoundException e) {
                System.out.println("Ο λογαριασμός δεν βρέθηκε.");

            }catch (NumberFormatException e){
                System.out.println(" Μη έγκυρη μορφή αριθμού. ");
            }
            catch (ValidationException e){
                System.out.println("Λάθος δτην επαλήθευση. " + e.getMessage());
            }
            catch (InsufficientBalanceException e) {
                System.out.println("Ανεπαρκές υπόλοιπο. ");
            }

            }
        }




    private static void printMenu(){
        System.out.println("Υπηρεσία Bank App ===");

        System.out.println("1. Δημιουργία ή Ενημέρωση Λογαριασμού.");
        System.out.println("2. Κατάθεση. ");
        System.out.println("3. Ανάληψη. ");
        System.out.println("4. Ερώτηση υπολοίπου. ");
        System.out.println("5. Εκτύπωση όλων των λογαριασμών. ");
        System.out.println("6. Έξοδος. ");
        System.out.println(" Εισάγετε μία επιλογή. ");
    }
}
