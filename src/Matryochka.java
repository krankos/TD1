import java.util.*;

public class Matryochka {
    private int size;
    private Vector<Matryochka> parents;
    private Vector<Matryochka> children;
    private boolean open;

    public Matryochka() {
        size = 0;
        parents = new Vector<Matryochka>();
        children = new Vector<Matryochka>();
        open = false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void open() {
        this.open = this.children.size() == 0 && !this.open;
    }

    public void close() {
        this.open = this.open && this.parents.size() == 0;

    }

    public void placeIn(Matryochka P) {
        if (P.open && P.size >= this.size && !this.open && this.parents.size() == 0 && P.children.size() == 0) {

            P.children.add(this);
            this.parents.add(P);

        }

    }

    public void placeOut(Matryochka P) {
        if (!this.open && P.children.contains(this) && !P.open) {
            P.children.remove(this);
            this.parents.remove(P);

        }
    }
}
