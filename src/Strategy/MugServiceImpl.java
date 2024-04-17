package Strategy;

import java.util.List;

public class MugServiceImpl<Mug> implements Service<Mug>{
    @Override
    public Mug create(Mug newMug) {
        System.out.println("Create Mug");
        return newMug;
    }

    @Override
    public Mug update(Mug mug) {
        System.out.println("Update Mug");
        return mug;
    }

    @Override
    public List<Mug> listAll() {
        System.out.println("List all Mugs");
        return null;
    }

    @Override
    public String delete(Mug mug) {
        System.out.println("delete Mug");
        return "the mug has been deleted";
    }
}
