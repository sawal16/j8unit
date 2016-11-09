package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Document} (by simply reusing the J8Unit
 * test interface {@link DocumentClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentClassTest
implements DocumentClassTests<Document> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Document]

    @Override
    public Class<Document> createNewSUT() {
        return Document.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.Document]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Document]

}
