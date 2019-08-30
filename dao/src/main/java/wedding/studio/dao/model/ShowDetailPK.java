package wedding.studio.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ShowDetailPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "show_id", insertable = false, updatable = false)
    private int showId;

    @Column(name = "product_id", insertable = false, updatable = false)
    private int productId;

    public ShowDetailPK() {
    }

    public int getShowId() {
        return this.showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowDetailPK)) {
            return false;
        }
        ShowDetailPK castOther = (ShowDetailPK) other;
        return (this.showId == castOther.showId) && (this.productId == castOther.productId);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.showId;
        hash = hash * prime + this.productId;

        return hash;
    }
}