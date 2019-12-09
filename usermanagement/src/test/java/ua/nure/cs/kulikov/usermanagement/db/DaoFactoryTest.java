package ua.nure.cs.kulikov.usermanagement.db;

import junit.framework.Assert;
import junit.framework.TestCase;
import ua.nure.cs.kulikov.usermanagement.domain.User;

public class DaoFactoryTest extends TestCase {

    public void testGetUserDao() {
        DaoFactory daoFactory = DaoFactory.getInstance();
        Assert.assertNotNull(daoFactory);
        Dao<User> userDao;
        try {
            userDao = daoFactory.getUserDao();
            Assert.assertNotNull(userDao);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }
}
