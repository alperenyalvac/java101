package notsistemi;
public class Main {

    public static void main(String[] args) {
        Course mat = new Course ("Matematik", " MAT 101", "MAT");
        Course fizik = new Course ("Fizik", "FZK 101", "FZK");
        Course kimya = new Course ("Kimya", "KMY 101", "KMY");
        
        Teacher t1 = new Teacher("Mahmut Hoca", "900", "MAT");
        Teacher t2 = new Teacher("Behçet Hoca", "901", "FZK");
        Teacher t3 = new Teacher("Yakup Hoca", "902", "KMY");
        
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        
        Student s1 = new Student("İnek Şaban", 4, "1111", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40, 20, 40, 60);
        s1.isPass();
        
        Student s2 = new Student("Güdük Necmi", 4, "1112", mat, fizik, kimya);
        s2.addBulkExamNote(30, 40, 50, 60, 70, 80);
        s2.isPass();
        
        Student s3 = new Student("Hayta İsmail", 4, "1113", mat, fizik, kimya);
        s3.addBulkExamNote(50, 60, 70, 80, 90, 100);
        s3.isPass();
    }

}
