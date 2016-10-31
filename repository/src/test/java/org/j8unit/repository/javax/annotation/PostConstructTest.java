package org.j8unit.repository.javax.annotation;

import javax.annotation.PostConstruct;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PostConstructTest
implements org.j8unit.repository.javax.annotation.PostConstructTests<PostConstruct> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.PostConstruct]

    @Override
    public PostConstruct createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.PostConstruct], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.PostConstruct]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.PostConstruct]

}
