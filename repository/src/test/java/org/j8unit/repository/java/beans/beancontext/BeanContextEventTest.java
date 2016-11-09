package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextEvent} (by simply reusing
 * the J8Unit test interface {@link BeanContextEventTests}).
 */

@RunWith(J8Unit4.class)
public class BeanContextEventTest
implements BeanContextEventTests<BeanContextEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextEvent]

    @Override
    public BeanContextEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextEvent]

}
