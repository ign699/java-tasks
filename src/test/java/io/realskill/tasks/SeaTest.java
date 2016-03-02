package io.realskill.tasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SeaTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void constructor_withNameAndOcean_shouldExist() throws Exception
    {
        final Ocean ocean = new Ocean("Atlantic Ocean");
        final Sea sea = new Sea("North Sea", ocean);
        assertEquals(ocean, sea.getSurroundingBasin());
    }

    @Test
    public void constructor_withName_shouldExist() throws Exception
    {
        final Sea sea = new Sea("Baltic Sea");
        assertEquals("Baltic Sea", sea.getName());
        assertNull(sea.getSurroundingBasin());
    }

    @Test
    public void constructor_withNameAndSea_shouldExist() throws Exception
    {
        final Sea sea = new Sea("a", new Sea("b"));
        assertEquals("a is part of b", sea.toString());
    }

    @Test
    public void constructor_withNameAndLake_shouldNotExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.Sea.<init>(java.lang.String, io.realskill.tasks.Lake)");
        Sea.class.getConstructor(String.class, Lake.class);
    }

    @Test
    public void constructor_withNameAndBasin_shouldNotExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.Sea.<init>(java.lang.String, io.realskill.tasks.Basin)");
        Sea.class.getConstructor(String.class, Basin.class);
    }

    @Test
    public void toString_whenNOTPartOfBiggerBasin_includesThatInfo() throws Exception
    {
        //        Given
        Sea balticSea = BasinFactory.getSea("Baltic Sea");

        //        When
        final String result = balticSea.toString();

        //        Then
        assertEquals("Baltic Sea is not part of any larger basin", result);
    }

    @Test
    public void toString_whenPartOfBiggerBasin_includesThatBasinName() throws Exception
    {
        //        Given
        Sea arabianSea = BasinFactory.getSea("Arabian Sea", new Ocean("Indian Ocean"));

        //        When
        final String result = arabianSea.toString();

        //        Then
        assertEquals("Arabian Sea is part of Indian Ocean", result);
    }

    @Test
    public void getSurroundingBasin_always_returnsBigBasin() throws Exception
    {
        //        Given

        //        When

        //        Then
        assertTrue(BigBasin.class.isAssignableFrom(Sea.class.getMethod("getSurroundingBasin").getReturnType()));
    }
}
