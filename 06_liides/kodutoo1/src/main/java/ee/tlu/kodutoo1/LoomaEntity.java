package ee.tlu.kodutoo1;

import lombok.Getter;

@Getter
public class LoomaEntity {
    String nimetus;
    int populatsioon;
    int keskmineEluiga;
    int keskmineKaal;

    public LoomaEntity(String nimetus, int populatsioon, int keskmineEluiga, int keskmineKaal) {
        this.nimetus = nimetus;
        this.populatsioon = populatsioon;
        this.keskmineEluiga = keskmineEluiga;
        this.keskmineKaal = keskmineKaal;
    }
}
