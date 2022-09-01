public class Teacher {
    //Attributes
    String name;
    String mpno;
    String branch;

    //Constructors
    Teacher(String name, String branch, String mpno){
        this.name = name;
        this. mpno = mpno;
        this.branch = branch;
    }

    //Methods
    void print(){
        System.out.println("Adi: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bolumu: " + this.branch);
    }
}
