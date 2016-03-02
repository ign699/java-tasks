package io.realskill.tasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertSame;

public class BayTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getSurroundingBasin_always_returnsWhatWasPassedInConstructor() throws Exception
    {
        //        Given
        final Ocean ocean = new Ocean("Indian Ocean");
        final Bay bay = new Bay("Bay of Bengal", ocean);

        //        When
        final Basin surroundingBasin = bay.getSurroundingBasin();

        //        Then
        assertSame(ocean, surroundingBasin);
    }

    @Test
    public void constructor_whenBasinIsLake_throwsException() throws Exception
    {
        //        Given
        expectedException.expect(IllegalArgumentException.class);
        //        When
        new Bay("Bay of Bengal", new Lake("Titicaca"));
    }

    @Test
    public void mutate_shouldNotBeAbleToAccess_nameField() throws Exception
    {
        //        Given
        final Bay bay = new Bay("", new Ocean(""));
        expectedException.expect(NoSuchFieldException.class);
        expectedException.expectMessage("name");
        //        When
        bay.mutate();
    }
}
