package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Ageable> implements Iterable <Ageable> {
    ArrayList<Ageable> newList;


    public Shelter() {

        this.newList = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return newList.size();
    }

    public void add(Ageable object) {
         newList.add(object);
    }

    public Boolean contains(Ageable object) {

        return newList.contains(object);
    }

    public void remove(Ageable object) {
        newList.remove(object);
    }

    public Ageable get(Integer index) {

        return newList.get(index);
    }

    public Integer getIndexOf(Ageable ageable) {

        return newList.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator() {
        return newList.iterator();
    }

}