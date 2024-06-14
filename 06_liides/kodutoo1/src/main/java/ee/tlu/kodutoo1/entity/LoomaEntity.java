package ee.tlu.kodutoo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Table(name = "loom")
@Entity
@NoArgsConstructor
public class LoomaEntity {
    @Id
    String nimetus;
    int populatsioon;
    int keskmineEluiga;
    int keskmineKaal;

    //public LoomaEntity(String nimetus, int populatsioon, int keskmineEluiga, int keskmineKaal) {
    //    this.nimetus = nimetus;
    //    this.populatsioon = populatsioon;
    //    this.keskmineEluiga = keskmineEluiga;
    //    this.keskmineKaal = keskmineKaal;
    //}
}
