## Abstract Factory,
Somut sınıflarını belirtmeden ilgili nesnelerin ailelerini üretmenize izin veren yaratıcı bir tasarım kalıbıdır.

Base bir fabrika oluşturup onun altında,her somut sınıfımız için kendi fabrikasını oluştururuz.
Somut sınfılarımızı new'lemek istediğimizde sadece kendi fabrikasından new'leyebiliriz.
Factory tasarım desenin gelişmiş halidir.Tek bir fabrika içinde switch-case veya if'lerle somut sınıfı new'lemek yerine ayrı ayrı fabrikalar oluştururuz.

Bu tasarım deseninin amacı somut sınıflara olan bağlılığı azaltmaktır.