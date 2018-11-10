package us.kpatrick.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;
import us.kpatrick.Subject;

import static org.junit.Assert.*;


public class SubjectTest {
    Subject s;

    @org.junit.Before
    public void setUp() throws Exception {
        s = new Subject();
        s.setState(5);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getState() {
        assertTrue(s.getState() == 5);
        assertFalse(s.getState() == 9);
    }
}
