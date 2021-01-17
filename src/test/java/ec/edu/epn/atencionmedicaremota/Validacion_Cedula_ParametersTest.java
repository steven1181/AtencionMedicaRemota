package ec.edu.epn.atencionmedicaremota;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith( value = Parameterized.class)
public class Validacion_Cedula_ParametersTest {

    private Paciente p;
    private Validacion_Datos vd;
    private String cedula;

    @Before
    public void setUp(){
        p = new Paciente();
        vd = new Validacion_Datos();
    }

    @Parameterized.Parameters
    public static Iterable< Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        llenar_lista(objects);
        return objects;
    }

    private static void llenar_lista(List<Object[]> objects) {
        objects.add(new Object[]{"1726746595"});
        objects.add(new Object[]{"1726668799"});
        objects.add(new Object[]{"1001708070"});
        objects.add(new Object[]{"1001182136"});
        objects.add(new Object[]{"1751489848"});
    }

    public Validacion_Cedula_ParametersTest(String cedula) {
        this.cedula = cedula;
    }

    @Test
    public void given_parameters_when_validate_cedula_is_correct_then_ok(){
        p.setCedula(cedula);
        assertTrue(vd.validacion_cedula(p.getCedula()));
    }
}