package ee.tlu.kodutoo1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Album {
    private int userId;
    private int id;
    private String title;
}
