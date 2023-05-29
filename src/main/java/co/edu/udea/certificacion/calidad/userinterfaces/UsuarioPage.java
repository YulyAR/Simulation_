package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target TEXT_SIMULAR_PAGE = Target.the("Texto de te ofrecemos ").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[4]/section/div[2]/footer/div/div[1]/div/div[3]/p[3]");
    public static final Target SIMULAR = Target.the("SIMULAR").locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[4]/div/div[2]/div/a[1]");
    public static final Target CONTINUAR = Target.the("CONTINUAR").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target RADIOBUTTON_SI = Target.the("RADIOBUTTON_SI").locatedBy("//label[@for='opcion-si-input']");
    public static final Target MONTO = Target.the("MONTO").locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target PLAZO = Target.the("PLAZO").locatedBy("//*[@id=\"valor-plazo\"]");

    public static final Target ANIO = Target.the("ANIO").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[4]/td[4]/div[1]");
    public static final Target MES = Target.the("MES").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[3]/td[1]/div[1]");
    public static final Target DIA = Target.the("DIA").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[3]/td[2]/div[1]");
    public static final Target SIMULAR1 = Target.the("SIMULAR1").locatedBy("//*[@id=\"boton-simular\"]");

    public static final Target FECHA = Target.the("FECHA").locatedBy("//*[@id=\"campo-fecha\"]");

    public static final Target VALIDACION = Target.the("VALIDACION").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");
}
