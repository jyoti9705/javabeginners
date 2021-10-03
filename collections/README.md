1. Accessing values at certain positions is easy in Array however,Adding or removing values in array is costly operation
   , because for adding in between we will have to move all other values to one right or left accordingly
2. In LinkedList each value has reference of next value , so to access a particular value we will have to go one by one
   which is costly operation , however adding or removing values are easy in Linkedlist
3. If we want to add a value at certain position in Linkedlist , we will have to simply add an element and change the
   reference of previous value to the number added and added number will point to next value which is easy and not
   costly operation
4. So depending upon choice and use we will use Array or Linkedlist or ArrayList

Arraylist vs Vector

1. Most important point is that Vector is synchronized to make code thread safe, but Arraylist is not synchronized
2. But thread safety is not free it consumes time

When to use Iterator and When Advanced for each loop

1. It is not recommended to add or remove elements from list while looping it using advanced for each loop
2. So we should use iterator for such scenarios where we want to add or remove element from the list
3. 