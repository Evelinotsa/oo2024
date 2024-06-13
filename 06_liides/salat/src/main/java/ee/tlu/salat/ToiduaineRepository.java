package ee.tlu.salat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToiduaineRepository extends JpaRepository<ToiduaineEntity, String> {
    // saan siia kirjutada custom repository käske, mis tagastavad kas ToiduaineEntity või List<ToiduaineEntity>

    List<ToiduaineEntity> findAllByValkGreaterThan(int valk);

    List<ToiduaineEntity> findAllBySysivesikBetween(int min, int max);
}
