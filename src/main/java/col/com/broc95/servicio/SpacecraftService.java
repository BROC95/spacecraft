package col.com.broc95.servicio;
import java.util.*;

import col.com.broc95.domain.Spacecraft;

public interface SpacecraftService {

    public List<Spacecraft> listSpacecraft();

    public void guardar(Spacecraft nave);


    
}
