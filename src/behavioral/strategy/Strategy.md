## Strategy 

Strateji , bir dizi davranışı nesnelere dönüştüren ve bunları orijinal bağlam nesnesi içinde değiştirilebilir hale getiren davranışsal bir tasarım modelidir.

Bağlam adı verilen orijinal nesne, bir strateji nesnesine bir referans tutar ve davranışı yürütmesini delege eder. Bağlamın işini gerçekleştirme şeklini değiştirmek için, diğer nesneler, halihazırda bağlantılı olan strateji nesnesini bir başkasıyla değiştirebilir.

Bu örnekte, bir e-ticaret uygulamasında çeşitli ödeme yöntemlerini uygulamak için Strateji modeli kullanılmıştır. Satın almak için bir ürün seçtikten sonra müşteri bir ödeme yöntemi seçer: Paypal veya kredi kartı.

Somut stratejiler yalnızca gerçek ödemeyi gerçekleştirmekle kalmaz, aynı zamanda ödeme ayrıntılarını kaydetmek için uygun alanlar sağlayarak ödeme formunun davranışını da değiştirir.