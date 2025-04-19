package Tp3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DB_APITest {
    private DB_API dbApi;

    @Before
    public void setUp() {
        dbApi = new DB_API();
    }

    // Test only the combinations that complete within 1500ms
    @Test(timeout = 1500)
    public void testFastConnections() {
        assertTrue("USA with Oracle should succeed", dbApi.DBconnect("Oracle", "USA"));
        assertFalse("Algeria with MySQL should fail", dbApi.DBconnect("MySQL", "Algeria"));
        assertTrue("USA with MySQL should succeed", dbApi.DBconnect("MySQL", "USA"));
        assertFalse("Algeria with SQLServer should fail", dbApi.DBconnect("SQLServer", "Algeria"));
    }

    // Separate tests for slower connections
    @Test
    public void testOracleAlgeriaConnection() {
        assertTrue(dbApi.DBconnect("Oracle", "Algeria"));
    }

    @Test
    public void testOracleFranceConnection() {
        assertFalse(dbApi.DBconnect("Oracle", "France"));
    }

    @Test
    public void testMySQLFranceConnection() {
        assertTrue(dbApi.DBconnect("MySQL", "France"));
    }

    @Test
    public void testSQLServerFranceConnection() {
        assertFalse(dbApi.DBconnect("SQLServer", "France"));
    }

    @Test
    public void testSQLServerUSAConnection() {
        assertTrue(dbApi.DBconnect("SQLServer", "USA"));
    }
}