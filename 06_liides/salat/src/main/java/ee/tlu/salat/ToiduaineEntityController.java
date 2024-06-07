package ee.tlu.salat;

import org.hibernate.metamodel.mapping.internal.EntityRowIdMappingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ToiduaineEntityController {

    ToiduaineRepository toiduaineRepository;

    public ToiduaineEntityController(ToiduaineRepository toiduaineRepository){
        this.toiduaineRepository = toiduaineRepository;
    }

    //List<ToiduaineEntity> toiduained = new ArrayList<>(); // imiteerime andmebaasi

    //localhost:8080/api/toiduained
    @GetMapping("toiduained")
    public List<ToiduaineEntity> saaToiduained(){
        return toiduaineRepository.findAll();
    }

    // localhost:8080/api/toiduained/sibul/6/15/10
    // järjekord oluline
    // vahele ei saa midagi jätta
    @PostMapping("toiduained/{nimi}/{valk}/{rasv}/{sysivesik}")
    public List<ToiduaineEntity> lisaToiduaine(
            @PathVariable String nimi,
            @PathVariable int valk,
            @PathVariable int rasv,
            @PathVariable int sysivesik
    ) {
        if (valk + rasv + sysivesik > 100) {
            return toiduaineRepository.findAll();
        }
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduaineRepository.save(toiduaine);
        return toiduaineRepository.findAll();
    }

    @PostMapping("toiduained")
    public List<ToiduaineEntity> lisaToiduaine(@RequestBody ToiduaineEntity toiduaineEntity) {
        if (toiduaineEntity.getValk() + toiduaineEntity.getRasv() + toiduaineEntity.getSysivesik() > 100) {
            return toiduaineRepository.findAll();
        }
        //ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduaineRepository.save(toiduaineEntity);
        return toiduaineRepository.findAll();
    }

    @DeleteMapping("toiduained/{nimi}")
    public List<ToiduaineEntity> kustutaToiduaine(@PathVariable String nimi){
        toiduaineRepository.deleteById(nimi);
        return toiduaineRepository.findAll();
    }

    // localhost:8080/api/toiduained?index=1&nimi=Majonees&valk=8&rasv=15&sysivesik=10
    // saab vahele jätta
    @PutMapping("toiduained")
    public List<ToiduaineEntity> muudaToiduaine(
            @RequestParam int index,
            @RequestParam String nimi,
            @RequestParam int valk,
            @RequestParam int rasv,
            @RequestParam int sysivesik
    ){
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        //toiduained.set(index, toiduaine);
        toiduaineRepository.save(toiduaine);
        return toiduaineRepository.findAll();
    }

    @GetMapping("toiduained/{nimi}")
    public ToiduaineEntity saaYksToiduaine(@PathVariable String nimi){

        return toiduaineRepository.findById(nimi).get();
    }

    @GetMapping("toiduainete-koguarv")
    public int toiduaineteKoguarv(){
        return toiduaineRepository.findAll().size();
    }
}