package wedding.studio.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "show_details")
public class ShowDetailModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ShowDetailPK id;

    @Column(name = "available_date")
    private Date availableDate;

    private String description;

    @Column(name = "final_price")
    private BigDecimal finalPrice;

    @Column(name = "order_from_date")
    private Date orderFromDate;

    @Column(name = "order_to_date")
    private Date orderToDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductModel product;

    @ManyToOne
    @JoinColumn(name = "show_id", insertable = false, updatable = false)
    private ShowModel show;

    public ShowDetailModel() {
    }

    public ShowDetailPK getId() {
        return this.id;
    }

    public void setId(ShowDetailPK id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductModel getProduct() {
        return this.product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public ShowModel getShow() {
        return this.show;
    }

    public void setShow(ShowModel show) {
        this.show = show;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public Date getOrderFromDate() {
        return orderFromDate;
    }

    public void setOrderFromDate(Date orderFromDate) {
        this.orderFromDate = orderFromDate;
    }

    public Date getOrderToDate() {
        return orderToDate;
    }

    public void setOrderToDate(Date orderToDate) {
        this.orderToDate = orderToDate;
    }

}