## Command
Command , istekleri veya basit işlemleri nesnelere dönüştüren davranışsal tasarım kalıbıdır.

Dönüştürme, komutların ertelenmiş veya uzaktan yürütülmesine, komut geçmişinin saklanmasına vb. izin verir.

Bu örnekteki metin düzenleyici, bir kullanıcı onunla her etkileşim kurduğunda yeni komut nesneleri oluşturur. Eylemlerini yürüttükten sonra, geçmiş yığınına bir komut gönderilir.

Geri alma işlemini gerçekleştirmek için, uygulama geçmişten son yürütülen komutu alır ve ya ters bir eylem gerçekleştirir ya da bu komut tarafından kaydedilen düzenleyicinin geçmiş durumunu geri yükler.