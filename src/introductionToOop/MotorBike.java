public class MotorBike {

    //member variable specific to object
    private int speed ;

    //Constructor
    public MotorBike(int speed) {
        this.speed = speed;
    }

    //Default Constructor
    //You can access Constructor you created from default by using this
    public MotorBike() {
        //this(5);
    }

    //Getter
    public int getSpeed() {
        return speed;
    }

    //Setter
    public void setSpeed(int speed) {
        //System.out.println(speed);//10
        //why is below sysout printing 0 ? it is because the above speed value which we are printing is the value this function received from the caller
        //whereas this.speed  is the default value of private speed member variable which we declared , as we have yet not assigned the incoming speed value to member variable it is printing 0
        //System.out.println(this.speed);//0
        this.speed = speed;
    }




    void start(){
      System.out.println("Started");

    }
}
