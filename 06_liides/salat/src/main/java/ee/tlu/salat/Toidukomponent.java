package ee.tlu.salat;

// koosneb toiduainest ja temaga seotud kogusest toidus ees
// klassikomplekt -> kartul+omadused ja mitu grammi

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Toidukomponent {
    ToiduaineEntity toiduaine;
    int kogus;
}
