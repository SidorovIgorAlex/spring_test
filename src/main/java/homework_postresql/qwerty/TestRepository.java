package homework_postresql.qwerty;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findByNumber(Integer number);
}
