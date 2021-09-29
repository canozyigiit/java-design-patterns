## Singleton ,
Instance genel bir erişim noktası sağlarken bir sınıfın yalnızca bir instance sahip olmasını sağlamanıza olanak tanıyan yaratıcı bir tasarım modelidir.

### Sorun
Singleton modeli, Tek Sorumluluk İlkesini ihlal ederek aynı anda iki sorunu çözer :

Bir sınıfın yalnızca tek bir örneğe sahip olduğundan emin olun . Neden biri bir sınıfın kaç örneği olduğunu kontrol etmek istesin ki? Bunun en yaygın nedeni, bir veritabanı veya dosya gibi bazı paylaşılan kaynaklara erişimi kontrol etmektir.

İşte nasıl çalışıyor: Bir nesne yarattığınızı, ancak bir süre sonra yeni bir tane oluşturmaya karar verdiğinizi hayal edin. Yeni bir nesne almak yerine, önceden oluşturduğunuz nesneyi alırsınız.

Bir kurucu çağrısının tasarım gereği her zaman yeni bir nesne döndürmesi gerektiğinden , bu davranışın normal bir kurucu ile uygulanmasının imkansız olduğunu unutmayın .

Bir nesneye küresel erişim
Müşteriler, her zaman aynı nesneyle çalıştıklarını bile fark etmeyebilirler.

Bu örneğe genel bir erişim noktası sağlayın . Sizin (pekala, ben) bazı temel nesneleri saklamak için kullandığınız global değişkenleri hatırlıyor musunuz? Çok kullanışlı olsalar da, herhangi bir kod potansiyel olarak bu değişkenlerin içeriğinin üzerine yazabileceği ve uygulamayı çökertebileceği için çok güvensizdirler.

Global bir değişken gibi, Singleton deseni de programdaki herhangi bir yerden bazı nesnelere erişmenizi sağlar. Ancak, bu örneğin üzerine başka bir kod tarafından yazılmasını da önler.

Bu sorunun başka bir yanı daha var: 1. sorunu çözen kodun programınızın her yerine dağılmasını istemiyorsunuz. Özellikle kodunuzun geri kalanı zaten buna bağlıysa, bir sınıfta olması çok daha iyidir.

Günümüzde, Singleton modeli o kadar popüler hale geldi ki , listelenen sorunlardan sadece birini çözse bile insanlar bir şeye singleton diyebilir .

### Çözüm
Singleton'ın tüm uygulamaları şu iki adıma sahiptir:

Diğer nesnelerin newişleci Singleton sınıfıyla kullanmasını önlemek için varsayılan oluşturucuyu özel yapın .
Yapıcı görevi gören statik bir oluşturma yöntemi oluşturun. Kaputun altında, bu yöntem özel kurucuyu bir nesne oluşturmaya çağırır ve onu statik bir alana kaydeder. Bu yönteme yapılan aşağıdaki tüm çağrılar, önbelleğe alınmış nesneyi döndürür.
Kodunuzun Singleton sınıfına erişimi varsa, Singleton'ın statik yöntemini çağırabilir. Bu nedenle, bu yöntem her çağrıldığında, her zaman aynı nesne döndürülür.