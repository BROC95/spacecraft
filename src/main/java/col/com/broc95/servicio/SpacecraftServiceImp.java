package col.com.broc95.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import col.com.broc95.dao.SpacecraftDao;
import col.com.broc95.domain.Spacecraft;
@Service
public class SpacecraftServiceImp implements SpacecraftService {

    // @Autowired(required = true)
    @Autowired
    private SpacecraftDao spacecraftDao;


    @Override
    public List<Spacecraft> listSpacecraft() {
        // TODO Auto-generated method stub
        return (List<Spacecraft>) spacecraftDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Spacecraft nave) {
        // TODO Auto-generated method stub
        spacecraftDao.save(nave);
        
    }




}
