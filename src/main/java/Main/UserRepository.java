package Main;

import Main.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by liqiang on 2018/7/18 23:35.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
