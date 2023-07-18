package services;

import java.util.Collections;
import java.util.List;
import models.StudyStream;
import models.StudyStreamComparator;

public class StudyStreamService {
    public void sortStreams(List<StudyStream> streams) {
        StudyStreamComparator comparator = new StudyStreamComparator();
        Collections.sort(streams, comparator);
    }
}