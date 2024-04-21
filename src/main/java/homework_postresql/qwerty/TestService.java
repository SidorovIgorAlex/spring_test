package homework_postresql.qwerty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Test> findAll() {
        return testRepository.findAll();
    }

    public List<Test> findByNumber(Integer id) {
        return testRepository.findByNumber(id);
    }
}
