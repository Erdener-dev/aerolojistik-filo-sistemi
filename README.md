# aerolojistik-filo-sistemi

🚀 AeroLojistik: Yeni Nesil Akıllı Filo Sistemi
Bu proje, Java'da Nesne Yönelimli Programlama (OOP) prensiplerini ve ileri seviye mimari yapıları kullanarak geliştirilmiş bir lojistik yönetim simülasyonudur. Sistem; kara ve hava araçlarının, otonom sistemlerin ve tip-güvenli (type-safe) kargo konteynerlerinin yönetimini sağlar.

🏗️ Kullanılan Teknolojiler ve Mimari Yaklaşımlar
Proje geliştirilirken aşağıdaki temel yazılım mühendisliği prensipleri uygulanmıştır:

Soyutlama (Abstraction): Tasit sınıfı abstract olarak tanımlanarak, tüm araçlar için zorunlu olan bir temel iskelet oluşturulmuştur.

Çok Biçimlilik (Polymorphism): Farklı araç tipleri (Kamyonet, Dron, Soğuk Hava Kamyonu) tek bir ArrayList<Tasit> içerisinde yönetilerek "Geç Bağlama" (Late Binding) yeteneği sergilenmiştir.

Arayüzler (Interfaces): Araçlara özel yetenekler (OtonomSurus, SogutmaSistemi) arayüzler aracılığıyla eklenerek esnek bir yapı kurulmuştur.

Jenerikler (Generics - <T>): AkilliKonteyner<T> sınıfı ile her türlü verinin tip güvenliği korunarak taşınması sağlanmıştır.

Kapsülleme (Encapsulation): Veri güvenliği için private erişim belirleyicileri ve Constructor yapıları titizlikle kullanılmıştır.

📁 Proje Yapısı
Tasit: Soyut ata sınıf (Base Class).

Kamyonet, OtonomDron, SogukHavaKamyonu: Somut araç sınıfları.

AkilliKonteyner<T>: Esnek kargo yönetim sınıfı.

OtonomSurus, SogutmaSistemi: Yetenek arayüzleri.

Main: Sistemin test edildiği ve operasyonun başlatıldığı merkez.

🚀 Nasıl Çalıştırılır?
Bu depoyu klonlayın.

Main.java dosyasını bir Java IDE'sinde (IntelliJ, Eclipse veya VS Code) çalıştırın.

Konsol üzerinden araçların teslimat operasyonlarını ve sistem loglarını takip edin.
