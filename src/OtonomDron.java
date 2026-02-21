public class OtonomDron extends Tasit implements OtonomSurus {
    public OtonomDron(String plaka,String model) {
        super(plaka,model);
    }

    @Override
    public void teslimataCik() {
        System.out.println("Otonom dron "+maksimum_otonom_hiz+" km/h ile yola çıktı...");
    }

    @Override
    public void rotayiHesapla() {
        System.out.println("Otonom dron rotayı hesapladı...");
    }
}
