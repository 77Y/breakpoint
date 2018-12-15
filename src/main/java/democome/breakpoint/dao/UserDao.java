package democome.breakpoint.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import democome.breakpoint.model.User;

public interface UserDao extends JpaRepository<User, Long> {

}
