package ob.ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Este es el metodo save");
    }

    @Override
    public void delete() {
        System.out.println("Este es el metodo delete");

    }

    @Override
    public void findAll() {
        System.out.println("Este es el metodo findAll");
    }
}
