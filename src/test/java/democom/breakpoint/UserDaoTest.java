package democom.breakpoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import democome.breakpoint.BreakpointApplication;
import democome.breakpoint.dao.UserDao;
import democome.breakpoint.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BreakpointApplication.class)
public class UserDaoTest {

	@Autowired
	private UserDao userDao;

	/**
	 * 插入user
	 */
	// @Test
	// public void insert() {
	// User user = new User();
	// user.setId(1L);
	// user.setName("democome");
	// user.setPassword("123");
	//
	// userDao.save(user);
	// }

	/**
	 * 查询user
	 */
	// @Test
	// public void select() {
	// User user = userDao.findById(1L).get();
	// System.err.println("user name is :" + user.getName());
	// }

	/**
	 * 根据用户名查询user
	 */
	// @Test
	// public void select() {
	// User user = userDao.findByName("democome");
	// System.err.println("user name is :" + user.getName());
	// }

	/**
	 * 修改user
	 */
	// @Test
	// public void update() {
	// User user = new User();
	// user.setId(1L);
	// user.setName("democome");
	// user.setPassword("123456");
	//
	// userDao.save(user);
	// }

	/**
	 * 删除user
	 */
	// @Test
	// public void delete() {
	// userDao.deleteById(1L);
	// }

}
