package homework_postresql.qwerty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    TestRepository testRepository;

    @GetMapping
    public List<Test> findAll() {
        return testService.findAll();
    }

    @GetMapping("/find/{id}")
    public List<Test> findById(@PathVariable Integer id) {
        return testService.findByNumber(id);
    }


    @GetMapping("/insert")
    public Test createEmployee() {

        for (int i = 0; i < 10000; i++) {

            Random rand = new Random();

            int randomNum = rand.nextInt((100 - 1) + 1) + 1;

            Test test = new Test(randomNum);

            testRepository.save(test);
        }
        return null;
    }

    @GetMapping("/select")
    public void selectEmployee() {
        for (int i = 0; i < 10000; i++) {
            testRepository.findAll();
            testRepository.findByNumber(i);
        }
    }

}
