package architecture;

import java.util.HashMap;
import java.util.Map;

public class WebRecord {

    private int homeFlow = 0;

    private Map<Long, Integer> pageFlow = new HashMap<Long, Integer>();

    private static final WebRecord webRecord= new WebRecord();

    private WebRecord() {
    }

    synchronized public static WebRecord getWebRecord(){
        return webRecord;
    }
    public int getHomeFlow(){
        return this.homeFlow;
    }

    public void comeHomePage(){
        this.homeFlow += 1;
    }

    public void comeDetailPage(Long id){
        if(this.pageFlow.containsKey(id)){
            int value = this.pageFlow.get(id);
            this.pageFlow.replace(id,value+1);
        }
        else{
            this.pageFlow.put(id,0);
        }
    }
}
