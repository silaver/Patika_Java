public class Course {
    //Attributes
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    //Constructor
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
    }
    //Methods
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Ogretmen ve Ders Bolumleri uyusmuyor!");
        }

    }
    void printTeacherInfo(){
        this.teacher.print(); //diger sinifin ozelliklerini alabiliyoruz
        //ctrl ile metoda tikladiginda oraya yonlendiriyor
    }

}
