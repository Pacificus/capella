
1. Если не успели в классе, доработайте свую собственную реализацию стэка.  
   Отличной практикой будет сделать всё что мы делали еще раз.
   Методы стэка:
   - push
   - pop
   - peek
   - min
   - max
   
2. Для CustomArrayList добавьте еще один итератор, который позволяет пройтись  
   по его элементам в случайном порядке. Элементы не должны повторяться.  
   Проверьте использование итератора с помощью методов hasNext() и next(),  
   а также с помощью упрощенного цикла for-each
   
3. Используя стэк (можно использовать стандартный java.util.Stack),  
   переведите число из 10ной в 2ную систему счисления
   
4. Дана строка, которая содержит открывающиеся и закрывающиеся скобки.  
   Определить правильно ли они сбалансированы. Причем недостаточно посчитать  
   количество открывающихся из закрывающихся, если одна скобка открылась,  
   то она же должна и закрыться. Скобки могут быть трех видов "{}", "()", "[]".

   Пример ввода:  
   "((({}()[])))" - скобки сбалансированы правильно  
   "(({)})" - скобки не сбалансированы  
   "{([])}" - скобки сбалансированы правильно  
