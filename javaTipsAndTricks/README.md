1. Make use of static imports , if you are using that method more often
2. It is always recommended using if , else in blocks
3. Equals and Hashcode are always used together , because we do not want two objects to have separate hashcode if their
   values are same.
4. We cannot use protected and private access modifier on a class , we can only use default and public
5. For methods in same package we can access all the methods public , protected , default but no private methods
6. We can access only public methods from different package
7. When class is called final we cannot inherit or extend it further , because we do not want to modify the class which
   is declared final
8. We can also declare method as final , but method declared final cannot be overridden
9. We want variable value to not change at all , we should use final
10. Final is Non Access Modifier
11. Another non access modifier is static
12. A variable is declared as static when we do not want one instance per object, and we want shared instance for all
    object
13. Inside static method we cannot access non-static variables , in non-static method we can access static variables
14. public static final - Constants
15. class inside a another class is called Nested Class
    1. Non-static nested class are called inner class
        1. Instance of inner class cannot be created without creating instance of main class
    2. Methods with static modifier is called static nested class
        1. Instance of static nested class can be created without instance of main class
16. Enums should be used if we want to use only certain set of values
17. 