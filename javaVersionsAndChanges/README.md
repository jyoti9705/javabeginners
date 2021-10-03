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

Java 10 CopyOf Method

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

Java 11 ReadString WriteString

1. ReadString is used to get all contents from the file
2. Whereas writeStirng is used ton write contents to the file , by passing path were to write and content to write both
   as parameter
3. Predicate.not was introduced in Java11 to do negate of method references used in predicates for filter
4. Few string utility methods were also introduced in Java 11
    1. Strip : To remove space or blanks from start and end of String
    2. StripLeading : To remove space or blanks from start of the String
    3. StripTrailing : To remove space from end of the string
    4. transform
    5. formatted
    6. Enhanced Null Pointer Exception Message
5. 