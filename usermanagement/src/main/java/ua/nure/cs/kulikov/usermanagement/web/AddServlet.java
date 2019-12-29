package ua.nure.cs.kulikov.usermanagement.web;

import ua.nure.cs.kulikov.usermanagement.db.DaoFactory;
import ua.nure.cs.kulikov.usermanagement.db.DatabaseException;
import ua.nure.cs.kulikov.usermanagement.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends EditServlet {
    private static final String ADD_JSP = "/add,jsp";

    @Override
    protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher(ADD_JSP).forward(req, resp);
    }

    @Override
    protected void processUser(User user) throws ReflectiveOperationException, DatabaseException {
        DaoFactory.getInstance().getUserDao().create(user);
    }
}
