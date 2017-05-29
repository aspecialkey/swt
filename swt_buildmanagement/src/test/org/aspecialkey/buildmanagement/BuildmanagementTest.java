package org.aspecialkey.buildmanagement;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by KK on 22.05.2017.
 * Test-Klasse für JUNIT-Tests
 */
public class BuildmanagementTest {
    /**
     * testet die Methode 'add'
     * @throws Exception
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("test Add method");
        assertEquals(5, new Buildmanagement().add(2, 3));
    }

}