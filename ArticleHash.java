package IgBac3;

import java.util.HashMap;
import java.util.Map;

public class ArticleHash {

	public static void main(String[] args) {
		HashMap<Long, String> mapArticle = new HashMap<Long, String>();
		mapArticle.put(1001L, "chaussure");
		mapArticle.put(1002L, "sac");
		mapArticle.put(1003L, "stylo");
		mapArticle.put(1004L, "ordinateur");
		mapArticle.put(1005L, "papier");
		mapArticle.put(1006L, "chaise");
		mapArticle.put(1007L, "téléphone");
		mapArticle.put(1008L, "cahier");
		mapArticle.put(1009L, "crayon");
		mapArticle.put(1010L, "gomme");
		mapArticle.put(1011L, "écouteur");
		mapArticle.put(1012L, "air pod");
		mapArticle.put(1013L, "lunette");
		mapArticle.put(1014L, "montre");
		mapArticle.put(1015L, "sandale");
		mapArticle.put(1016L, "livre");
		mapArticle.put(1017L, "bouteille");
		mapArticle.put(1018L, "table");
		mapArticle.put(1019L, "poupée");
		mapArticle.put(1020L, "ballon");
		
		for (Map.Entry mapentry : mapArticle.entrySet() ) {
			if(mapentry.getKey().equals(1019L))
			System.out.println("code: "+mapentry.getKey() 
			                   + "| valeur: "+ mapentry.getValue());
		}

	}

}
