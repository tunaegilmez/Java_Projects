public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut","TRH","44444");
        Teacher t2 = new Teacher("Osman","FZK","00000");
        Teacher t3 = new Teacher("Ayşe","MAT","88888");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102", "FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik" , "101" , "MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Tuna","123","2",tarih,fizik,matematik);
        s1.addBulkExamNote(50,100,78);
        s1.isPass();

        Student s2 = new Student("Batuhan","321","3",tarih,fizik,matematik);
        s2.addBulkExamNote(70,60,98);
        s2.isPass();
    }
}