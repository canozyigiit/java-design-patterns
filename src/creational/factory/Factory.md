## Factory,
Bir üst sınıfta nesneler oluşturmak için bir arabirim sağlayan, ancak alt sınıfların oluşturulacak nesnelerin türünü değiştirmesine izin veren yaratıcı bir tasarım modelidir.


### Sorun
Bir lojistik yönetim uygulaması oluşturduğunuzu hayal edin. Uygulamanızın ilk sürümü yalnızca kamyonlarla taşımayı halledebilir, bu nedenle kodunuzun büyük kısmı Trucksınıf içinde yaşar .

Bir süre sonra uygulamanız oldukça popüler hale geliyor. Her gün deniz taşımacılığı şirketlerinden deniz lojistiğini uygulamaya dahil etmek için onlarca talep alıyorsunuz.

Programa yeni bir ulaşım sınıfı eklemek bir soruna neden oluyor
Kodun geri kalanı zaten mevcut sınıflara bağlıysa, programa yeni bir sınıf eklemek o kadar kolay değildir.

Harika haber, değil mi? Peki ya kod? Şu anda, kodunuzun çoğu Trucksınıfa bağlı. ShipsUygulamaya eklemek , tüm kod tabanında değişiklik yapılmasını gerektirir. Ayrıca, daha sonra uygulamaya başka bir ulaşım türü eklemeye karar verirseniz, muhtemelen tüm bu değişiklikleri tekrar yapmanız gerekecektir.

Sonuç olarak, ulaşım nesnelerinin sınıfına bağlı olarak uygulamanın davranışını değiştiren koşullarla dolu oldukça kötü bir kodla karşılaşacaksınız.

### Çözüm
Fabrika Yöntemi modeli, doğrudan nesne oluşturma çağrılarını ( newoperatörü kullanarak ) özel bir fabrika yöntemine yapılan çağrılarla değiştirmenizi önerir . Endişelenmeyin: nesneler yine de newoperatör aracılığıyla oluşturulur , ancak fabrika yönteminden çağrılır. Bir fabrika yöntemiyle döndürülen nesnelere genellikle ürün denir .

İçerik oluşturucu sınıflarının yapısı
Alt sınıflar, fabrika yöntemiyle döndürülen nesnelerin sınıfını değiştirebilir.

İlk bakışta, bu değişiklik anlamsız görünebilir: yapıcı çağrısını programın bir bölümünden diğerine taşıdık. Ancak şunu göz önünde bulundurun: artık bir alt sınıfta fabrika yöntemini geçersiz kılabilir ve yöntem tarafından oluşturulan ürünlerin sınıfını değiştirebilirsiniz.

Yine de küçük bir sınırlama vardır: alt sınıflar, yalnızca bu ürünler ortak bir temel sınıfa veya arabirime sahipse farklı türde ürünler döndürebilir. Ayrıca, temel sınıftaki fabrika yönteminin dönüş türü bu arabirim olarak bildirilmelidir.

Ürün hiyerarşisinin yapısı
Tüm ürünler aynı arayüzü takip etmelidir.

Örneğin, her ikisi de Truckve Shipsınıfları uygulamalıdır Transportadı verilen bir yöntemi bildirir arayüzü deliver. Her sınıf bu yöntemi farklı şekilde uygular: kamyonlar kargoyu karadan, gemiler kargoyu denizden teslim eder. RoadLogisticsSınıftaki fabrika yöntemi kamyon nesnelerini döndürürken , sınıftaki fabrika yöntemi SeaLogisticsgemileri döndürür.

Fabrika yöntemi desenini uyguladıktan sonra kodun yapısı
Tüm ürün sınıfları ortak bir arabirim uyguladığı sürece, nesnelerini kırmadan istemci koduna iletebilirsiniz.

Fabrika yöntemini kullanan kod (genellikle müşteri kodu olarak adlandırılır ), çeşitli alt sınıflar tarafından döndürülen gerçek ürünler arasında bir fark görmez. Müşteri tüm ürünleri soyut olarak ele alır Transport. İstemci, tüm taşıma nesnelerinin deliveryönteme sahip olması gerektiğini bilir , ancak tam olarak nasıl çalıştığı müşteri için önemli değildir.