package democome.breakpoint.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import democome.breakpoint.model.UserPoemFavorite;

public interface UserPoemFavoriteDao extends JpaRepository<UserPoemFavorite, Long> {

	List<UserPoemFavorite> findByUserId(Long userId);
}
