package io.realskill.tasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LakeTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void constructor_withNameAndBasin_shouldNotExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.Lake.<init>(java.lang.String, io.realskill.tasks.Basin)");
        Lake.class.getConstructor(String.class, Basin.class);
    }

    @Test
    public void constructor_withName_exists() throws Exception
    {
        final Lake titicaca = new Lake("Titicaca");
        assertEquals("Titicaca", titicaca.getName());
        assertNull(titicaca.getSurroundingBasin());
    }

    @Test
    public void toString_always_addsLakeWord() throws Exception
    {
        //        Given
        Lake titicacaLake = BasinFactory.getLake("Titicaca");

        //        When
        final String result = titicacaLake.toString();

        //        Then
        assertEquals("Titicaca lake is not part of any larger basin", result);
    }
}
