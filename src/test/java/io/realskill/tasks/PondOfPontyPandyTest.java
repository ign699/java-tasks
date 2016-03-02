package io.realskill.tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PondOfPontyPandyTest {

    @Test
    public void hasNothingToDoWith_AbstractBasin() throws Exception
    {
        PondOfPontyPandy pondOfPontyPandy = new PondOfPontyPandy();

        assertFalse(pondOfPontyPandy.getClass().isAssignableFrom(AbstractBasin.class));
        assertFalse(AbstractBasin.class.isAssignableFrom(pondOfPontyPandy.getClass()));
    }

    @Test
    public void implements_Basin_interface() throws Exception
    {
        assertTrue(Basin.class.isAssignableFrom(PondOfPontyPandy.class));
    }
}
