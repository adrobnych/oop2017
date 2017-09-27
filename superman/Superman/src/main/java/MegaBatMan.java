/**
 * Created by adrobnych on 27.09.17.
 */
public class MegaBatMan extends Batman {
    MegaBatMan(MegaBatMan source){
        this.setName(source.getName());
        this.setSuperName(source.getSuperName());
    }

    public MegaBatMan() {
        super();
    }

    public MegaBatMan(String name, String superName) {
        super(name, superName);
    }

    @Override
    public void call(){
        System.out.println("MagaBatman is here also");
    }
}
