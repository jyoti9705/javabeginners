public class Student implements Comparable<Student> {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        //we will have tp specify with which value we want to sort
        return Integer.compare(this.id, that.id);
    }
}
