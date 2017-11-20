package codigofacilito.app.jorgemartinez.com.video2.Collection;

/**
 * Created by brayanmartineznina on 19/11/17.
 */

public class Item {

        public String title;
        public String description;
        public String url;
        public   int id;
        public void setTitle(String title){
            this.title = title;
        }
    public void setDescription(String description){
        this.description = description;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;

    }
    public String getDescription(){
       return this.description;
    }
    public String getUrl(){
       return this.url;
    }
}

