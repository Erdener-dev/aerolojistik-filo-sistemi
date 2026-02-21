import java.sql.SQLOutput;

public class SogukHavaKamyonu extends Tasit implements SogutmaSistemi {

    public SogukHavaKamyonu(String plaka,String model) {
        super(plaka,model);

    }

    @Override
    public void teslimataCik() {
        System.out.println("Soğuk hava kamyonu teslimata çıktı...");
    }

    @Override
    public void dereceyiAyarla() {
        System.out.println("Soğuk hava kamyonunun derecesi ayarlandı...");
    }
}
