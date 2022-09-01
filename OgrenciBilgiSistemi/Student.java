public class Student {
    //Attributes
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    int not1;
    int not2;
    int not3;
    int sozluNot1;
    int sozluNot2;
    int sozluNot3;
    double averageMat;
    double averageFizik;
    double averageKimya;
    double averageGenel;



    //Constructors
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    //Methods
    void addBulkExamNote(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.not1 = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.not2 = not2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.not3 = not3;
        }
    }

    void addBulkExamSozluNote(int sozluNot1, int sozluNot2, int sozluNot3) {
        if (sozluNot1 >= 0 && sozluNot1 <= 100) {
            this.sozluNot1 = sozluNot1;
        }
        if (sozluNot2 >= 0 && sozluNot2 <= 100) {
            this.sozluNot2 = sozluNot2;
        }
        if (sozluNot3 >= 0 && sozluNot3 <= 100) {
            this.sozluNot3 = sozluNot3;
        }
    }



    void avarage() {
        this.averageMat = (this.not1 * 0.8) + (this.sozluNot1 * 0.2);
        this.averageFizik = (this.not2 * 0.8) + (this.sozluNot2 * 0.2);
        this.averageKimya = (this.not3 * 0.8) + (this.sozluNot3 * 0.2);
        this.averageGenel = (this.averageFizik + this.averageKimya + this.averageMat) / 3.0;
        System.out.println("Genel ortalama: "+ this.averageGenel);
    }

    void printNote(){
        System.out.println("Öğrenci : " + this.name);
        System.out.println(c1.name + " Notu:\t " + this.c1.yazili);
        System.out.println(c1.name + " Notu:\t " + this.c1.sozlu);
        System.out.println(c2.name + " Notu:\t " + this.c2.yazili);
        System.out.println(c2.name + " Notu:\t " + this.c2.sozlu);
        System.out.println(c3.name + " Notu:\t " + this.c3.yazili);
        System.out.println(c3.name + " Notu:\t " + this.c3.sozlu);
        System.out.println("Ortalamaniz:\t " + this.average);
    }
    void isPass(){
        if (this.averageGenel >= 50){
            System.out.println("Sinifi gectiniz");
            this.isPass = true;
        }
        else {
            System.out.println("Sinifta kaldiniz");
            this.isPass = false;
        }
    }
}
