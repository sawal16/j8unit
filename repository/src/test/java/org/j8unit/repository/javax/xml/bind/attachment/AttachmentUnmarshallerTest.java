package org.j8unit.repository.javax.xml.bind.attachment;

import javax.xml.bind.attachment.AttachmentUnmarshaller;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttachmentUnmarshallerTest
implements org.j8unit.repository.javax.xml.bind.attachment.AttachmentUnmarshallerTests<AttachmentUnmarshaller> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentUnmarshaller]

    @Override
    public AttachmentUnmarshaller createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.attachment.AttachmentUnmarshaller], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentUnmarshaller]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.attachment.AttachmentUnmarshaller]

}
