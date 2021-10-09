## Chain of Responsibility

Chain of Responsibility, potansiyel işleyicilerden biri talebi işleyene kadar talebin potansiyel işleyiciler zinciri boyunca iletilmesine izin veren davranışsal tasarım modelidir.

Model, gönderici sınıfını alıcıların somut sınıflarına bağlamadan birden çok nesnenin isteği işlemesine izin verir. Zincir, standart bir işleyici arabirimini izleyen herhangi bir işleyici ile çalışma zamanında dinamik olarak oluşturulabilir.

Bu örnek, kullanıcı verilerini içeren bir isteğin, kimlik doğrulama, yetkilendirme ve doğrulama gibi çeşitli şeyleri gerçekleştiren sıralı bir işleyici zincirini nasıl geçtiğini gösterir.

Bu örnek, çeşitli yazarlar tarafından verilen kalıbın kanonik versiyonundan biraz farklıdır. Desen örneklerinin çoğu, doğru işleyiciyi arama, başlatma ve bundan sonra zincirden çıkma fikri üzerine kuruludur. Ancak burada , bir isteği yerine getiremeyecek olana kadar her işleyiciyi yürütürüz .