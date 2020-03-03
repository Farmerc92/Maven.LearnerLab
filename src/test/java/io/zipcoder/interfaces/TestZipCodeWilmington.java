package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        double expectedHours = 1.0;
        ZipCodeWilmington zcw = ZipCodeWilmington.getINSTANCE();
        Instructor instructor = Instructors.getINSTANCE().findById(0L);
        Students cohort = Students.getINSTANCE();
        double hoursToBeLectured = expectedHours * cohort.count();

        zcw.hostLecture(Educator.DOLIO.instructor, hoursToBeLectured);
        Student[] cohortArray = cohort.toArray();

        for (int i = 0; i < cohortArray.length; i++) {
            Student s = cohortArray[i];
            double hoursStudied = s.getTotalStudyTime();

            Assert.assertEquals(expectedHours, hoursStudied, 0.0);
        }
    }
}
