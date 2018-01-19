package Modelo;

public class Item {
    private String name;
    private Double sale;
    private Double salePrice;
    private String type;
    private String style;

    public Item(String name, Double sale, Double salePrice, String type, String style) {
        this.name = name;
        this.sale = sale;
        this.salePrice = salePrice;
        this.type = type;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    
}
