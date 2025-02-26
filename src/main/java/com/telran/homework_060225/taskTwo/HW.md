Задача 2:


Описание:
Создайте класс BankAccount, который хранит баланс пользователя. 
Реализуйте два собственных исключения:


InsufficientFundsException – выбрасывается при попытке снять больше денег, 
чем есть на счете.
NegativeDepositException – выбрасывается при попытке пополнить 
счет на отрицательную сумму.

Требования:


Класс BankAccount с полем balance (double).
Метод deposit(double amount), который увеличивает баланс 
(но выбрасывает NegativeDepositException, если amount < 0).
Метод withdraw(double amount), который уменьшает баланс 
(но выбрасывает InsufficientFundsException, если amount > balance).
Метод getBalance().
