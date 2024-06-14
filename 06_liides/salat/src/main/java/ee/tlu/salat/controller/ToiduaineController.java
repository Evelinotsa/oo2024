package ee.tlu.salat.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ToiduaineController {
    List<String> toiduained = new ArrayList<>(); // imiteerime andmebaasi

    //localhost:8080/toiduained
    @GetMapping("toiduained")
    public List<String> saaToiduained(){
        return toiduained;
    }

    // PostMappingut ei saa brauser teha
    @PostMapping("toiduained/{toiduaine}")
    public List<String> lisaToiduaine(@PathVariable String toiduaine){
        toiduained.add(toiduaine);
        return toiduained;
    }

    @DeleteMapping("toiduained/{index}")
    public List<String> kustutaToiduaine(@PathVariable int index){
        toiduained.remove(index);
        return toiduained;
    }

    @PutMapping("toiduained/{index}/{newValue}")
    public List<String> muudaToiduaine(@PathVariable int index, @PathVariable String newValue){
        toiduained.set(index, newValue);
        return toiduained;
    }

    @GetMapping("toiduained/{index}")
    public String saaYksToiduaine(@PathVariable int index){
        return toiduained.get(index);
    }

    // CRUD --> Create, Read, Update, Delete



    // localhost:8080/tere
    @GetMapping("tere/{nimi}")
    public String hello(@PathVariable String nimi) {
        return "Tere" + nimi;
    }

    // localhost:8080/korruta
    @GetMapping("korruta/{arv1}/{arv2}")
    public int multiply(@PathVariable int arv1, @PathVariable int arv2) {
        return arv1 * arv2;
    }
}

//4xx - front-endi viga
//5xx - back-endi viga