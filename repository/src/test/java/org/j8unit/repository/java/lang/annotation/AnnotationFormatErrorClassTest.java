package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationFormatErrorClassTest
implements org.j8unit.repository.java.lang.annotation.AnnotationFormatErrorClassTests<java.lang.annotation.AnnotationFormatError> {

    @Override
    public Class<java.lang.annotation.AnnotationFormatError> createNewSUT() {
        return java.lang.annotation.AnnotationFormatError.class;
    }

}
