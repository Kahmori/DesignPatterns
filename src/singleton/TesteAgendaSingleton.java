package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingleton {

  public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
    AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();

    System.out.println(agenda1);
    System.out.println(agenda2);

    reservaDiaEAGER("Sexta");
    reservaDiaEAGER("Sabado");

    AgendaSingletonLAZY agenda3 = AgendaSingletonLAZY.getInstance();
    AgendaSingletonLAZY agenda4 = AgendaSingletonLAZY.getInstance();

    System.out.println(agenda3);
    System.out.println(agenda4);

    reservaDiaLAZY("Sexta");
    reservaDiaLAZY("Sabado");

    Constructor<AgendaSingletonLAZY> constructorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
    constructorTravesso.setAccessible(true);
    AgendaSingletonLAZY agendaTravessa = constructorTravesso.newInstance();
    AgendaSingletonLAZY agendaTravessa2 = constructorTravesso.newInstance();

    //Ainda que o método seja privado, esse método é capaz de acessa-lo
    //Porém não funciona com o Enum

    System.out.println(agendaTravessa);
    System.out.println(agendaTravessa2);
  }

  public static void reservaDiaEAGER(String dia){
    AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
    agenda.ocupa(dia);
    System.out.println(agenda.getDias());
  }

  public static void reservaDiaLAZY(String dia){
    AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
    agenda.ocupa(dia);
    System.out.println(agenda.getDias());
  }

  public static void reservaDiaEnum(String dia){
    AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
    agenda.ocupa(dia);
    System.out.println(agenda.getDias());
  }
}

//AgendaSingletonEAGER cria a instancia mesmo que ela não seja chamada na aplicação.

//AgendaSingletonLAZY só cria a instancia quando ela for chamada pela primeira vez.