package com.autohome.pinche.test;

import com.autohome.pinche.Endpoint;
import com.autohome.pinche.Line;
import com.autohome.pinche.TimeOrienting;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by Administrator on 2015/1/17.
 */
public class TimeOrientingTest {

    private Line line = new Line();
    private TimeOrienting orienting;

    @Before
    public void before() {
        line.setHome(new Endpoint("青塔秀园", 1.0, 2.0), "6:00");
        line.setCompany(new Endpoint("中国电子大厦", 10.0, 12.0), "18:00");
        orienting = new TimeOrienting(line);
    }

    @Test
    public void testGetStart() {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        if (hour > 12) {
            Assert.assertEquals(orienting.getStart(), line.getHome());
        }
        else {
            Assert.assertEquals(orienting.getStart(), line.getCompany());
        }
    }
}
