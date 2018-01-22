import org.junit.Test;

public class TestPerson {

  @Test
  public void testHashCode() {
    Person oleg = new Person.Builder()
        .name("Oleg")
        .surname("Timosenko")
        .age(43).build();

    System.out.println((char) (oleg.hashCode() + 'A') );
    Person oleshka = new Person.Builder()
        .name("Olegik junior")
        .surname("timosenko")
        .age(43).build();

    System.out.println((char) (oleshka.hashCode() + 'a') );
  }

  @Test
  public void testPutGet() {
    Bucket bucket = new Bucket();
    Person max = new Person.Builder()
        .name("Max")
        .surname("Ceban")
        .age(45)
        .build();

    Person john = new Person.Builder()
        .name("John")
        .surname("Murphy")
        .age(51)
        .build();

    Person oxana = new Person.Builder()
        .name("Oxana")
        .surname("Naumova")
        .age(32)
        .build();

    Person masha = new Person.Builder()
        .name("Masha")
        .surname("Dombrowska")
        .age(47)
        .build();

    System.out.println(bucket.get(max));

    bucket.put(max, "007");

    System.out.println(bucket.get(max));
    System.out.println(bucket.get(masha));

  }
}
