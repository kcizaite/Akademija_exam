package lt.techin.karolina.exam.blogging.dao;

import lt.techin.karolina.exam.blogging.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
