package ee.tlu.kodutoo1;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NumbriteController {
    List<Integer> numbrid = new ArrayList<>();

    // vaata numbreid
    @GetMapping("numbrid")
    public List<Integer> saaNumbrid(){
        return numbrid;
    }

    // lisa numbreid
    @PostMapping("numbrid/{number}")
    public List<Integer> lisaNumber(@PathVariable int number){
        numbrid.add(number);
        return numbrid;
    }

    // kustuta numbreid
    @DeleteMapping("numbrid/{index}")
    public List<Integer> kustutaNumber(@PathVariable int index){
        numbrid.remove(index);
        return numbrid;
    }

    // loeb numbrid kokku
    @GetMapping("numbrid/loenda")
    public int loendaNumbrid() {
        return numbrid.size();
    }

    // numbrite summa
    @GetMapping("numbrid/summa")
    public int numbriteSumma() {
        int sum = 0;
        for (int number : numbrid) {
            sum += number;
        }
        return sum;
    }

    // korruta numbrid
    @GetMapping("numbrid/korrutis")
    public int korrutaNumbrid() {
        if (numbrid.isEmpty()) {
            return 0; // tagastab nulli kui list on tühi
        }

        int product = 1;
        for (int number : numbrid) {
            product *= number;
        }
        return product;
    }
}