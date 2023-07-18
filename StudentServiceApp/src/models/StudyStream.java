package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyStream implements Iterator<StudyGroup> {
    protected List<StudyGroup> studyGroups;
    private int currentIndex = 0;

    public StudyStream() {
        studyGroups = new ArrayList<>();
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        studyGroups.add(studyGroup);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < studyGroups.size();
    }

    @Override
    public StudyGroup next() {
        return studyGroups.get(currentIndex++);
    }

    @Override
    public void remove() {
        studyGroups.remove(currentIndex - 1);
        currentIndex--;
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }
}