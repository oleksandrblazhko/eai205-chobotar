Функціональна вимога FR2.1
Метод-функція recordWater

### Вхідні параметри:

1. water_balance - баланс води
- умова 1) Тільки одне вибране значення

2. amount_water - кількість випитої води
- умова 2) Цифри  від 0 до 6 включаючи дроби

3. data - дата внесення даних
- умова 3) значення можуть бути тільки числовими.
- умова 4) Формат часу дд.мм.рррр.


### Вихідні параметри:

- значення = 1 – дані успішно введено;
- значення = -1 – неправильно вибрано баланс;
- значення = -2 – кількість випитої води не відповідвє умовам;
- значення = -3 – дата не відповідає умовам.
