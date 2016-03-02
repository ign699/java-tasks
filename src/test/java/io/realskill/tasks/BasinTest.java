package io.realskill.tasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BasinTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shoule_be_able_to_put_different_types_of_basins_into_generic_set() throws Exception
    {
        Lake titicacaLake = BasinFactory.getLake("Titicaca");
        Sea balticSea = BasinFactory.getSea("Baltic Sea");
        Ocean indianOcean = BasinFactory.getOcean("Indian Ocean");
        Sea arabianSea = BasinFactory.getSea("Arabian Sea", indianOcean);
        PondOfPontyPandy pondOfPontyPandy = new PondOfPontyPandy();

        assertEquals(indianOcean, arabianSea.getSurroundingBasin());
        assertNull(balticSea.getSurroundingBasin());

        final Set<Basin> basins = new HashSet<Basin>();
        basins.add(titicacaLake);
        basins.add(balticSea);
        basins.add(indianOcean);
        basins.add(arabianSea);
        basins.add(pondOfPontyPandy);

        assertEquals(5, basins.size());
    }
}
