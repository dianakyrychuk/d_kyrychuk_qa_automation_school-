package Lesson7;

import java.util.List;

public class SearchResponse<T> {
    private List<T> data;
    private Pagination pagination;
    public List<T> getData() {
        return data;
    }
    public void setData(List<T> data) {
        this.data = data;
    }
    public Pagination getPagination() {
        return pagination;
    }
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
    public static class Data implements Comparable<Data> {
        private int period;
        private int subscribePeriod;
        private double price;

        public int getPeriod() {
            return period;
        }

        public void setPeriod(int period) {
            this.period = period;
        }

        public int getSubscribePeriod() {
            return subscribePeriod;
        }

        public void setSubscribePeriod(int subscribePeriod) {
            this.subscribePeriod = subscribePeriod;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public int compareTo(Data otherData) {
            return Double.compare(this.price, otherData.price);
        }
    }

    public static class Pagination {
        private int limit;
        private int offset;
        private int total;

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
}
