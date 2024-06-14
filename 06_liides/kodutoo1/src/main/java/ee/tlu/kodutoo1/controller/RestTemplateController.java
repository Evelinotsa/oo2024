package ee.tlu.kodutoo1.controller;

import ee.tlu.kodutoo1.entity.Album;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class RestTemplateController {

    @GetMapping("saa-albumid")
    public List<Album> getAlbums() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/albums";
        ResponseEntity<Album[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Album[].class);
        return List.of(response.getBody());
    }

    @GetMapping("saa-albumid/{kasutajaId}")
    public List<Album> getUserAlbums(@PathVariable int kasutajaId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/albums";
        ResponseEntity<Album[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Album[].class);
        List<Album> kasutajaAlbumid = new ArrayList<>();
        for (Album a : response.getBody()) {
            if (a.getUserId() == kasutajaId) {
                kasutajaAlbumid.add(a);
            }
        }

        return kasutajaAlbumid;
    }
}
