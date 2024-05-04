package ee.tlu.kodutoo1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LoomaEntityController {
    List<LoomaEntity> loomad = new ArrayList<>();

    @GetMapping("loomad")
    public List<LoomaEntity> saaLoomad(){
        return loomad;
    }

    //localhost:8080/api/loomad?nimi=lõvi&populatsioon=32000&keskmineEluiga=15&keskmineKaal=130
    @PostMapping("loomad")
    public List<LoomaEntity> lisaLoomad(
            @RequestParam String nimi,
            @RequestParam int populatsioon,
            @RequestParam int keskmineEluiga,
            @RequestParam int keskmineKaal
    ){
        LoomaEntity loom = new LoomaEntity(nimi, populatsioon, keskmineEluiga, keskmineKaal);
        loomad.add(loom);
        return loomad;
    }

    @DeleteMapping("loomad/{index}")
    public List<LoomaEntity> kustutaLoom(@PathVariable int index){
        loomad.remove(index);
        return loomad;
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
        loomad.add(index, loom);
        return loomad;
    }
}