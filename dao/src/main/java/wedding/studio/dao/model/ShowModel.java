package wedding.studio.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "shows")
public class ShowModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "from_date")
    private Date fromDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "to_date")
    private Date toDate;

    private String status;

    private String place;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    private BigDecimal deposit;

    private String makeup;

    private String phorographer;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowDetailModel> showDetails = new ArrayList<ShowDetailModel>();

    @ManyToOne
    private ServiceModel service;

    @ManyToOne
    private CustomerModel customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceModel getService() {
        return service;
    }

    public void setService(ServiceModel service) {
        this.service = service;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getMakeup() {
        return makeup;
    }

    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    public String getPhorographer() {
        return phorographer;
    }

    public void setPhorographer(String phorographer) {
        this.phorographer = phorographer;
    }

    public List<ShowDetailModel> getShowDetails() {
        return showDetails;
    }

    public void setShowDetails(List<ShowDetailModel> showDetails) {
        this.showDetails = showDetails;
    }

    public ShowDetailModel addShowDetail(ShowDetailModel showDetail) {
        getShowDetails().add(showDetail);
        showDetail.setShow(this);

        return showDetail;
    }

    public ShowDetailModel removeShowDetail(ShowDetailModel showDetail) {
        getShowDetails().remove(showDetail);
        showDetail.setShow(null);

        return showDetail;
    }
}
