## Builder,
Builder , karmaşık nesneleri adım adım oluşturmanıza olanak tanıyan yaratıcı bir tasarım modelidir. Model, aynı yapı kodunu kullanarak bir nesnenin farklı türlerini ve temsillerini üretmenize olanak tanır.

### Sorun
Birçok alanın ve iç içe nesnelerin zahmetli, adım adım başlatılmasını gerektiren karmaşık bir nesne hayal edin. Bu tür başlatma kodu genellikle çok sayıda parametre içeren canavarca bir kurucunun içine gömülür. Veya daha da kötüsü: istemci kodunun her yerine dağılmış durumda.

Çok sayıda alt sınıf başka bir sorun yaratır
Bir nesnenin olası her konfigürasyonu için bir alt sınıf oluşturarak programı çok karmaşık hale getirebilirsiniz.

Örneğin, bir Housenesnenin nasıl oluşturulacağını düşünelim . Basit bir ev inşa etmek için dört duvar ve bir zemin inşa etmeniz, bir kapı takmanız, bir çift pencere takmanız ve bir çatı inşa etmeniz gerekir. Ama ya arka bahçesi ve diğer güzellikleri (ısıtma sistemi, sıhhi tesisat ve elektrik tesisatı gibi) olan daha büyük, daha aydınlık bir ev istiyorsanız?

En basit çözüm, temel Housesınıfı genişletmek ve tüm parametre kombinasyonlarını kapsayacak bir dizi alt sınıf oluşturmaktır. Ama sonunda önemli sayıda alt sınıfa sahip olacaksınız. Sundurma stili gibi herhangi bir yeni parametre, bu hiyerarşiyi daha da büyütmeyi gerektirecektir.

Üreme alt sınıflarını içermeyen başka bir yaklaşım daha var. HouseEv nesnesini kontrol eden tüm olası parametrelerle doğrudan temel sınıfta dev bir kurucu oluşturabilirsiniz . Bu yaklaşım aslında alt sınıflara olan ihtiyacı ortadan kaldırırken, başka bir sorun yaratır.

teleskopik yapıcı
Çok sayıda parametreye sahip kurucunun dezavantajı vardır: tüm parametrelere her zaman ihtiyaç duyulmaz.

Çoğu durumda, parametrelerin çoğu kullanılmayacak ve bu da yapıcının oldukça çirkin çağrılar yapmasına neden olacaktır . Örneğin, evlerin sadece bir kısmında yüzme havuzu var, bu nedenle yüzme havuzlarıyla ilgili parametreler onda dokuzunda yararsız olacaktır.

### Çözüm
Oluşturucu desen sen kendi sınıfının dışında nesne inşaat kodunu elde çağrısında ayrı nesneler taşımak önerir inşaatçılar .

Oluşturucu desenini uygulama
Oluşturucu deseni, adım adım karmaşık nesneler oluşturmanıza olanak tanır. Oluşturucu, ürün oluşturulurken diğer nesnelerin ürüne erişmesine izin vermez.

Model, nesne yapımını bir dizi adım ( buildWalls, buildDoor, vb.) halinde düzenler . Bir nesne oluşturmak için, bir oluşturucu nesnesinde bu adımların bir dizisini uygularsınız. Önemli olan kısım, tüm adımları çağırmanıza gerek olmamasıdır. Yalnızca bir nesnenin belirli bir konfigürasyonunu üretmek için gerekli olan adımları çağırabilirsiniz.

Ürünün çeşitli temsillerini oluşturmanız gerektiğinde, yapım adımlarından bazıları farklı uygulama gerektirebilir. Örneğin, bir kulübenin duvarları ahşap olabilir, ancak kale duvarları taştan yapılmalıdır.

Bu durumda, aynı oluşturma adımlarını farklı bir şekilde uygulayan birkaç farklı oluşturucu sınıfı oluşturabilirsiniz. Daha sonra, farklı türde nesneler üretmek için bu inşaatçıları inşaat sürecinde kullanabilirsiniz (yani, inşaat adımlarına yönelik sıralı bir çağrı seti).


Farklı inşaatçılar aynı görevi çeşitli şekillerde gerçekleştirir.

Örneğin, her şeyi ahşap ve camdan yapan bir inşaatçı, her şeyi taş ve demirden inşa eden ikinci bir inşaatçı ve altın ve elmas kullanan üçüncü bir inşaatçı hayal edin. Aynı adımları çağırarak, ilk inşaatçıdan normal bir ev, ikinciden küçük bir kale ve üçüncüden bir saray elde edersiniz. Ancak bu, yalnızca oluşturma adımlarını çağıran istemci kodu ortak bir arabirim kullanarak inşaatçılar ile etkileşime girebiliyorsa işe yarar.