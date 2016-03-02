package io.realskill.tasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AbstractBasinTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void constructor_noArgs_notExist() throws Exception
    {
        expectedException.expect(NoSuchMethodException.class);
        expectedException.expectMessage("io.realskill.tasks.AbstractBasin.<init>()");
        assertNotNull(AbstractBasin.class.getConstructor());
    }

    @Test
    public void constructor_withNameAndBasin_exists() throws Exception
    {
        assertNotNull(AbstractBasin.class.getConstructor(String.class, Basin.class));
    }

    @Test
    public void constructor_withName_exists() throws Exception
    {
        assertNotNull(AbstractBasin.class.getConstructor(String.class));
    }

    @Test
    public void isPartOfBiggerBasin_whenPartOfLargerBasing_returnsTrue() throws Exception
    {
        //        Given
        final AbstractBasin basin = new AbstractBasin("Small", new AbstractBasin("Big") {
            public Basin getSurroundingBasin()
            {
                return null;
            }
        }) {
            public Basin getSurroundingBasin()
            {
                return surroundingBasin;
            }
        };

        //        When
        final boolean result = basin.isPartOfBiggerBasin();

        //        Then
        assertTrue(result);
    }

    @Test
    public void isPartOfBiggerBasin_whenNOTPartOfLargerBasing_returnsFalse() throws Exception
    {
        //        Given
        final AbstractBasin basin = new AbstractBasin("Big") {
            public Basin getSurroundingBasin()
            {
                return null;
            }
        };

        //        When
        final boolean result = basin.isPartOfBiggerBasin();

        //        Then
        assertFalse(result);
    }
}
