package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MLetMBeanClassTest
implements org.j8unit.repository.javax.management.loading.MLetMBeanClassTests<javax.management.loading.MLetMBean> {

    @Override
    public Class<javax.management.loading.MLetMBean> createNewSUT() {
        return javax.management.loading.MLetMBean.class;
    }

}
