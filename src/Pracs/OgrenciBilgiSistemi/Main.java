package Pracs.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "050655546","TRH");

        Teacher t2 = new Teacher("Graham Bell","34676133","FZK");

        Teacher t3 = new Teacher("Mehmet Uyanık","354687641","MAT");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik","103","MAT");
        matematik.addTeacher(t3);

        Student student1=new Student("Ahmet Keskin","1345","2",tarih,fizik,matematik);
        student1.addBulkExamNote(87,74,63);
        student1.addBulkVerbExamNote(100,75,90);

        student1.isPass();

        Student student2=new Student("Ali Yıldırım","1925","1",tarih,fizik,matematik);
        student2.addBulkExamNote(37,44,53);
        student2.addBulkVerbExamNote(50,45,65);

        student2.isPass();
    }
}
