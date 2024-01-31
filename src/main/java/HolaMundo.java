import java.util.Scanner;
import org.apache.logging.log4j.*;

public class HolaMundo {
	private static Logger logger = LogManager.getLogger(HolaMundo.class.getName());
	private static final String HOLA = "¡Hola, mundo!";
    public static void main (String[] args) {
		System.out.println (HOLA);
		//System.out.println("¿Qué tipo de log quieres generar? INFO / WARNING / DEBUG / ERROR / FATAL");
		//misLoggers(new Scanner(System.in).nextLine());
    }
    
    static void misLoggers (String tipo) {
    	switch (tipo.toUpperCase().trim()) {
    	case "INFO":
    		logger.info("Este es un log informativo.");
    		break;
    	case "WARNING":
    		logger.warn("Este es un log de advertencia.");
    		break;
    	case "DEBUG":
    		logger.warn("Este es un log de debug.");
    		break;
    	case "ERROR":
    		logger.warn("Este es un log de error.");
    		break;
    	case "FATAL":
    		logger.warn("Este es un log de error fatal.");
    		break;
    	default:
    		logger.warn("Error con la opción seleccionada.");
    		break;    	
    	}
    }
    
    public String getHola() {
        return HOLA;
    }
}