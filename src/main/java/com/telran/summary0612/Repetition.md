Primitive :
int a = 10;
int b = 20;
boolean result = a == b;

Enum : тоже можно сравнивать через ==

References :
Object one  = new Object();
Object two  = new Object();
one == two : #FFHH00 == #FFEEHH

equals :
one.equals(two) : default сравниваем ссылки на объекты

Equals:
1) this!=this
2) null
3) two instanceof one.getClass()
4) (cast) , By field

HashCode :
1) У двух одинаковых объектов - одинаковые хешкоды
2) Если хешкоды разные, то объекты точно разные
3) Если хешкоды одинаковые : либо объекты одинаковые или это коллизия,
проверка через equals

Comparator :
int <0, 0 , >0
o1  o2

Comparable :

