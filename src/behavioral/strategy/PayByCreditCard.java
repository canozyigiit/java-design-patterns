package behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;


    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Kart numaranızı giriniz: ");
            String number = READER.readLine();
            System.out.print("Son kullanma tarihini giriniz 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("CVV kodunu giriniz: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);



        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Kredi kartı ile ödendi:  " + paymentAmount);
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
