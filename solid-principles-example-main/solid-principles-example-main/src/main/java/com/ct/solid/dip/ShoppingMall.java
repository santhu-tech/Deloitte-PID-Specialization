package com.ct.solid.dip;

public class ShoppingMall {

//    private DebitCard debitcard;
//
//    public ShoppingMall(DebitCard debitcard) {
//        this.debitcard = debitcard;
//    }
//    public void doPurchaseSomething(long amount){
//        debitcard.doTransaction(amount);
//    }
//    public static void main(String[] args) {
//        DebitCard debitCard = new DebitCard();
//        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
//        ShoppingMall.doTranscation(5000);
//    }

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();

        BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
