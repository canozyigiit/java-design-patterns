## Facade

Facade , karmaşık bir sınıf, kitaplık veya çerçeve sistemine basitleştirilmiş (ancak sınırlı) bir arayüz sağlayan yapısal bir tasarım modelidir.

Facade, uygulamanın genel karmaşıklığını azaltırken, istenmeyen bağımlılıkları tek bir yere taşımaya da yardımcı olur.
### Sorun
Kodunuzu, karmaşık bir kitaplığa veya çerçeveye ait geniş bir nesne kümesiyle çalıştırmanız gerektiğini hayal edin. Normalde, tüm bu nesneleri başlatmanız, bağımlılıkları takip etmeniz, yöntemleri doğru sırada yürütmeniz vb. gerekir.

Sonuç olarak, sınıflarınızın iş mantığı, 3. taraf sınıfların uygulama ayrıntılarına sıkı sıkıya bağlı hale gelir ve bu da anlaşılmasını ve sürdürülmesini zorlaştırır.

### Çözüm
Facade, çok sayıda hareketli parça içeren karmaşık bir alt sisteme basit bir arayüz sağlayan bir sınıftır. Bir Facade, doğrudan alt sistemle çalışmaya kıyasla sınırlı işlevsellik sağlayabilir. Ancak, yalnızca müşterilerin gerçekten önemsediği özellikleri içerir.

Bir Facade sahip olmak, uygulamanızı düzinelerce özelliğe sahip gelişmiş bir kitaplıkla entegre etmeniz gerektiğinde kullanışlıdır, ancak yalnızca işlevselliğinin küçük bir kısmına ihtiyacınız vardır.

Örneğin, kedilerin olduğu kısa komik videoları sosyal medyaya yükleyen bir uygulama, potansiyel olarak profesyonel bir video dönüştürme kitaplığı kullanabilir. Ancak, gerçekten ihtiyaç duyduğu tek şey, tek yöntemli bir sınıftır encode(filename, format). Böyle bir sınıf oluşturduktan ve onu video dönüştürme kitaplığına bağladıktan sonra ilk cephenize sahip olacaksınız.
### Karmaşık bir video dönüştürme kitaplığı için basit arayüz
Bu örnekte, Cephe, karmaşık bir video dönüştürme çerçevesi ile iletişimi basitleştirir.

Facade, çerçevenin doğru sınıflarını yapılandırmanın ve sonucu doğru bir biçimde almanın tüm karmaşıklığını ele alan tek bir yöntemle tek bir sınıf sağlar.