1. Map does not implements collection Interface , Although it is part of Collections
2. It included methods related to keys and values

Implementations of Map

1. HashMap
    1. UnSorted and UnOrdered
    2. Hashing techniques are used
    3. Allows storing key with Null Value

2. HashTable
    1. It is synchronized
    2. It is thread safe
    3. UnSorted And UnOrdered
    4. Hashing techniques are used
    5. We cannot store key with null Value
    6. We cannot store value with null value
    7. Why? because the objects used in Hashtable should be able to implement hashcode since null is not an object it cannot implement hashcode and hence values cannot be null


3. Linked Hash Map
    1. Insertion order is maintained
    2. Insertion , Deletion is little slower
    3. Faster Iteration

4. TreeMap
    1. Data is in sorted manner
    2. It implements Navigable Map