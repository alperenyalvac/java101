package notsistemi;
public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matS;
    Course fizikS;
    Course kimyaS;
    double avarage;
    boolean isPass;
    
    public Student (String name, int classes, String stuNo, Course mat, Course matS, Course fizik, Course fizikS, Course kimya, Course kimyaS) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.matS = matS;
        this.fizik = fizik;
        this.fizikS = fizikS;
        this.kimya = kimya;
        this.kimyaS = kimyaS;
        calcAvarage();
        this.isPass = false;
    }
    
    public void addBulkExamNote (int mat, int matS, int fizik, int fizikS, int kimya, int kimyaS) {
        if (mat >= 0 && mat <= 100) {
            if (matS >= 0 && matS <= 100) {
            this.mat.note = ((mat * 8) / 10) + ((matS * 2) / 10);
            }
        }
        
        if (fizik >= 0 && fizik <= 100) {
            if (fizikS >= 0 && fizikS <= 100) {
            this.fizik.note = ((fizik * 8) / 10) + ((fizikS * 2) / 10);
            }
        }
        
        if (kimya >= 0 && kimya <= 100) {
            if (kimyaS >= 0 && kimyaS <= 100) {
            this.kimya.note = ((kimya * 8) / 10) + ((kimyaS * 2) / 10);
            }
        }
    }
    
    public void isPass () {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti. ");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }
    
    public void calcAvarage () {
this.avarage = (this.mat.note + this.fizik.note + this.kimya.note) / 3;
}

public boolean isCheckPass () {
calcAvarage();
return this.avarage > 55;
}

public void printNote() {
    System.out.println("================");
    System.out.println("Öğrenci: " + this.name);
    System.out.println("Matematik Notu: " + this.mat.note);
    System.out.println("Fizik Notu: " + this.fizik.note);
    System.out.println("Kimya Notu: " + this.kimya.note);
}
}

