Primitve Data Types

Integer
    Byte (1 bytes),
    Short (2 bytes),
    Int (4 bytes),
    Long (8 bytes),
    Wrapper class stores size of eah of above types
    Byte.size
    Wrapper Classes are : Byte , Short ,Integer , Long
    We can also see max and min value in range , eg. Byte.MAX_VALUE , Byte.MIN_VALUE
Floating Point
    Float
    Double
Boolean
    boolean
Character
    char
    


1. We cannot store long value to int i.e large values cannot be stored into smaller onces , however vice versa can be done
2. If we still want to do it , we can do explicit cast by doing i = (int)l
3. We cannot assign double to float, lossy conversion
4. We cannot assign float value to integer
5. Float are not accurate representation of decimal values hence cannot be used in financial calculation
6. BigDecimal are used for accurate decimal representation
7. BigDecimal is immutable, we can assign value only once,
8. For accurate representation we should pass value as string in BigDecimal
9. You can only add a BigDecimal to other BigDecimal
10. You will have to create int constructor to  
11. && us true when both the conditions are true
12. || is true when either one of condition is true
13. ^ is true when both the operands are not same , one should be true and other should be false
14. && is shortcircuit operator which means out of two conditions even if first one is false it will not check for another condition
15. & checks both the condition even if 1st one is false
16. 


PreIncrement
 int j = ++ i;
//we increment and then assign the value to j

Post Increment
 int j = i++
//we first assign the value to j and then increment

PreDecrement
 int j = --i;

Post Decrement
 int j = i--;

    
