package lt.techin.karolina.exam.blogging.dao;

import lt.techin.karolina.exam.blogging.model.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<BlogEntity, Long> {

}
