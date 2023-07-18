package models;

import java.util.Comparator;

public class StudyStreamComparator implements Comparator<StudyStream> {
    @Override
    public int compare(StudyStream stream1, StudyStream stream2) {
        return Integer.compare(stream1.getStudyGroups().size(), stream2.getStudyGroups().size());
    }
}