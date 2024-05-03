package ee.tlu.salat;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ToiduaineEntityController {
    List<ToiduaineEntity> toiduained = new ArrayList<>(); // imiteerime andmebaasi

    //localhost:8080/api/toiduained
    @GetMapping("toiduained")
    public List<ToiduaineEntity> saaToiduained(){
        return toiduained;
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
    ){
        if (valk + sysivesik > 100){
            return toiduained;
        }
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduained.add(toiduaine);
        return toiduained;
    }

    @DeleteMapping("toiduained/{index}")
    public List<ToiduaineEntity> kustutaToiduaine(@PathVariable int index){
        toiduained.remove(index);
        return toiduained;
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
        toiduained.set(index, toiduaine);
        return toiduained;
    }

    @GetMapping("toiduained/{index}")
    public ToiduaineEntity saaYksToiduaine(@PathVariable int index){
        return toiduained.get(index);
    }

}