package ee.tlu.kodutoo1.repository;

import ee.tlu.kodutoo1.entity.LoomaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoomaRepository extends JpaRepository<LoomaEntity, String> {
    // saan siia kirjutada custom repository käske

    List<LoomaEntity> findAllByPopulatsioonGreaterThan(int populatsioon);

    List<LoomaEntity> findAllByKeskmineEluigaBetween(int min, int max);
}
