## Visitor

Visitor , mevcut herhangi bir kodu değiştirmeden mevcut sınıf hiyerarşisine yeni davranışlar eklemeye izin veren davranışsal bir tasarım modelidir.

- 1- accept(Visitor)"Öğe" hiyerarşisine bir yöntem ekleyin
- 2- visit()Her "eleman" türü için bir yöntemle bir "visitor" temel sınıfı oluşturun
- 3- "Öğeler" üzerinde yapılacak her "işlem" için bir "visitor" türetilmiş sınıf oluşturun
- 4- İstemci "visitor" nesneleri oluşturur ve her birini accept()çağrılara iletir