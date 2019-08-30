package wedding.studio.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
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

@Entity
@Table(name = "products")
public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String color;

    private String images;

    @Column(name = "rent_cost")
    private BigDecimal rentCost;

    private BigDecimal price;

    private String status;

    @ManyToOne
    private SizeModel size;

    @ManyToOne
    private CategoryModel category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ShowDetailModel> showDetails = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public BigDecimal getRentCost() {
        return rentCost;
    }

    public void setRentCost(BigDecimal rentCost) {
        this.rentCost = rentCost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SizeModel getSize() {
        return size;
    }

    public void setSize(SizeModel size) {
        this.size = size;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public List<ShowDetailModel> getShowDetails() {
        return showDetails;
    }

    public void setShowDetails(List<ShowDetailModel> showDetails) {
        this.showDetails = showDetails;
    }

    public ShowDetailModel addShowDetail(ShowDetailModel showDetail) {
        getShowDetails().add(showDetail);
        showDetail.setProduct(this);

        return showDetail;
    }

    public ShowDetailModel removeShowDetail(ShowDetailModel showDetail) {
        getShowDetails().remove(showDetail);
        showDetail.setProduct(null);

        return showDetail;
    }

}
