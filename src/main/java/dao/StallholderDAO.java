package dao;

import model.Stallholder;

/*
    CRUD для продавца билетов
*/

public interface StallholderDAO {

    void save(Stallholder stallholder);

    Stallholder getByName(String name);

    void update(Stallholder stallholder);

    void delete(Stallholder stallholder);
}
