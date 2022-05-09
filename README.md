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
                        1. Intermediate Code Generator – Produces intermediate
                        2. Code Optimizer – Responsible for optimizing the intermediate code generated above
                        3. Target Code Generator – Responsible for Generating Machine Code or Native Code
                        4. Profiler – A special component, responsible for finding hotspots, i.e. whether the method is
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
        6. 