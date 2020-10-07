package service;

import dao.StallholderDaoImpl;
import model.Stallholder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceStallholder {
    private static final Logger log = LogManager.getLogger(ServiceStallholder.class.getName());
    private StallholderDaoImpl stallholderDaoImpl;

    public void addStallholder(Stallholder stallholder){
        log.info("Кассир был нанят на работу.");
        stallholderDaoImpl.save(stallholder);
    }

    public void getStallholder(Stallholder stallholder){
        log.info("Вы позвали кассира "+stallholder.getName());
        stallholderDaoImpl.getByName(stallholder.getName());
    }

    public void updateStallholder(Stallholder stallholder){
        log.info("По вашей просьбе кассир обновлён и работает усерднее!");
        stallholderDaoImpl.update(stallholder);
    }

    public void deleteStallholder(Stallholder stallholder){
        log.info("Кассир был уволен!");
        stallholderDaoImpl.delete(stallholder);
    }
}
