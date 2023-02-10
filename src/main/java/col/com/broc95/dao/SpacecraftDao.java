package col.com.broc95.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import col.com.broc95.domain.Spacecraft;

public interface SpacecraftDao extends JpaRepository<Spacecraft, Long> {
    Spacecraft findByName(String name);
    // Spacecraft findByType(String typeS);


}
