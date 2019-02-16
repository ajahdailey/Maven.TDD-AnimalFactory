package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    // TODO - Create tests for `void remove(Integer id)`
  @Test
  public void removeTest() {
      int id = 10;
      Cat cat = new Cat(null, null, null);
      CatHouse.add(cat);

      Cat catFromCatHouse = CatHouse.getCatById(id);
      Assert.assertNotNull(catFromCatHouse);

      CatHouse.remove(id);
      Cat actual = CatHouse.getCatById(id);

      Assert.assertNull(actual);


  }


    // TODO - Create tests for `void remove(Cat cat)`

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatTest() {
            int expected = 1;
            Cat cat = new Cat(null,null,null);
            CatHouse.add(cat);

            int actual = CatHouse.getNumberOfCats();

            Assert.assertEquals(expected, actual);




    }






}
