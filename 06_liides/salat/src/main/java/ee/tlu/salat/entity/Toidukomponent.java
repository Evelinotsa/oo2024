package ee.tlu.salat.entity;

// koosneb toiduainest ja temaga seotud kogusest toidus ees
// klassikomplekt -> kartul+omadused ja mitu grammi

import ee.tlu.salat.entity.ToiduaineEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Entity
public class Toidukomponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    ToiduaineEntity toiduaine;

    //@ManyToMany
    //List<ToiduaineEntity> toiduained;
    int kogus;

    //{id: 5, toiduaine: {nimetus: "Vorst"}, kogus: 100}
}
