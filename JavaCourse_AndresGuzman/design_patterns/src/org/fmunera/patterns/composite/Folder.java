package org.fmunera.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    private List<Component> children;

    public Folder(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    public Folder addComponent(Component c){
        this.children.add(c);
        return this;
    }

    public void removeComponent(Component c){
        this.children.remove(c);
    }

    @Override
    public String show(int level) {

        StringBuilder sb = new StringBuilder("\t".repeat(level));

        sb.append(name)
                .append("/")
                .append("\n");
        for(Component child: this.children){
            sb.append(child.show(level+1));

            if(child instanceof File){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean search(String name) {
        if(this.name.equalsIgnoreCase(name)){
            return true;
        }

        /*for(Component c: this.children){
            if(c.search(name)){
                return true;
            }
        }
        return false;
         */

        return children.stream().anyMatch(c -> c.search(name));
    }
}
