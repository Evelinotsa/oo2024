package ee.tlu.kodutoo1.controller;

import ee.tlu.kodutoo1.entity.LoomaEntity;
import ee.tlu.kodutoo1.repository.LoomaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class LoomaEntityController {
    LoomaRepository loomaRepository;

    public LoomaEntityController(LoomaRepository loomaRepository){
        this.loomaRepository = loomaRepository;
    }

    @GetMapping("loomad")
    public List<LoomaEntity> saaLoomad(){
        return loomaRepository.findAll();
    }

    //@RequestParam
    //localhost:8080/api/loomad?nimi=lõvi&populatsioon=32000&keskmineEluiga=15&keskmineKaal=130
    @PostMapping("loomad/{nimi}/{populatsioon}/{keskmineEluiga}/{keskmineKaal}")
    public List<LoomaEntity> lisaLoom(
            @PathVariable String nimi,
            @PathVariable int populatsioon,
            @PathVariable int keskmineEluiga,
            @PathVariable int keskmineKaal
    ) {
        LoomaEntity toiduaine = new LoomaEntity(nimi, populatsioon, keskmineEluiga, keskmineKaal);
        loomaRepository.save(toiduaine);
        return loomaRepository.findAll();
    }

    @PostMapping("loomad")
    public List<LoomaEntity> lisaLoom(@RequestBody LoomaEntity loomaEntity) {
        loomaRepository.save(loomaEntity);
        return loomaRepository.findAll();
    }

    @DeleteMapping("loomad/{nimi}")
    public List<LoomaEntity> kustutaLoom(@PathVariable String nimi){
        loomaRepository.deleteById(nimi);
        return loomaRepository.findAll();
    }

    @PutMapping("loomad/{index}/{nimi}/{populatsioon}/{keskmineEluiga}/{keskmineKaal}")
    public List<LoomaEntity> muudaLoom(
            @PathVariable int index,
            @PathVariable String nimi,
            @PathVariable int populatsioon,
            @PathVariable int keskmineEluiga,
            @PathVariable int keskmineKaal
    ){
        LoomaEntity loom = new LoomaEntity(nimi, populatsioon, keskmineEluiga, keskmineKaal);
        loomaRepository.save(loom);
        return loomaRepository.findAll();
    }

    @GetMapping("loomad-populatsioon-min/{minPopulatsioon}")
    public List<LoomaEntity> loomadMinPopulatsioon(@PathVariable int minPopulatsioon) {
        return loomaRepository.findAllByPopulatsioonGreaterThan(minPopulatsioon);
    }

    @GetMapping("loomad-keskmineeluiga/{min}/{max}")
    public List<LoomaEntity> loomadKeskmineEluiga(@PathVariable int min,@PathVariable int max) {
        return loomaRepository.findAllByKeskmineEluigaBetween(min, max);
    }
}