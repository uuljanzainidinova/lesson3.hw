package com.company;

public class BankAccount {
   private double amount;
   private double sum;
   private int number;

    public double getAmount(){
        return amount;
    }


    public void deposit(double sum){
        setAmount(getAmount() + sum);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("На вашем счету недостаточно средств");
        }
        setAmount(getAmount() - sum);
    }
}
