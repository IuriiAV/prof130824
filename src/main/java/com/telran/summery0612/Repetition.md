Primitive
int a = 10;
int b = 20;

boolean result = a == b;

Enum : можно сравнивать через ==

Reference:
Object one = new Object();
Object two = new Object();

one == two = #FFHHOO == #FFEEHH

equals:

one.equals(two): default сравнивание ссылок на объекты
Equals:
1. this != this
2. null
3. two instance of one.getClass()
4. (cast), by fields
HashCode :
- у двух одинаковых обьектов одинаковые хэшкоды
- если хэшкоды разные, то и обьекты точно разные
- если хэшкоды одинаковые : 
- либо обьекты одинаковые, либо коллизия -> проверка по equals

Comparator:
