package chibuzoAssignment;

public class Driller {
    private int price;
    public int driller(int page){
        if (page >= 1 && page <= 4){
            return price = page * 2000;
        } if (page >= 5 && page <= 9) {
            return price = page * 1800;
        } if (page >= 10 && page <= 29) {
           return price = page * 1600;
        } if (page >= 30 && page <= 49) {
            return price = page * 1500;
        } if (page >= 50 && page <= 99) {
            return price = page * 1300;
        } if (page >= 100 && page <= 199) {
            return price = page * 1200;
        } if (page >= 200 && page <= 499) {
            return price = page * 1100;
        } if (page >= 500) {
            return price = page * 1000;
        }
        return page;
    }
}
