package facture;
import java.util.HashMap;
import java.util.Map;
public class Catalogue {
   
     private Map<String,Article> articles = new HashMap<>();
    public Catalogue(){
    }
    public void addArticle(Article article) {
         String codea = article.getCode();
         articles.put(codea, article);
    }
    
    public Article findByCode(String code) {
     return articles.get(code);             
    }
    
}
