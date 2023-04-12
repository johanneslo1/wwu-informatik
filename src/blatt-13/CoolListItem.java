import java.util.Objects;

public class CoolListItem implements Comparable<CoolListItem>
{
    public String carBrand;

    public CoolListItem(String carBrand) {
        this.carBrand = carBrand;
    }

    public int compareTo(CoolListItem item) {

        if(Objects.equals(this.carBrand, "BMW") && Objects.equals(item.carBrand, "Skoda")) {
            return 1;
        }

        if(Objects.equals(this.carBrand, "Audi") && Objects.equals(item.carBrand, "BMW")) {
            return 1;
        }


        return 0;

    }

    public void print() {
        System.out.println(this.carBrand);
    }
}
