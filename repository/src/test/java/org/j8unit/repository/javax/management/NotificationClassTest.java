package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationClassTest
implements org.j8unit.repository.javax.management.NotificationClassTests<javax.management.Notification> {

    @Override
    public Class<javax.management.Notification> createNewSUT() {
        return javax.management.Notification.class;
    }

}
