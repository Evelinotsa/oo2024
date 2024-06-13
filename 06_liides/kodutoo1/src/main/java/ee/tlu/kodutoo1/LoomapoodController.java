package ee.tlu.kodutoo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class LoomapoodController {
    @Autowired
    LoomapoodRepository loomapoodRepository;

    @GetMapping("loomapood")
    public List<Loomapood> getLoomapood() {
        return loomapoodRepository.findAll();
    }

    @DeleteMapping("loomapood/{id}")
    public List<Loomapood> deleteLoomapood(@PathVariable Long id) {
        loomapoodRepository.deleteById(id);
        return loomapoodRepository.findAll();
    }

    @PostMapping("loomapood")
    public List<Loomapood> addLoomapood(@RequestBody Loomapood loomapood) {
        loomapoodRepository.save(loomapood);
        return loomapoodRepository.findAll();
    }

}
