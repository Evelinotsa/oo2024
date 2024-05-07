package ee.tlu.kontrolltoo2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Table(name = "Jogi")
@Entity
@NoArgsConstructor
public class JogiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nimetus;
    private double lahtmeX;
    private double lahtmeY;
    private double suudmeX;
    private double suudmeY;
    private double kiirus;
}
