## ProtoType,
Prototip , kodunuzu sınıflarına bağımlı hale getirmeden mevcut nesneleri kopyalamanıza izin veren yaratıcı bir tasarım kalıbıdır.

### Sorun
Diyelim ki bir nesneniz var ve onun tam bir kopyasını oluşturmak istiyorsunuz. Nasıl yapardın? İlk olarak, aynı sınıftan yeni bir nesne oluşturmalısınız. Ardından, orijinal nesnenin tüm alanlarını gözden geçirmeniz ve değerlerini yeni nesneye kopyalamanız gerekir.

Güzel! Ama bir yakalama var. Tüm nesneler bu şekilde kopyalanamaz, çünkü nesnenin bazı alanları özel olabilir ve nesnenin dışından görünmez olabilir.

Bir şeyleri “dışarıdan” kopyalarken ne yanlış gidebilir?”  genişlik=
Bir nesneyi “dışarıdan” kopyalamak her zaman mümkün değildir .

Doğrudan yaklaşımla ilgili bir sorun daha var. Bir kopya oluşturmak için nesnenin sınıfını bilmeniz gerektiğinden, kodunuz o sınıfa bağımlı hale gelir. Ekstra bağımlılık sizi korkutmuyorsa, başka bir yakalama var. Bazen yalnızca nesnenin izlediği arabirimi bilirsiniz, ancak somut sınıfını bilemezsiniz; örneğin, bir yöntemdeki bir parametre, bazı arabirimleri izleyen nesneleri kabul ettiğinde.

### Çözüm
Prototip deseni, klonlama işlemini klonlanan gerçek nesnelere devreder. Model, klonlamayı destekleyen tüm nesneler için ortak bir arabirim bildirir. Bu arabirim, kodunuzu o nesnenin sınıfına bağlamadan bir nesneyi klonlamanıza olanak tanır. Genellikle, böyle bir arabirim yalnızca tek bir cloneyöntem içerir .

cloneYöntemin uygulanması tüm sınıflarda çok benzerdir. Yöntem, geçerli sınıftan bir nesne oluşturur ve eski nesnenin tüm alan değerlerini yenisine taşır. Özel alanları bile kopyalayabilirsiniz çünkü çoğu programlama dili nesnelerin aynı sınıfa ait diğer nesnelerin özel alanlarına erişmesine izin verir.

Klonlamayı destekleyen bir nesneye prototip denir . Nesneleriniz düzinelerce alana ve yüzlerce olası konfigürasyona sahip olduğunda, bunları klonlamak alt sınıflamaya bir alternatif olarak hizmet edebilir.

Önceden oluşturulmuş prototipler
Önceden oluşturulmuş prototipler, alt sınıflamaya bir alternatif olabilir.

İşte nasıl çalışır: çeşitli şekillerde yapılandırılmış bir dizi nesne yaratırsınız. Konfigüre ettiğiniz gibi bir nesneye ihtiyacınız olduğunda, sıfırdan yeni bir nesne oluşturmak yerine bir prototipi klonlarsınız.