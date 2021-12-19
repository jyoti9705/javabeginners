1. Abstract class provides you power to simply declare a method and not implement it
2. These methods which are declared in Abstract classes are implemented in Subclasses that will extend abstract class
3. We cannot create instance of abstract classes
4. A class can be defined abstract by using abstract keyword
5. An abstract class can have both abstract and non abstract methods
6. There should be atleast one abstract method in class for class to be abstract
7. If a concrete class extends an abstract class , it will have to provide implementation for all abstract methods by overriding abstract methods
8. Abstract class can extend another abstract class
9. If abstract class is extending another abstract class it can have unimplemented method
10. We can have non-abstract methods in abstract class

Difference between Abstract and Interface

1. Benefit using interface is that you can create instance of interface class and make use of methods that are used by
   two diff class which have implemented interface
2. Interface can implement multiple inheritance but Abstract class cannot
3. Purpose is main difference between Abstract and Inheritance
      1. When I want to Generalize the behaviour we will make use of Abstract classed
      2. When I want to Standardize the behaviour we will make use Inheritance
4. Interfaces which have default implementations with body are used to not break compilation, which means if user is not providing the implementation then default body implementation will execute
5. We cannot extend more than one class at a time , but we can extend multiple interfaces at a time
6. Abstract class can have abstract methods and non abstract methods, In Interface we will have to have all abstract methods 
7. In Abstract class we can define public and private variables , but in interface we can create only final and static variables

Interface

1. A Interface can extend other interface
2. Class implementing the interface which is extending other interface, will have to implement methods in both the
   interfaces
3. Interface allows you to access common methods between the class implementing the interface
4. 
