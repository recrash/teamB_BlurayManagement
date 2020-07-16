
package BookRentalSystem;

import java.util.Date;

public class BlurayRegistered extends AbstractEvent {

    private Long id;
    private String blurayName;
    private Date regTime;
    private Integer rentalFee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBlurayName() {
        return blurayName;
    }

    public void setBlurayName(String blurayName) {
        this.blurayName = blurayName;
    }
    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
    public Integer getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(Integer rentalFee) {
        this.rentalFee = rentalFee;
    }
}
