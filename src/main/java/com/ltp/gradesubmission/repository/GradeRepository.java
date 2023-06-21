package com.ltp.gradesubmission.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.ltp.gradesubmission.pojo.Grade;


@Repository
public class GradeRepository {

    private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return new Grade(studentGrades.get(index));
    }

    public void addGrade(Grade grade) {
        studentGrades.add(new Grade(grade));
    }

    public void updateGrade(Grade grade, int index) {
        studentGrades.set(index, new Grade(grade));
    }

    public List<Grade> getGrades() {

        List<Grade> returnStudentGrades = new ArrayList<>();

        for (int i = 0; i < studentGrades.size(); i++) {
            returnStudentGrades.add(this.getGrade(i));
        }
        return returnStudentGrades;
    }

}
