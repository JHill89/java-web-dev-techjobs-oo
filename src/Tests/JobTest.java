package Tests;

import org.junit.Before;
import org.junit.Test;

//import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job first_test_job;
    Job second_test_job;
    Job test_constructor_sets_all_fields;
    Job test_jobs_for_equality_1;
    Job test_jobs_for_equality_2;

    @Before
    public void createJobObjects() {
        first_test_job = new Job();
        second_test_job = new Job();
        test_constructor_sets_all_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control") , new CoreCompetency("Persistence"));
        test_jobs_for_equality_1 = new Job("Job", new Employer("LaunchCode"), new Location("STL"), new PositionType("TA"), new CoreCompetency("Java"));
        test_jobs_for_equality_2 = new Job("Job", new Employer("LaunchCode"), new Location("STL"), new PositionType("TA"), new CoreCompetency("Java"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(first_test_job.equals(second_test_job));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_constructor_sets_all_fields instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_jobs_for_equality_1.equals(test_jobs_for_equality_2));
    }
}
