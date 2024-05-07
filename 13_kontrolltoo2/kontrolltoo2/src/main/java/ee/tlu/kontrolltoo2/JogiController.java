package ee.tlu.kontrolltoo2;

import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JogiController {
    JogiRepository jogiRepository;
    public JogiController(JogiRepository jogiRepository){
        this.jogiRepository = jogiRepository;
    }

    @GetMapping("joed")
    public List<JogiEntity> saaJoed(){
        return jogiRepository.findAll();
    }

    @PostMapping("joed")
    public List<JogiEntity> LisaJogi(@RequestBody JogiEntity jogiEntity){
        jogiRepository.save(jogiEntity);
        return jogiRepository.findAll();
    }

    @DeleteMapping("joed/{nimi}")
    public List<JogiEntity> KustutaJogi(@PathVariable String nimi){
        jogiRepository.deleteById(nimi);
        return jogiRepository.findAll();
    }

    // lähtme ja suudme vahelise kauguse leidmiseks
    @GetMapping("joed/{id}/kaugus")
    public double leiaKaugus(@PathVariable Long id) {
        JogiEntity jogi = jogiRepository.findById(String.valueOf(id)).orElseThrow(() -> new RuntimeException("Jõge ei leitud!"));

        double xVaheRuut = Math.pow(jogi.getSuudmeX() - jogi.getLahtmeX(), 2);
        double yVaheRuut = Math.pow(jogi.getSuudmeY() - jogi.getLahtmeY(), 2);
        double kaugus = Math.sqrt(xVaheRuut + yVaheRuut);

        return kaugus;
    }

    // kõige kiirem jõgi
    @GetMapping("joed/kiireim")
    public JogiEntity leiaKiireimJogi() {
        List<JogiEntity> joed = jogiRepository.findAll();
        joed.sort(Comparator.comparingDouble(JogiEntity::getKiirus).reversed());
        return joed.get(0);
    }

    // kõige aeglasem jõgi
    @GetMapping("joed/aeglaseim")
    public JogiEntity leiaAeglasemJogi() {
        List<JogiEntity> joed = jogiRepository.findAll();
        joed.sort(Comparator.comparingDouble(JogiEntity::getKiirus));
        return joed.get(0);
    }

}
