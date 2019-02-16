package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog(null,null,null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void setBirthDateTest() {
        //given there is a dog
        Dog dog = new Dog(null, null, null);
        //given there is a birth date to give the dog
        Date expected = new Date();
        //when the dogs birth date is set
        dog.setBirthDate(expected);
        //when we get the birth date of the dog
        Date actual = dog.getBirthDate();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest() {
        //give
        Dog dog = new Dog(null, null, null);
        int preMealCount = dog.getNumberOfMealsEaten();
        int expected = preMealCount + 1;
        //when
        Food food = new Food();
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimalInheritance() {
        //given
        Dog dog = new Dog(null,null,null);
        //when
        boolean outcome = dog instanceof Animal;
        //then
        Assert.assertTrue(outcome);

    }
    @Test
    public void testMammalInheritance() {
        //given
        Dog dog = new Dog(null, null, null);
        //when
        boolean outcome = dog instanceof Mammal;
        //then
        Assert.assertTrue(outcome);
    }
    }
