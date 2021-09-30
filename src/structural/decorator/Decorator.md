## Decorator

Bir nesneye statik veya dinamik olarak ek sorumluluklar eklemek için bir Dekoratör kalıbı kullanılabilir. Bir Dekoratör, orijinal nesneye gelişmiş bir arayüz sağlar.

Bu kalıbın uygulanmasında, bir kalıtım yerine kompozisyonu tercih ediyoruz - böylece her dekorasyon elemanı için tekrar tekrar alt sınıflamanın ek yükünü azaltabiliyoruz. Bu tasarımla ilgili özyineleme, nesnemizi istediğimiz kadar dekore etmek için kullanılabilir.

#### Bu tasarım deseni, aşağıdaki durumlarda iyi bir seçimdir:

- Nesnelerin davranışını veya durumunu eklemek, geliştirmek ve hatta kaldırmak istediğimizde
- Tek bir sınıf nesnesinin işlevselliğini değiştirmek ve diğerlerini değiştirmeden bırakmak istediğimizde