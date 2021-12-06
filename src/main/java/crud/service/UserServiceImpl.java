package crud.service;

import crud.dao.UserDAO;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Transactional(readOnly = true)
    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    @Override
    public void removeUser(Long id) {
        userDAO.removeUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user, Long id) {
        userDAO.updateUser(user, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
