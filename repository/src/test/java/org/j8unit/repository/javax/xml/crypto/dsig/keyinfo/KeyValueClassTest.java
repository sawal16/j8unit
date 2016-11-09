package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyValue} (by simply reusing the J8Unit
 * test interface {@link KeyValueClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyValueClassTest
implements KeyValueClassTests<KeyValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyValue]

    @Override
    public Class<KeyValue> createNewSUT() {
        return KeyValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyValue]

}
