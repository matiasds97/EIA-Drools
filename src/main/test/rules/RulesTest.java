package rules;

import com.eia.model.*;
import com.eia.utils.KnowledgeSessionHelper;
import com.eia.utils.TestCaseUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import static com.eia.utils.TestCaseUtils.*;

public class RulesTest {
    final String K_SESSION_NAME = "sube-session-rules";

    KieSession sessionStatefull;
    static KieContainer kieContainer;

    public RulesTest() {

    }

    @BeforeClass
    public static void beforeAllTestSetup() {
        kieContainer = KnowledgeSessionHelper.createRuleBase();
    }

    private void prepareKnowledgeSession() {
        sessionStatefull = KnowledgeSessionHelper
            .getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
    }

    @Before
    public void setUp() {
        print("----------Start----------");
        print();
        this.prepareKnowledgeSession();
    }

    @After
    public void tearDown() {
        print();
        print("----------End----------");
        print();
    }

    @Test
    public void noHayFallasTest() {
        print("Error: NO DETERMINADO");
        Lector lector = new Lector(
            CondicionLector.FUNCIONANDO, 0.01f, DeteccionDeTarjeta.DETECTADA,
            1.0f, 100);
        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.NO_DETERMINADO);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }

    @Test
    public void saldoInsuficienteTest() {
        print("Error: SALDO INSUFICIENTE");
        Lector lector = new Lector(
                CondicionLector.FUNCIONANDO, 0.01f, DeteccionDeTarjeta.DETECTADA,
                1.0f, 100);

        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setSaldo(-60f);
        lector.setTarjeta(tarjeta);

        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.SALDO_INSUFICIENTE);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }

    @Test
    public void subeNoIdentificadaTest() {
        print("Error: SUBE NO IDENTIFICADA");
        Lector lector = new Lector(
                CondicionLector.FUNCIONANDO, 0.01f, DeteccionDeTarjeta.NO_DETECTADA,
                1.0f, 100);

        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.SUBE_NO_IDENTIFICADA);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }

    @Test
    public void subeDeshabilitadaTest() {
        print("Error: SUBE DESHABILITADA");
        Lector lector = new Lector(
                CondicionLector.FUNCIONANDO, 0.01f, DeteccionDeTarjeta.DETECTADA,
                1.0f, 100);

        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setSaldo(-60f);
        tarjeta.setEstadoChip(EstadoChip.MALO);
        tarjeta.setEstadoLogico(EstadoLogico.DESHABILITADA);
        lector.setTarjeta(tarjeta);

        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.SUBE_DESHABILITADA);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }

    @Test
    public void lecturaFallidaTest() {
        print("Error: LECTURA FALLIDA");
        Lector lector = new Lector(
                CondicionLector.FUNCIONANDO, 0.01f, DeteccionDeTarjeta.DETECTADA,
                1.0f, 100);

        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setPosicionRespectoAlLector(PosicionRespectoAlLector.EN_MOVIMIENTO);

        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.LECTURA_FALLIDA);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }

    @Test
    public void molineteDeshabilitadoTest() {
        print("Error: MOLINETE DESHABILITADO");
        Lector lector = new Lector(
                CondicionLector.FUNCIONANDO, 0.01f, DeteccionDeTarjeta.DETECTADA,
                1.0f, 100);

        Molinete molinete = new Molinete();
        molinete.setApertura(AperturaMolinete.NO_GIRA);
        lector.setMolinete(molinete);

        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.MOLINETE_DESHABILITADO);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }

    @Test
    public void lectorDeshabilitadoTest() {
        print("Error: LECTOR DESHABILITADO");
        Lector lector = new Lector(
                CondicionLector.NO_FUNCIONANDO, 0f, DeteccionDeTarjeta.NO_DETECTADA, 0f, 0);

        DiagnosticoFinal diagnosticoEsperado = new DiagnosticoFinal();
        diagnosticoEsperado.setError(Diagnostico.LECTOR_DESHABILITADO);

        print(lector);

        sessionStatefull.insert(lector);
        sessionStatefull.fireAllRules();

        DiagnosticoFinal diagnosticoObtenido = lector.getDiagnosticoFinal();
        assertResults(diagnosticoEsperado, diagnosticoObtenido);
    }
}