package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialJavaObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialJavaObjectTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialJavaObjectTests<SerialJavaObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.serial.SerialJavaObject]

    @Override
    public SerialJavaObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.rowset.serial.SerialJavaObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.serial.SerialJavaObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.serial.SerialJavaObject]

}
