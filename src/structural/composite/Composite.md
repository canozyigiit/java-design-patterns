## Composite (Bileşik)

Kendi içlerinde birbirlerinden farklı olan bir grup nesnenin sanki tek bir bütün nesneymiş gibi kullanılmasını bileşik kalıp sağlar. Bileşik kalıpların görevi, nesneleri bir ağaç yapısında birleştirip uygulamanın genelindeki parça bütün ilişkisini yeniden düzenleyip şekillendirmektir.

- Kullanıldığı durumlar: 
Yazılımcı, kullanıcının isteği doğrultusunda aynı türden veya farklı türlerden bir nesne topluluğu kullanmak zorunda ise, karmaşadan ve karışıklıktan kurtulmak için bileşik kalıp kullanabilir.

Bileşik Tasarım Kalıbının Yapısı

### Bileşik kalıbın içinde yer alan yapılar aşağıda sıralanmıştır.

#### Bileşen(Component)

Bileşikler için temel soyut tanımlamalardır.
Bileşik işlemi için nesnelerin arayüzünü oluşturur.
Tüm sınıfların arayüzündeki varsayılan davranışı gerçekleştirir.
Yavru bileşenlere ulaşmamızı ve onları kontrol etmemizi sağlamak için bir arayüz tanımlar.

#### Yaprak (Leaf)

Bileşik işleminde yavru nesneleri temsil eder.
Tüm bileşen metodları yapraklar tarafından tamamlanır.

#### Bileşik (Composite)

Yaprakları olan bileşenleri temsil eder.
Çocuklarını yönlendiren metodları gerçekler.
Genelde çocuklarını görevlendirerek bileşik metodlarını gerçekler.