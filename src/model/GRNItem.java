package model;

import java.util.Date;


public class GRNItem {

    private String productId;
    private String brandName;
    private String productName;
    private String stockId;
    private double qty;
    private double buyingPrice;
    private double sellingPrice;
    private Date mfd;
    private Date exp;

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the stockId
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * @param stockId the stockId to set
     */
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    /**
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    /**
     * @return the buyingPrice
     */
    public double getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * @param buyingPrice the buyingPrice to set
     */
    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * @return the mfd
     */
    public Date getMfd() {
        return mfd;
    }

    /**
     * @param mfd the mfd to set
     */
    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }

    /**
     * @return the exp
     */
    public Date getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(Date exp) {
        this.exp = exp;
    }

    /**
     * @return the sellingPrice
     */
    public Double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
            
    
}
