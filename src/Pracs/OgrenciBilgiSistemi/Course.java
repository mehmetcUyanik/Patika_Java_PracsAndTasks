package Pracs.OgrenciBilgiSistemi;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbNote;

    public Course(String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbNote = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }

    @Override
    public String toString() {
        return "Course{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", prefix='" + prefix + '\'' +
                ", note=" + note +
                '}';
    }
}
