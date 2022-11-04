public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name , String branch , String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Öretmen : "+ this.name);
        System.out.println("Telefon : " + this.mpno);
        System.out.println("Bölüm : "+ this.branch);
    }
}
