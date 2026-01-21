package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService {
    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher add successfully.");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher Updated successfully.");

    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher Removed successfully.");

    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1, "Athanasios", " Androutsos");
    }

    @Override
    public Teacher[] getAllTeachers() {
        return new Teacher[]{
                new Teacher(1, "Athanasios", "Androutsos"),
        new Teacher(2, "Vasileios", "Neratzis"),
        new Teacher(3, "Andreas", "Alexopoulos"),
        new Teacher(4, "Kostas", "Kostoulas")

    };

    }
}