package org.j8unit.repository.javax.print.attribute.standard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import javax.print.attribute.standard.DateTimeAtProcessing;
import org.junit.Test;

/**
 * @since 0.9.7
 */
public class DateTimeAtProcessingClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = DateTimeAtProcessing.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(DateTimeAtProcessing.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        DateTimeAtProcessing.class.getDeclaredMethod("hashCode");
    }

}
