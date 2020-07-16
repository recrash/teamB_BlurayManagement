package BookRentalSystem;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BlurayManagement_table")
public class BlurayManagement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String blurayName;
    private Date regTime;
    private Integer rentalFee;

    public BlurayManagement()
    {
        Date date = new Date();
        this.regTime = new Timestamp(date.getTime());
        System.out.println("regTime!! : " + this.regTime);
    }

    @PostPersist
    public void onPrePersist(){
        BlurayRegistered blurayRegistered = new BlurayRegistered();
        BeanUtils.copyProperties(this, blurayRegistered);
        blurayRegistered.publishAfterCommit();


    }


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
