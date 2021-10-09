1. Java 9 included modularization of Java
2. Application should be built modularized
3. Module-info.java has various keywords
    1. exports : If you want a particular package to be exposed to other module , we cna make use of exports
    2. requires : If you want a particular module in your module you can make use of transition and add that module to
       your current project module path
    3. requires transition : Not only project which is using this module will be able to access that import , but also
       other projects which will be importing current module will be able to access package specified uwith requires
       transition keyword
    4. opens package.a to module.a : exposes only a particular package to other module before Java 9
4. Advantages of Modularisation
    1. Compile time checks
    2. Better Encapsulation
    3. Smaller Runtime

Java 10 CopyOf Method , Type Inference

1. If you want your list to be non-modifiable by any other method or operation we can use either List. Of when data is
   small or List.copyOf
2. This can also be used for Set and Maps
3. Type Inference
    1. Java compiler infers the type of variable at compile time , we just need to add var
    2. You can also change into final variables
    3. By default, it is not final
    4. value of var cannot be null
    5. var is not a keyword
    6. Minimize scope
    7. Improves readability of chained expressions

Java 11 ReadString WriteString , Predicate.not , String Utility Methods , Enhanced Null Pointer

1. ReadString is used to get all contents from the file
2. Whereas writeStirng is used to write contents to the file , by passing path were to write and content to write both
   as parameter
3. Predicate.not was introduced in Java11 to do negate of method references used in predicates for filter
4. Few string utility methods were also introduced in Java 11
    1. Strip : To remove space or blanks from start and end of String
    2. StripLeading : To remove space or blanks from start of the String
    3. StripTrailing : To remove space from end of the string
    4. transform
    5. formatted
    6. Enhanced Null Pointer Exception Message

Java 12 Switch Expressions

1. No Fallthrough in switch
2. to return a particular value we make use of yield
3. Code is relatively easy to write
4. No need of using break

Java 13 Text Blocks

1. Text Blocks
    1. Whatever code written is text block i.e. """ """ is printed as it is
    2. Automatic alignment is done
    3. Trailing whitespace is stripped
    4. Text blocks can be used wherever we use strings

Java 14 , Records , Advanced Null Handling

1. Records
    1. Records eliminates the verbosity in creating java beans
    2. Using records public accessor methods , constructor , hashcode , equals and toString method are automatically
       created
    3. You can create custom implementations if we want
2. Advanced Null Pointer Handling
    1. -XX:+ShowCodeDetailsInExceptionMessages