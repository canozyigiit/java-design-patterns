
package behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("can", "can@gmail.com");
    }


    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("E-posta adresini giriniz: ");
                email = READER.readLine();
                System.out.print("Parolanızı giriniz: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Doğrulama işlemi başarılı.");
                } else {
                    System.out.println("Parola veya şifre yanlış!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paypal ile ödendi:  " + paymentAmount );
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
