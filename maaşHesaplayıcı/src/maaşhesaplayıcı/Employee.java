package maaşhesaplayıcı;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    public Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax () {
        if (this.salary >= 1000) {
            return (this.salary * 3) / 100;
        } else {
            return 0;
        } 
    }
    
    public double bonus () {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    
    public double raiseSalary () {
        if ((2021 - this.hireYear) < 10) {
            return (this.salary * 5) / 100;
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            return (this.salary * 10) / 100;
        } else {
            return (this.salary * 15) / 100;
        }
    }
    
    public void toStringP () {
        System.out.println("Adı:" + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Toplam Maaş: " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
