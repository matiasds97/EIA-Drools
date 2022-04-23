import java.util.ArrayList;
import java.util.Random;

import com.eia.model.CondicionLector;
import com.eia.model.CondicionMolinete;
import com.eia.model.DeteccionDeTarjeta;
import com.eia.model.Lector;
import com.eia.model.Molinete;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.eia.utils.KnowledgeSessionHelper;

public class Main {
	public static void main(String[] args) {
        KieContainer container = KnowledgeSessionHelper.createRuleBase();
        String sessionName = "sube-session-rules";

        KieSession session = KnowledgeSessionHelper.getStatefulKnowledgeSession(container, sessionName);

        ArrayList<Lector> lectores = new ArrayList<Lector>();
        Random random = new Random();

        Lector lector = new Lector(CondicionLector.NO_FUNCIONANDO,
                0.02f, DeteccionDeTarjeta.DETECTADA, 1.0f, 100);
        
        lector.setMolinete(new Molinete());
        lector.getMolinete().setCondicion(CondicionMolinete.FUNCIONANDO);

        session.insert(lector);

        /* for (int i = 0; i < 3; i++) {
            Product productToAdd = new Lector("Product1",
                random.nextInt(40));
            products.add(productToAdd);
            session.insert(productToAdd);
        } */

        session.fireAllRules();

        System.out.println(lector);
    }
}
