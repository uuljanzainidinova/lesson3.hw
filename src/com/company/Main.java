package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
	    BankAccount bankAccount =new BankAccount();
	    bankAccount.deposit(20000);
	    while (true){
	        try {
                bankAccount.withDraw(6000);
                if (bankAccount.getAmount() < 6000){
                    bankAccount.withDraw((int) bankAccount.getAmount());
                }
                if (bankAccount.getAmount() == 0){
                    break;
                }
                System.out.println(bankAccount.getAmount());
            }catch (LimitException limitException){
	            limitException.printStackTrace();
            }
        }
        System.out.println(bankAccount.getAmount());
    }
}
