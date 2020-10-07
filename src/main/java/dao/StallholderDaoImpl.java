package dao;

import model.Stallholder;

import java.util.List;

public class StallholderDaoImpl implements StallholderDAO {
    protected List<Stallholder> elements;

    @Override
    public void save(Stallholder stallholder) {
        elements.add(stallholder);
    }

    @Override
    public Stallholder getByName(String name) {
        for (Stallholder s : elements) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void update(Stallholder stallholder) {
        elements.set(elements.indexOf(stallholder),stallholder);
    }

    @Override
    public void delete(Stallholder stallholder) {
        elements.remove(stallholder);
    }
}
