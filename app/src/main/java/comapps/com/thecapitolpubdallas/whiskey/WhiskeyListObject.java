package comapps.com.thecapitolpubdallas.whiskey;

public class WhiskeyListObject {

    private String whiskeyname;
    private String whiskeytype;
    private String whiskeygroup;
    private String whiskeyabout;
    
    public String getName() {
        return whiskeyname;
    }

    public void setName(String whiskeyname) {
        this. whiskeyname = whiskeyname;
    }
    
    public String getType() {
        return whiskeytype;
    }

    public void setType(String whiskeytype) {
        this.whiskeytype = whiskeytype;
    }
    
    public String getGroup() {
        return whiskeygroup;
    }

    public void setGroup(String whiskeygroup) {
        this.whiskeygroup = whiskeygroup;
    }

    public String getAbout() {
        return whiskeyabout;
    }

    public void setAbout(String whiskeyabout) {
        this.whiskeyabout = whiskeyabout;
    }



    @Override
    public String toString() {
        return "WhiskeyList [whiskeyname=" +  whiskeyname + ", whiskeytype=" + whiskeytype + ", whiskeygroup=" + whiskeygroup +
                ", whiskeyabout=" + whiskeyabout + "]";
    }


}
