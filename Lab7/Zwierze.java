package pl.krzychulecjava;

public abstract class Zwierze implements Plywanie , Latanie {
    @Override
    public void lec() {
        System.out.println("leci");
    }

    @Override
    public void wyladuj() {
        System.out.println("laduje");
    }

    @Override
    public void plyn() {
        System.out.println("plynie ");
    }

    @Override
    public void wynurz() {
        System.out.println("wynurza sie");
    }

    @Override
    public void zanurz() {
        System.out.println("zanurza sie");
    }
}
