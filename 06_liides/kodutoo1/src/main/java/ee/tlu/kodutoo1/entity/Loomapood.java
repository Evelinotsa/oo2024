package ee.tlu.kodutoo1.entity;

import ee.tlu.kodutoo1.entity.LoomaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Entity
public class Loomapood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    LoomaEntity loom;
    int kogus;
}
