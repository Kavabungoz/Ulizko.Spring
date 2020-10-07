package service;

import dao.StallholderDaoImpl;
import model.Stallholder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceStallholderImpl implements ServiceStallholder {
    private static final Logger log = LogManager.getLogger(ServiceStallholderImpl.class.getName());
    private StallholderDaoImpl stallholderDaoImpl;

    public ServiceStallholderImpl(StallholderDaoImpl stallholderDaoImpl) {
        this.stallholderDaoImpl = stallholderDaoImpl;
    }

    @Override
    public void addStallholder(Stallholder stallholder) {
        log.info("Кассир был нанят на работу.");
        stallholderDaoImpl.save(stallholder);
    }

    @Override
    public void getStallholder(Stallholder stallholder) {
        log.info("Вы позвали кассира " + stallholder.getName());
        stallholderDaoImpl.getByName(stallholder.getName());
    }

    @Override
    public void updateStallholder(Stallholder stallholder) {
        log.info("По вашей просьбе кассир обновлён и работает усерднее!");
        stallholderDaoImpl.update(stallholder);
    }

    @Override
    public void deleteStallholder(Stallholder stallholder) {
        log.info("Кассир был уволен!");
        stallholderDaoImpl.delete(stallholder);
    }

}
