package comapps.com.thecapitolpubdallas.drinks;

public class BeerListObject {

    private String beername;
    private String beerwherefrom;
    private Double beerabv;
    private String beergroup;
    private String beerprice;
    private String beerabout;
    private String beersize;

    public String getBeerName() {
        return beername;
    }

    public void setBeerName(String beername) {
        this.beername = beername;
    }

    public String getBeerWhereFrom() {
        return beerwherefrom;
    }

    public void setBeerWhereFrom(String beerwherefrom) {
        this.beerwherefrom = beerwherefrom;
    }

    public Double getBeerAbv() {
        return beerabv;
    }

    public void setBeerAbv(Double beerabv) {
        this.beerabv = beerabv;
    }

    public String getBeerGroup() {
        return beergroup;
    }

    public void setBeerGroup(String beergroup) {
        this.beergroup = beergroup;
    }

    public String getBeerAbout() {
        return beerabout;
    }

    public void setBeerAbout(String beerabout) {
        this.beerabout = beerabout;
    }

    public String getBeerPrice() {
        return beerprice;
    }

    public void setBeerPrice(String beerprice) {
        this.beerprice = beerprice;
    }

    public String getBeerSize() {
        return beersize;
    }

    public void setBeerSize(String beersize) {
        this.beersize = beersize;
    }


    @Override
    public String toString() {
        return "BeerList [beername=" + beername + ", beerwherefrom=" + beerwherefrom + ", beerabv=" + beerabv.toString() +
                ", beergroup=" + beergroup + ", beersize=" + beersize + ", beerabout=" + beerabout +
                ", beerprice=" + beerprice + "]";
    }


}
