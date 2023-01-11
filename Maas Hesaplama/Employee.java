public class Employee {
    String name;
    double salary;
    int workHours;
    int currentYear;

    Employee(String name, double salary, int workHours,int currentYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.currentYear = currentYear;
    }

    public double tax (){
        double tax = 0;
        if (this.salary >= 1000)
            tax = this.salary * 0.03;
        return tax;
    }

    public double bonus(){
        double bons = 0;
        if (this.workHours > 40){
            for (int i = this.workHours; i > 40; i--){
                bons =+ 30;
            }
        }
            return bons;
    }

    public double raiseSalary(){
        int year = 2021;
        double zam = 0.0;
        int kacYil = year - this.currentYear;
        if (kacYil <= 9)
            zam = this.salary * 0.05;
        if (kacYil >= 10 && kacYil <= 19)
            zam = this.salary * 0.10;
        if (kacYil >= 20)
            zam = this.salary * 0.15;
        return zam;
    }

    public void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("İşe Başlama Yılı : " + this.currentYear);
        System.out.println("Vergi = " + tax());
        System.out.println("Bonus = " + bonus());
        System.out.println("Maaş Artışı = " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + ((this.salary - tax()) + bonus()));
        System.out.println("Toplam Maaş : " + ((this.salary - tax()) + bonus() + raiseSalary()));
    }

}
