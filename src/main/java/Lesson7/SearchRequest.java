package Lesson7;

public class SearchRequest {

    private int tariff_id;


    public SearchRequest(int tariff_id) {
        this.tariff_id = tariff_id;
    }

    public int getTariff_id() {
        return tariff_id;
    }

    public void setTariff_id(int tariff_id) {
        this.tariff_id = tariff_id;
    }
}
