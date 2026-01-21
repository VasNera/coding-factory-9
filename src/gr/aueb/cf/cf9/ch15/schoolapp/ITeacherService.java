package gr.aueb.cf.cf9.ch15.schoolapp;

/**
 * provides most common CRUD operations.
 */

public interface ITeacherService {

    void addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void removeTeacher(long id);

    Teacher getTeacherById( long id);

    Teacher[] getAllTeachers();
}
