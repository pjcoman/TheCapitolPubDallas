package comapps.com.thecapitolpubdallas.menu;

public class MenuListObject {

    private String item;
    private String group;
    private String other;
    private String specialsname;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecialsName() {
        return specialsname;
    }

    public void setSpecialsName(String specialsname) {
        this.specialsname = specialsname;
    }

    @Override
    public String toString() {
        return "MenuList [item=" + item + ", " + "other=" + other + "group=" + group + "specialsname=" + specialsname +"]";
    }


}
