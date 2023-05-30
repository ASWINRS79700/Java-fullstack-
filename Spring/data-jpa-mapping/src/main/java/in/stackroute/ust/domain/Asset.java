package in.stackroute.ust.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assetts")
public class Asset {

    @Id
    private String serialNo;

    private String type;

    public Asset() {
    }

    public Asset(String serialNo, String type) {
        this.serialNo = serialNo;
        this.type = type;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
