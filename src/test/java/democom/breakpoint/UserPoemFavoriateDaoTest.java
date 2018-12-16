package democom.breakpoint;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import democome.breakpoint.BreakpointApplication;
import democome.breakpoint.dao.UserPoemFavoriteDao;
import democome.breakpoint.model.UserPoemFavorite;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BreakpointApplication.class)
public class UserPoemFavoriateDaoTest {

	@Autowired
	private UserPoemFavoriteDao userPoemFavoriateDao;

	/**
	 * 查询user
	 */
	@Test
	public void select() {
		try {
			List<UserPoemFavorite> list = userPoemFavoriateDao.findByUserId(1L);

			System.err.println("user name is :" + list.get(0).getPoem().getContent());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
