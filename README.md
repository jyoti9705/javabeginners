1.Steps to install Java on windows

	1. Go to https://www.oracle.com/java/technologies/downloads/
	2. Select required OS
	3. Select the JDK Version you want to download
	4. Download the .exe installer
	5. Once installer is downloaded double click on it and click on yes , when asked for permission
	6. Copy the path where jdk is installed For e.g. C:\Program Files\Java\jdk-16.0.2\
	7. Installation is now complete, now we need to set java path 
	8. Go to location where Java is installed (path which you copied in step 6) , go to bin folder and copy the path till bin
	9. Go to environment variables , click on path and click on edit
	10. Click on New and Paste the path copied on step 8 
	11. Keep Clicking on Move Up untill it comes on the top 
	12. Click on OK

2. Steps to Verify Java Installation

    1. Open cmd in your home directory
    2. Type java -version, you will see latest java version which you installed by following above steps
    3. To further verify type jshell -version , you will the version of jshell
    4. if all above steps Ran successfully and you are also seeing versions , Hurray !! Java Setup Completed

3. Features of Java Main reason behind creation of Java was to introduce portability and security features however apart
   from these 2 features there are many other features that play an important role in Java
    1. Simple
        1. Java is simple and has easy to learn syntax , The confusing and ambiguous concepts of C++ are either left out
           in Java for they are implemented in a cleaner way
    2. Object Oriented
        1. In Java everything is about objects which has some data and behaviour
        2. Java can be easily extended based on object model
        3. Following are some basic features of OOPs
            1. Object
            2. Class
            3. Abstraction
            4. Inheritance
            5. Polymorphism
            6. Encapsulation
    3. Robust
        1. Java makes an effort to eliminate error-prone codes by introducing compile time error checks and runtime
           checks
        2. But the main area in which Java improved was Memory management by introducing automatic Garbage Collector and
           Exception Handling
    4. Platform Independent
        1. In Java code is compiled into byte code which is platform independent and can run on any machine that has
           Java Runtime Environment.
        2. Java Byte code is secure.
    5. Secure
        1. When it comes to security Java is always the first choice
        2. Java makes it possible for us to write virus free code which always runs in Java Runtime Environment , which
           has almost null interactions with System OS
    6. Multithreading
        1. Java makes it possible for us to execute multiple features at the same time with help of Multithreading
        2. Benefit of Multi threading is that it utilizes same memory and other resources to execute multiple threads at
           the same time
    7. Architectural Neutral
        1. Compiler generates byte code which is independent of any computer architecture hence it can be interpreted on
           any machine.
    8. High Performance
        1. Java is interpreted language hence it will never be as fast as C and C++ but it provides high performance but
           help of in time compiler
    9. Distributed
        1. Java is a distributed language , Program can be designed to run on computer networks, it has special library
           to interact with TCP/IP protocols.
        2. Creating network connections are very much easy in Java as compared to C/C++
4. New Features of Java 8
    1. Improved productivity by providing optional classes feature,lambda expressions , Streams etc
    2. Ease of Use
    3. Improved Polyglot Programming , Polyglot is a program or a script , written in form which is valid in multiple
       programming languages So Java now supports such type of Programming technique.
    4. Improved Security and Performance
5. JVM Architecture
    1. JVM is an abstract machine , it is a specification that provides environment to run java bytecode and execute it
    2. JVM are available for many hardware and software platforms
    3. JVM is platform dependent
    4. JVM is
        1. A Specification that provides runtime environment to execute Java byte code
        2. An Implementation , implementation of JVM is JRE(Java Runtime Environment)
        3. Runtime Instance , whenever we write a java command to run java class a new instance of JVM is created
    5. Architecture of JVM
        1. Class Loader
            1. Loading
                1. Class loader is used to load class files , whenever we run java program it is first loaded by class
                   loader , there are 3 built in class loaders in Java
                    1. BootStrap Class Loader
                        1. This is the first loader and is the super class of Extension Loader
                        2. It loads the rt.jar file which contains all class files of Java Standard Edition like
                           java.lang.package , java.net.package , java.util.package , java.sql packages etc
                    2. Extension Class Loader
                        1. It is child class of BootStrap loader and the super class of system or application class
                           loader . It loads all the jar files from $JAVA_HOME/jre/lib/ext directory
                    3.
                    4. System/Application Class Loader
                        1. This is child class of Extension Class Loader, and it loads all the class files from the
                           classpath , by default the classpath is current directory, but we can change it
                2. Above class loader follows Delegation Hierarchy Algorithm which means JVM first checks if class is
                   present in Method area if no then it delegates to Application class loader which further delegates to
                   Extension class loader and if the class is not found in Extension Class loader it delegates it to
                   BootStrap Class Loader. BootStrap searches in rt.jar if not found delegates to extension class loader
                   which further delegates to Application class loader, if the class file is still not found it throws
                   ClassNotFoundException
            2. Linking
                1. Verify
                    1. Verify will do verification if the generated bytecode is secure or not if it is not secure it
                       will throw verification error
                2. Prepare
                    1. This will assign default values to all static variables and memory is allocated
                3. Resolve
                    1. All symbolic memory references are replaced by original memory references from Method Area
            3. Initialization
                1. This is final block of JVM where all static variables are assigned original values and static block
                   is executed.
        2. Runtime Data Area
            1. Runtime data area is divided into 5 different areas
                1. Method Area
                    1. All class level data is stored in Method Area including static variables, there is only one
                       method area per JVM, and it is a shared resource
                2. Heap Area
                    1. All objects and there corresponding instance variables and arrays will be stored in Heap Area ,
                       Heap Area is also a shared resource and there is only one Heap Area per JVM
                    2. Since Method and Heap Area are both shared resource data in it is not thread safe
                3. Stack Area
                    1. For every thread a separate runtime stack will be created. For every method call one entry will
                       be made in stack memory which is called stack frame. All Local variables will be created in stack
                       memory. Stack area is thread safe and is not a shared resource
                4. PC Registers
                    1. Each thread will have separate PC Registers, to hold the address of current executing instruction
                       once the instruction is executed the PC register will be updated with the next instruction.
                5. Native Method stacks
                    1. Native Method Stack holds native method information. For every thread, a separate native method
                       stack will be created.
        3. Execution Engine
            1. The bytecode which is assigned to Runtime data are is executed in execution engine, it reads byte code
               data and executes each operation piece by piece
                1. Interpreter
                    1. The interpreter interprets the bytecode faster but executes slowly. The disadvantage of the
                       interpreter is that when one method is called multiple times, every time a new interpretation is
                       required.
                2. JIT Compiler
                    1. The JIT Compiler neutralizes the disadvantage of the interpreter. The Execution Engine will be
                       using the help of the interpreter in converting byte code, but when it finds repeated code it
                       uses the JIT compiler, which compiles the entire bytecode and changes it to native code. This
                       native code will be used directly for repeated method calls, which improve the performance of the
                       system.
                        1. Intermediate Code Generator ??? Produces intermediate
                        2. Code Optimizer ??? Responsible for optimizing the intermediate code generated above
                        3. Target Code Generator ??? Responsible for Generating Machine Code or Native Code
                        4. Profiler ??? A special component, responsible for finding hotspots, i.e. whether the method is
                           called multiple times or not.
                3. Garbage Collector
                    1. Collects and removes unreferenced objects. Garbage Collection can be triggered by calling
                       System.gc(), but the execution is not guaranteed. Garbage collection of the JVM collects the
                       objects that are created.
            2. JNI
                1. JNI will be interacting with the Native Method Libraries and provides the Native Libraries required
                   for the Execution Engine.
            3. Native Method Libraries
                1. This is a collection of the Native Libraries, which is required for the Execution Engine.
6. Garbage Collection in Java
    1. Garbage means unreferenced objects
    2. Garbage Collection is process of reclaiming unused memory from runtime area automatically
    3. To do so we use free() in C and delete() in C++. But in java it is done automatically hence Java provides better
       memory management.
    4. Advantages of Garbage Collections
        1. It makes java memory management efficient because garbage collector removes unreferenced objects from Heap
           area.
        2. It is automatically done in Java hence we need not provide extra efforts
    5. It can be done in various ways
        1. By nulling the reference object
        2. By assigning it to some other value
    6. finalize()
        1. Finalize is executed each time before Garbage Collection is invoked, it is used to perform cleanup
           processing, it is defined in object class
    7. gc()
        1. gc is defined in System and Runtime class, it is used to invoke garbage collector to perform cleanup
           processing
    8. Nether finalization nor garbage collection is guaranteed
7. Relationship between classes
    1. Inheritance(IS-A)
        1. Inheritance is achieved by using extends keyword
        2. Inheritance will inherit all the properties from one class into another i.e. from parent class to child class
        3. When child class extends the parent class IS-A Relationship is built between them
        4. When inheritance is implemented both the classes are tightly coupled which means if we change anything in any
           class it will affect the other class
        5. Inheritance shares blood relationship between the classes
        6. Hence, they are tightly coupled
        7. Inheritance is from bottom to top
    2. Association(HAS-A)
        1. Association can be seen in model files the class has HAS-A relationship with the attributes in it,
           Association can also be implemented by creating object of one class into another
        2. Association is not a blood relationship , change in one class will not affect the other class that much
        3. Association has aggregation and aggregation has composition
        4. Classes in Association are not tightly coupled
        5. Association is from top to bottom
        6. Aggregation has weak bonding and composition has strong bonding
            1. Aggregation
                1. Weak Bonding between the classes
            2. Composition
                1. Strong Bonding between the classes
    3. Why relationship build is required
        1. Code Usability
        2. Cost-cutting
        3. Reduce redundancy
8. Abstraction
    1. Abstraction means hiding the implementation details from outer world
    2. Encapsulation is hiding the data details from outer world
    3. In Abstraction, we expose only certain services to the outer world for use and hide the rest of the
       implementations
    4. Abstraction can be achieved with abstract classes or interfaces
        1. With Abstract classes we can achieve 0 to 100% abstraction
        2. With Interface, we can achieve 100% abstraction
    5. If a class has abstract method then it will be abstract class , however if the class is abstract class it need
       not have abstract methods
    6. Abstract methods have no implementations
    7. If the regular class implements abstract class then it becomes compulsory for it to implement non-abstract
       methods
    8. Abstract class object can never be created because we do not want to call methods with no implementation
    9. Interface
        1. Before Java8 we only had abstract methods in Interfaces , that is methods with no implementations
        2. Interface is used to achieve abstraction
        3. Interface supports multiple inheritance
        4. It can be used to achieve loose coupling
        5. Interface has all methods public abstract
        6. Any fields created inside interface is public static final by default
        7. from java 8 we can create default concrete methods and static methods in interfaces
        8. By Default access modifier for static methods is public
        9. From Java 9 we can also create private methods in Java
        10. Any class implementing interface should implement all the abstract methods i.e. by method overriding
        11. We cannot create object for interfaces
        12. Interface is blueprint for class
        13. We can also specify abstract methods in interfaces
        14. public methods with no default and static keyword cannot be implemented in Interface
        15. Interface can extend any no of interfaces
    10. Difference between Abstract and Interfaces
        1. Abstract classes can have public concrete methods but interfaces have no public concrete methods with
           implementations
        2. Abstract classes can have non-final variables but by default all variables in interfaces are public static
           final
        3. Methods and variables can have access modifiers public, private , protected , default in abstract whereas in
           interface it can be public . default and static
        4. Java abstract class are extended using extend keyword vs Interfaces are implemented using implements keyword
        5. An abstract class can extend another java class and implement Interfaces vs Interface can only extend other
           Java Interface
        6. Abstract class can implement methods from Interface but Interface cannot implement abstract methods
        7. Members of abstract class can have any access modifier whereas Members of Interface can only have public
           access modifier
        8. Abstract keyword is used to declare abstract class , Interface keyword is used to declare interface class
        9. Abstract class can be extended using keyword extends and interface can be implemented using keyword
           implements
        10. Abstract class does not support multiple inheritance , Interface supports multiple inheritance
9. How Hashmap works internally
    1. Hashmap stores values in form of key value pair
    2. Also point to remember is that key in Hashmap are unique
    3. Also, all the operation in Map like insert,search,delete are performed as O(1)
    4. In hashmap values are not stored in continuous manner , instead it is stored in any order this is because hashing
       is used in Hashmap
    5. Hashing
        1. Uses hash function , hash function generates same output for same input
        2. Hash functions maps larger values into smaller values
        3. Should be O(1) or O(len) for String
        4. Should uniformly distribute large keys into hash table slots
        5. Eg
            1. For Large Integer keys = key%m
            2. For String = weighted sum
            3. For Objects = weighted sum of elements
        6. HashTable is nothing but array of nodes
        7. to insert values in hashtable we divide the sum or key by length of the node and then the reminder is the
           place where values are stored if 2 values have same remainder then it is stores in form of linkedlist
        8. To get values from HashTable we find hash of the key and then check of the key is matching if not we move to
           another node in the list
        9. After Java8 a threshold was introduced i.e if the linked list chain cross a threshold of 8 we convert it into
           self-balancing binary search tree which is of log(len) complexity

10. Problems with Array
    1. We can not increase or decrease the size of the array
    2. Arrays are Homogenous
    3. Arrays concept are not implemented based on standard data structure hence predefined method supports are not
       available
11. Because of above limitations e switch to Collections
    1. Collections can hold both homogenous and heterogeneous objects
    2. Collections are growable in nature
    3. Collections are developed based on some standard data structures
        1. Ready-made method support we can expect
12. Differences between Arrays and Collections
    1. Arrays are fixed in size whereas Collections are growable in nature
    2. w.r.t to memory Arrays are not recommended whereas Collections are recommended
    3. Performance wise Arrays are recommended and Collections are not
    4. Arrays can hold only homogenous data elements whereas collections can hold both homogenous and heterogeneous data
       elements
    5. Underlying datastructures is not available in Array hence readme method support is not available in Array whereas
       in Collections in underlying data structures are available hence ready-made methods are available
    6. Arrays can store both object and primitive and Collections can only store object.
13. Marker Interface in Java
    1. Marker Interface contains no methods specifications or declarations,
    2. Implementation for market interface or any methods from market interface are provided from Sun Microsytems itself
    3. Advantages of Marker Interface
        1. No need to write implementations multiple times , we need to just intimate JVM that we are making use of
           Marker Interface by implementing the Marker Interface
    4. Implementations of the marker interface is provided by the Object , on its own it is empty interface
    5. They do not have any abstract methods
    6. They are empty
14. What are different ways to create object?
    1. By using new keyword
    2. Using newInstance() method in java.lang.package in class Class
        1. We need to first load the class with help of Class.forName("Name of Class");
        2. We can also load class with ClassName.class method
        3. Typecast the instance to Student class
        4. New Instance method makes use of Default constructor of class to create object
    3. By using constructor newInstance method
        1. Difference between class and constructor new instance method
            1. Constructor new Instance method is present in java.lang.reflect package whereas Class new instance method
               is present in java.lang.class method
            2. Constructor new Instance method can invoke any constructor be it parameterized or default constructor but
               Class new Instance method can only invoke no parameterized constructors or no args default constructor
            3. Constructor new Instance method can invoke both private and public constructors but Class new Instance
               method can invoke only public constructors
            4. Constructor new Instance method wraps up all the exception and throws invocation target exception whereas
               Class new Instance method throws all the exception thrown by constructor
        2. Constructor.newInstance method is widely used for object creation by multiple frameworks
        3. We need to load the class with ClassName.class.getConstructor() into a constructor object
        4. We can then call the getInstance() method inside constructor
    4. Using clone
        1. When we make use of clone() method it will create same class with all properties same as of the class we are
           trying to replicate
        2. But the replicated class will have separate method references and memory address
        3. Copying properties of one class to another class is called object cloning
        4. We need to implement the Cloneable Marker Interface and then override the clone method to clone new object
        5. Constructor is not getting called over here
    5. Using Deserialization
        1. We will have to implement the Serializable marker Interface
        2. Use readObject() method inside serialization
        3. Also, constructor is not called in this type of object creation
15. Collections
    1. Group of individual objects represented in form of single entity
    2. Collection Framework
        1. Collection Framework defines list of classes and interfaces required to represent group of individual objects
           as a single entity
    3. Key Interfaces of Java Collection
        1. Collection
            1. Collection Interface has list of common methods that are used or available for almost all the collection
               interface
            2. Collection Interface is root interface of Java Collection
            3. If we want to represent group of individual objects as a single entity we should go for collection
            4. Difference between Collection and Collections
                1. Collection is an Interface whereas Collections is a utility class we define several utility methods
                   for collections like sorting searching etc. for collections
        2. List
            1. If we want to store group of individual objects as a single entity we should go for collection , now if
               in this collection we want to preserve insertion order and duplicates are allowed that we should go for
               list.
            2. List Interface is a child interface for collection
            3. Implementation classes for list are
                1. Arraylist 1.2
                2. LinkedList 1.2
                3. Vector 1.o
                    1. Implementation of Vector is Stack
                    2. Vector and Stack are present since 1.0 hence they are called as legacy classes
                    3. Vector and Stack were reengineered in 1.2 to implement list
        3. Set
            1. If we want to store group of individual objects as a single entity in which it is fine with me if
               insertion order is not maintained, but we do not want duplicates then we should go for set
            2. Set is a child interface for collection
            3. Implementations for Set are
                1. HashSet 1.2
                2. LinkedHashset 1.4
            4. Difference between List and Set
                1. Duplicates are allowed in List , whereas in Set duplicates are not allowed
                2. Insertion Order is preserved in List but in Set Insertion order is not preserved
        4. SortedSet 1.2
            1. if we want to store group of individual objects in a form that duplicates should not be present but some
               order should be maintained then we should go for Sorted Set
            2. SortedSet is a child interface for Set
        5. Navigable Set 1.6
            1. Navigable set is child interface for Sorted set added for navigation purposes
            2. TreeSet 1.2 is implementation for Navigable Set
        6. Queue
            1. Queue is child Interface for Collection
            2. If we want store Group of Objects prior to processing then we should go for Queue Interface
            3. Implementation of Queue Interface
                1. Priority Queue
                2. Blocking Queue
                    1. Child classes of Blocking Queue are
                        1. LinkedBlockingQueue
                        2. PriorityBlockingQueue
            4. Whole queue concept was introduced in 1.5version
        7. Map
            1. If we want to store group of objects as form of Key and Value Pair then we should go for Map
            2. Map is not a child interface of Collection , or collection is not a root interface for collection
            3. Duplicate keys are not allowed in Map but Values can be duplicate
            4. Hashmap allows one null key and multiple null values , whereas Hashtable allows no null key or value
            5. Implementations of HashMap are
                1. HashMap 1.2
                    1. LinkedHashMap 1.2 is child class for HashMap
                2. WeakHashMap 1.2
                3. IdentityHashMap 1.4
                4. Hashtable 1.0
                    1. Properties is child class for HashTable , Hashtable implements Map interface and extends
                       Dictionary Class
                    2. Hashtable , Dictionary and Properties were introduced in Java 1.0 hence they are called as legacy
                       classes
        8. SortedMap
            1. SortedMap is a child interface for Map
            2. If we want to store key and value pairs according to some order of keys then we should go for SortedMap
        9. Navigable Map
            1. Navigable Map is child interface for Sorted Map
            2. Implementation of Navigable map is TreeMap
            3. It defines utility methods for navigation purpose
    4. Overview of Collection Framework
        1. List - Duplicates allowed and insertion order preserved
        2. Set - Insertion order not maintained and duplicates are not allowed
        3. SortedSet - All objects to be inserted without duplicates according to some sorted order
        4. Navigation Set- If we want to navigate the list
        5. Queue - Before processing if we want to represent group of individual objects
        6. Map - Represent group of objects as key and Value Pairs
            1. In Collection First Half represent storing single objects , Next half stores key and value pairs which is
               Map
            2. Map is not a child interface for Collections
        7. SortedMap - Group of objects are stored in key and value pairs according to some sorting order of key
        8. Navigable Map - if we want navigation support for sorted map
        9. Collection - Root Interface for all collection Interfaces leaving Map
    5. If we want default sorting we should go for Comparable Interface , if we want customised sorting then we should
       go for Comparator Interface
    6. To get objects one by one from the Collection Framework there are 3 cursors present
        1. Enumeration
        2. Iterator
        3. List Iterator
    7. Utility Classes
        1. Collections utility methods for collection
        2. Arrays utility methods for Array
16. String memory allocation
    1. If I create 2 Strings in Java with new Keyword having same value in it like
        1. String a = new String("Java");
        2. String b = new String("Java");
        3. Java will first check in Java String Constant Pool if the value "Java" is present ,if present in pool it will
           create not create another object in Constant Pool because Java constant pool can strictly not have duplicates
           in it , if it is not present it will create new object inside constant pool
        4. Now since this String is created with new keyword , it is created at runtime because objects are created in
           runtime and stored in Heap , because the object is created at runtime it will also create new object in Heap
        5. Now if we try to create another String with same content it will find that string constant pool already has
           the content, so it will not create new content again in constant pool , however it will still create object
           inside heap memory because heap has no such restriction for duplicate objects
        6. Also, a point to remember over here is that the reference that it will point to is the object inside heap
           variable
        7. Now what should happen if I create 2 String with same contents using double quotes
            1. String a = "Java"
            2. String b = "Java"
            3. As java constant pool cannot have duplicates , at first the content will be added to the constant pool
               and then both the object will be given same reference
            4. Also, as this is not getting created with new keyword it will not be created in the Heap memory
17. What is Serialization?
    1. The process of converting file from Java supported form to network supported form is called Serialization
    2. The process of converting the object from Java Supported form to network/file supported form is called
       Serialization
        1. The process of saving state of an object to a file is called Serialization
    3. How can we implement Serialization?
        1. File output stream and object output stream we can implement Serialization
        2. OOS take the object and converts that object into binary data , File Output Stream will store that binary
           data into the file
18. What is Deserialization
    1. The process of converting file from Network supported form to Java Supported form is called Deserialization
    2. The process of reading state of an object from the file is called deserialization
    3. How to implement Deserialization
        1. To read binary data we will need FieInputStream and ObjectInputStream will convert binary data back to Object

