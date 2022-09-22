package org.launchcode.techjobs.oo.test;

import com.sun.jdi.Value;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.launchcode.techjobs.oo.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
       Job object = new Job();
       Job object2 = new Job();
        assertNotEquals(object.getId(), object2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
    Job object3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(object3.getName() instanceof String);
        assertEquals("Product tester", object3.getName());
        assertTrue(object3.getEmployer() instanceof Employer);
        assertEquals("ACME", object3.getEmployer().getClass());
        assertTrue(object3.getLocation() instanceof Location);
        assertEquals("Desert", object3.getLocation().getClass());
        assertTrue(object3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", object3.getPositionType().getClass());
        assertTrue(object3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", object3.getCoreCompetency().getClass());
    }

    @Test
    public void testJobsForEquality() {
    Job object4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job object5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(object4.equals(object5));


    }
    @Test
    public void testToString() {
        Job object6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertEquals("\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCoreCompetency: Persistence\n", object6.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job object7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
          assertEquals('\n', object7.toString().charAt(0));
          assertEquals('\n', object7.toString().charAt(object7.toString().length()-1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job object6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n", object6.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job object6 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("\nID: 1\nName: Product tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Data not available\nCore Competency: Persistence\n", object6.toString());
    }

    @Test
    public void  testCoreCompetencyExtendsJobField() {

    }
}
