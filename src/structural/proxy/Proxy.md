## Proxy 
Proxy , başka bir nesne için bir yedek veya yer tutucu sağlamanıza olanak tanıyan yapısal bir tasarım modelidir. Bir proxy, orijinal nesneye erişimi kontrol ederek, istek orijinal nesneye ulaşmadan önce veya sonra bir şeyler gerçekleştirmenize izin verir.


**[Proxy türleri]()**

#### Remote proxy:
bulunan nesneyi temsil etmekten sorumludurlar. Gerçek nesneyle konuşmak, verilerin sıralanması ve sıralanmasının kaldırılmasını ve uzaktaki nesneyle konuşmayı içerebilir. Tüm bu mantık, bu proxy'lerde kapsüllenmiştir ve istemci uygulamasının onlar için endişelenmesine gerek yoktur.
#### Virtual  proxy:
Gerçek nesnenin sonuç üretmesi biraz zaman alacaksa, bu proxy'ler bazı varsayılan ve anlık sonuçlar sağlayacaktır. Bu proxy'ler, işlemi gerçek nesneler üzerinde başlatır ve uygulamaya varsayılan bir sonuç sağlar. Gerçek nesne yapıldıktan sonra, bu proxy'ler gerçek verileri daha önce sahte verileri sağladığı istemciye gönderir.
#### Protection Proxy:
Bir uygulamanın bir kaynağa erişimi yoksa, bu tür proxy'ler, o kaynağa erişimi olan uygulamalardaki nesnelerle konuşacak ve sonucu geri alacaktır.
#### Smart  Proxy:
Akıllı proxy, nesneye erişildiğinde belirli eylemleri araya sokarak ek güvenlik katmanı sağlar. Bir örnek, başka hiçbir nesnenin onu değiştiremeyeceğinden emin olmak için erişilmeden önce gerçek nesnenin kilitli olup olmadığını kontrol etmek olabilir.