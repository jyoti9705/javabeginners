1. Finally is executed is all cases
    1. if return is present in try block then too it will trigger finally
    2. In case of exceptions it is executed
    3. The only case where finally is not executed is when we call system.exit , which we should not call as it will
       kiss all java process
2. there care be various combinations of try , catch , finally
    1. Try with Catch Block will compile the code
    2. Try with finally block will also compile the code
    3. Just try block and no catch and finally will cause compilation error
3. Certain Exceptions are forced to handle , they are known as Checked Exceptions
4. Exception which are not forced to handle are called UnChecked Exceptions
5. Hierarchy of Exceptions
    1. Super Class of Everything related to exception in throwable
    2. Error and Exceptions extends Throwable
    3. Anything which is not a Runtime Exception , not a subclass of Runtime Exception , but is Subclass of Exceptions
       is called Checked Exceptions
    4. Runtime Exception and SubClass of RuntimeException are UnChecked Exceptions
6. Whenever you are throwing checked exceptions , you need to specify it on your method or add try catch block
7. You can also throw custom Exception
8. Exceptions should be defined in catch block as per hierarchy
    1. Custom , Subclassed first and then Superclass Exception
9. Never Hide Exceptions
10. Also log the exceptions
11. Have global Exception Handling to not throw exception to the end user
