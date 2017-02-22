import org.soa.ws.tp8.Convertisseur;
import org.soa.ws.tp8.ConvertisseurImplService;


public class ConvertisseurClient {

	public static void main(String[] args) {
		
		ConvertisseurImplService service = new ConvertisseurImplService();
		Convertisseur convertisseur = service.getConvertisseurImplPort();
		System.out.println(convertisseur.getDinarFromEuro(100));

	}

}
