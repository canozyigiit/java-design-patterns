## Mediator

Mediator , özel bir aracı nesne aracılığıyla dolaylı olarak iletişim kurmalarını sağlayarak bir programın bileşenleri arasındaki bağlantıyı azaltan davranışsal bir tasarım modelidir.

Mediator, artık düzinelerce başka sınıfa bağımlı olmadıkları için ayrı bileşenleri değiştirmeyi, genişletmeyi ve yeniden kullanmayı kolaylaştırır.

Hava trafik kontrolörü, havalimanı kontrol odasının farklı uçuşlar arasındaki iletişim için bir arabulucu olarak çalıştığı harika bir arabulucu modeli örneğidir. 

Arabulucu, nesneler arasında bir yönlendirici olarak çalışır ve iletişim yolunu sağlamak için kendi mantığına sahip olabilir.



Örneğimiz için, kullanıcıların grup sohbeti yapabileceği bir sohbet uygulaması uygulamaya çalışacağız. Her kullanıcı adıyla tanımlanacak ve mesaj gönderip alabilecekler. Herhangi bir kullanıcı tarafından gönderilen mesaj, gruptaki diğer tüm kullanıcılar tarafından alınmalıdır.