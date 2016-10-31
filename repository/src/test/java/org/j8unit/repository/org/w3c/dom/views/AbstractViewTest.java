package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.views.AbstractView;

@RunWith(J8Unit4.class)
public class AbstractViewTest
implements org.j8unit.repository.org.w3c.dom.views.AbstractViewTests<AbstractView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.views.AbstractView]

    @Override
    public AbstractView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.views.AbstractView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.views.AbstractView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.views.AbstractView]

}
