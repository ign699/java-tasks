package io.realskill.tasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class OceanTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void constructor_withNameAndBasin_shouldNotExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.Ocean.<init>(java.lang.String, io.realskill.tasks.Basin)");
        Ocean.class.getConstructor(String.class, Basin.class);
    }

    @Test
    public void constructor_withName_shouldExist() throws Exception
    {
        final Ocean ocean = new Ocean("Baltic Ocean");
        assertEquals("Baltic Ocean", ocean.getName());
        assertNull(ocean.getSurroundingBasin());
    }

    @Test
    public void constructor_withNameAndLake_shouldNotExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.Ocean.<init>(java.lang.String, io.realskill.tasks.Lake)");
        Ocean.class.getConstructor(String.class, Lake.class);
    }

    @Test
    public void constructor_withNameAndBigBasin_shouldNotExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.Ocean.<init>(java.lang.String, io.realskill.tasks.BigBasin)");
        Ocean.class.getConstructor(String.class, BigBasin.class);
    }
}
