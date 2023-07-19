package Pracs.OgrenciBilgiSistemi;

public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2,int note3){

        if(note1 >=0 && note1 <=100){
            this.c1.note = note1;
        }
        if(note2 >=0 && note2 <=100){
            this.c2.note = note2;
        }
        if(note3 >=0 && note3 <=100){
            this.c3.note = note3;
        }

    }

    void addBulkVerbExamNote(int verbNote1,int verbNote2,int verbNote3){

        if(verbNote1 >=0 && verbNote1 <=100){
            this.c1.verbNote = verbNote1;
        }
        if(verbNote2 >=0 && verbNote2 <=100){
            this.c2.verbNote = verbNote2;
        }
        if(verbNote3 >=0 && verbNote3 <=100){
            this.c3.verbNote = verbNote3;
        }
    }

    void isPass(){
        this.average=((this.c1.note*0.8+this.c1.verbNote*0.2)+(this.c2.note*0.8+this.c2.verbNote*0.2)
                +(this.c3.note*0.8+this.c3.verbNote*0.2))/3.0;
        if (this.average>=50){
            System.out.println("Sınıfı Geçti.");
            this.isPass = true;
        }else {
            System.out.println("Sınıfta Kaldı.");
        }
        printNote();
    }

    void printNote(){
        System.out.println("Öğrencinin adı : " + this.name);
        System.out.println( c1.name+" dersinin sınav notu : " + this.c1.note +" Sözlü Notu : "+this.c1.verbNote);
        System.out.println( c2.name+" dersinin sınav notu : " + this.c2.note +" Sözlü Notu : "+this.c2.verbNote);
        System.out.println( c3.name+" dersinin sınav notu : " + this.c3.note +" Sözlü Notu : "+this.c3.verbNote);
        System.out.println("Ortalama : "+this.average);
    }
}
