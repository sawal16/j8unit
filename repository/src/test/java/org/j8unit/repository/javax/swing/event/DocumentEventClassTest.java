package org.j8unit.repository.javax.swing.event;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.event.DocumentEvent.EventType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentEventClassTest
implements org.j8unit.repository.javax.swing.event.DocumentEventClassTests<DocumentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentEvent]

    @Override
    public Class<DocumentEvent> createNewSUT() {
        return DocumentEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentEvent]

    @RunWith(J8Unit4.class)
    public static class EventTypeClassTest
    implements org.j8unit.repository.javax.swing.event.DocumentEventClassTests.EventTypeClassTests<EventType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentEvent$EventType]

        @Override
        public Class<EventType> createNewSUT() {
            return EventType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentEvent$EventType]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentEvent$EventType]

    }

    @RunWith(J8Unit4.class)
    public static class ElementChangeClassTest
    implements org.j8unit.repository.javax.swing.event.DocumentEventClassTests.ElementChangeClassTests<ElementChange> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentEvent$ElementChange]

        @Override
        public Class<ElementChange> createNewSUT() {
            return ElementChange.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentEvent$ElementChange]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentEvent$ElementChange]

    }

}
