package Tests;

import org.junit.Before;
import org.junit.Test;

//import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job first_test_job;
    Job second_test_job;
    Job test_job_instance;
    Job test_jobs_for_equality_1;
    Job test_empty_fields;


    @Before
    public void createJobObjects() {
        first_test_job = new Job();
        second_test_job = new Job();
        test_job_instance = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control") , new CoreCompetency("Persistence"));
        test_jobs_for_equality_1 = new Job("Job", new Employer("LaunchCode"), new Location("STL"), new PositionType("TA"), new CoreCompetency("Java"));
        test_empty_fields = new Job("Job", new Employer(""), new Location(null), new PositionType("TA"), new CoreCompetency("Java"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(first_test_job.equals(second_test_job));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job_instance instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_jobs_for_equality_1.equals(test_job_instance));
    }



    @Test
    public void testToStringForBlankLines() {
        //TODO
        assertTrue(test_job_instance.toString().startsWith("\n") && test_job_instance.toString().endsWith("\n"));
    }

    @Test
    public void testFormat() {
        String expectedReturnFormat = String.format("\nID: %d\n" + "Name: %s\n" + "Employer: %s\n" + "Location: %s\n" + "Position Type: %s\n" + "Core Competency: %s\n", test_job_instance.getId(), test_job_instance.getName(), test_job_instance.getEmployer(), test_job_instance.getLocation(), test_job_instance.getPositionType(), test_job_instance.getCoreCompetency());
        assertEquals(expectedReturnFormat, test_job_instance.toString());
    }

    @Test
    public void testEmptyFields() {
        String expectedReturnFormat = String.format("\nID: %d\n" + "Name: %s\n" + "Employer: %s\n" + "Location: %s\n" + "Position Type: %s\n" + "Core Competency: %s\n", test_empty_fields.getId(), test_empty_fields.getName(), "Data not available", "Data not available", test_empty_fields.getPositionType(), test_empty_fields.getCoreCompetency());
        assertEquals(expectedReturnFormat, test_empty_fields.toString());
    }
}
