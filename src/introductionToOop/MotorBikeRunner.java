public class MotorBikeRunner {

    public static  void main (String [] args){
       //object Oriented Programming
        //  1. Class
        //  2. Objects
        //  3. Inheritance
        //  4. Polymorphism
        //  5. Encapsulation
        //  6. Abstraction


        //Class - Blueprint
        //Object - Instance
        //Class can have multiple instances
        //Fields are its properties like speed
        //Fields can be referred from objects created
        //Behaviour are methods which specify how they work
        //we created two instances of Class MotorBike over here
        MotorBike a = new MotorBike();
        MotorBike b = new MotorBike();

        a.start();
        b.start();


        ////Encapsulation////
        //Here motorbikeRunner class is directly accessing the speed property of other class called motorbike which is breaking the important concept of Encapsulation
        //other classed should not be able to change state of variables directly, if we want to do that we should be able to do that only using methods
        //why ? because we do not want other class to hamper the individual property of that Object
        //Advantages of Encapsulation
        //  1.To prevent setting of bad data to a variable
        //  2.To perform multiple operations which can be used by multiple objects, thus avoiding code duplications
        //fix is to make variable private
        // a.speed = 10;
        //b.speed = 5;
        a.setSpeed(10);
        //b.setSpeed(5);

        ////Abstraction////
        //When I want to use any class we do not want to understand how it is running, we do not care how it does that
        //Abstraction in a way is highly related to encapsulation
        //We just allow to operate and provide no access to data inside it
        //eg : when we call setSpeed we do not want to  know how the setspeed method is assigning speed to the bike , we have just used that method and asked the method to  set speed for us


        ////Constructor////
        //Constructor is used to by default assign value to member variables of class,which creating its instance
        //Constructor is special type of method
        //No Return Type is required for Constructor
        //Name of constructor is same as of class
        //Constructor is used to set initial value of Object by assigning values to member varaibles
        //Java compiler provided you default constructor which does nothing i.e no assignment
        //As soon as you create a constructor , Java will not provide you by default constructor, you will have to create default constructor to access it like one below
        //eg : MotorBike a = new MotorBike();
        //eg
        MotorBike a1 = new MotorBike(100);
        MotorBike a2 = new MotorBike(200);



    }
}
