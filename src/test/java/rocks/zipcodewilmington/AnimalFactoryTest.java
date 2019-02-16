package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog() {
        String name = "Milo";
        Date birthdate = new Date();

        Dog dog = AnimalFactory.createDog(name, birthdate);

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(birthdate, dog.getBirthDate());

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {
        String name = "Nala";
        Date birthdate = new Date();

        Cat cat = AnimalFactory.createCat(name, birthdate);

        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(birthdate, cat.getBirthDate());

    }





}
