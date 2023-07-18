package services;

import java.util.List;
import models.StudyStream;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public void removeStudentByName(String name) {
        studyGroupService.removeStudentByName(name);
    }

    public void sortStudentsById() {
        studyGroupService.sortStudentsById();
    }

    public void sortStudentsByFullName() {
        studyGroupService.sortStudentsByFullName();
    }

    private StudyStreamService studyStreamService;

    public Controller(StudyStreamService studyStreamService) {
        this.studyStreamService = studyStreamService;
    }

    public void sortStreams(List<StudyStream> streams) {
        studyStreamService.sortStreams(streams);
    }
}