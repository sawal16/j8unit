package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Document;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Document} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.DocumentClassTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentClassTest
implements DocumentClassTests<Document> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Document]

    @Override
    public Class<Document> createNewSUT() {
        return Document.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Document]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Document]

}
