## Adapter,
Uyumsuz arabirimlere sahip nesnelerin işbirliği yapmasına izin veren yapısal bir tasarım modelidir.


### Sorun
Bir borsa izleme uygulaması oluşturduğunuzu hayal edin. Uygulama, stok verilerini birden çok kaynaktan XML biçiminde indirir ve ardından kullanıcı için güzel görünümlü çizelgeler ve diyagramlar görüntüler.

Bir noktada, akıllı bir 3. taraf analiz kitaplığı entegre ederek uygulamayı iyileştirmeye karar veriyorsunuz. Ancak bir sorun var: analiz kitaplığı yalnızca JSON biçimindeki verilerle çalışır.

Analitik kitaplığı ile entegrasyon öncesi uygulamanın yapısı
Verileri uygulamanızla uyumlu olmayan bir biçimde beklediğinden, analitik kitaplığını "olduğu gibi" kullanamazsınız.

Kütüphaneyi XML ile çalışacak şekilde değiştirebilirsiniz. Ancak bu, kitaplığa dayanan bazı mevcut kodları bozabilir. Daha da kötüsü, ilk etapta kütüphanenin kaynak koduna erişiminiz olmayabilir, bu da bu yaklaşımı imkansız hale getirir.

### Çözüm
Bir adaptör oluşturabilirsiniz . Bu, bir nesnenin arabirimini başka bir nesnenin anlayabilmesi için dönüştüren özel bir nesnedir.

Bir adaptör, sahne arkasında gerçekleşen dönüştürme karmaşıklığını gizlemek için nesnelerden birini sarar. Sarılmış nesne bağdaştırıcının farkında bile değil. Örneğin, metre ve kilometre cinsinden çalışan bir nesneyi, tüm verileri fit ve mil gibi İngiliz ölçü birimlerine dönüştüren bir adaptörle sarabilirsiniz.

Bağdaştırıcılar yalnızca verileri çeşitli biçimlere dönüştürmekle kalmaz, aynı zamanda farklı arabirimlere sahip nesnelerin işbirliği yapmasına da yardımcı olabilir. İşte nasıl çalıştığı:

Bağdaştırıcı, mevcut nesnelerden biriyle uyumlu bir arabirim alır.
Bu arabirimi kullanarak, var olan nesne, bağdaştırıcının yöntemlerini güvenle çağırabilir.
Bağdaştırıcı, bir çağrıyı aldıktan sonra, isteği ikinci nesneye iletir, ancak bu, ikinci nesnenin beklediği biçimde ve sıradadır.
Bazen aramaları her iki yönde de dönüştürebilen iki yönlü bir adaptör oluşturmak bile mümkündür.

Borsa uygulamamıza geri dönelim. Uyumsuz biçimler ikilemini çözmek için, kodunuzun doğrudan çalıştığı analitik kitaplığının her sınıfı için XML'den JSON'a bağdaştırıcılar oluşturabilirsiniz. Daha sonra kodunuzu kütüphane ile sadece bu adaptörler üzerinden iletişim kuracak şekilde ayarlarsınız. Bir bağdaştırıcı bir çağrı aldığında, gelen XML verilerini bir JSON yapısına çevirir ve çağrıyı, sarmalanmış bir analitik nesnesinin uygun yöntemlerine iletir.