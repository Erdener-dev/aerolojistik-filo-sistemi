import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("🚀 AeroLojistik Filo Yönetim Sistemi Başlatılıyor...");
        System.out.println("--------------------------------------------------");

        // 1. Kutuları Hazırla
        AkilliKonteyner<String> ozelKutu = new AkilliKonteyner<>("Gizli Şirket Evrakları");

        // 2. Araçları Üret
        Kamyonet kamyonet1 = new Kamyonet("34 LJT 123", "Ford Transit");
        OtonomDron dron1 = new OtonomDron("DRN-001", "DJI Matrice");
        SogukHavaKamyonu sogukKamyon = new SogukHavaKamyonu("35 SOGUK 99", "Volvo FH16");

        // 3. Filoyu Kur ve Otoparka Ekle
        ArrayList<Tasit> filo = new ArrayList<>();
        filo.add(kamyonet1);
        filo.add(dron1);
        filo.add(sogukKamyon);

        System.out.println("📦 Sistem Bilgisi: " + filo.size() + " aktif araç filoya kaydedildi.\n");

        // 4. Operasyonu Başlat
        System.out.println("🌍 --- TÜM ARAÇLAR GÖREVE ÇIKIYOR ---");
        for (Tasit arac : filo) {

            arac.teslimataCik();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("✅ Günlük operasyon başarıyla tamamlandı.");
    }
}